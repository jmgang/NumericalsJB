package matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;

/**
 *
 * @author user
 */
public class Array2D {

    private int row, column;
    private double[][] arr;

    public Array2D(int row, int column) {
        this.row = row;
        this.column = column;
        arr = new double[row][column];
        setMatrix(Double.MIN_VALUE);
    }

    private void setMatrix(double value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = value;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setValueAt(int row, int column, double value) {
        arr[row][column] = value;
    }

    public double getValueAt(int row, int column) {
        return arr[row][column];
    }

    public void fixArray() {
        int ctr = 1;
        int m = arr.length - ctr;

        while (m > 0) {
            if (m > 2) {
                if (arr[m][0] == arr[m][1]) {
                    for (int i = 2; i < arr.length; i++) {
                        arr[m][i] = arr[m][0];
                    }
                }
            }

            ctr++;
            m = arr.length - ctr;
        }

        m = arr.length - 1;

        if (arr[m][0] == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[m][i] = 0;
            }
        }

    }

    public ArrayList<Double> getAllValueColumnAt(int column) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i][column]);
        }

        return list;
    }

    public boolean checker(int column) {
        return !getAllValueColumnAt(column).contains(Double.MIN_VALUE);
    }

    public int findColumn(double x0, HashMap<Double, Integer> map) {
        return map.get(x0);
    }

    public double findInterval(ArrayList<Double> keys) {
        ArrayList<Double> newlist = new ArrayList<>();
        double minus = 1;
        
        for (int i = 0; i < keys.size(); i++) {
            if ((i + 1) < keys.size()) {
                minus = keys.get(i + 1) - keys.get(i);
                newlist.add(minus);
            }
        }
        
        return minus;
    }

    public void printList(ArrayList<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            
        }
    }

    public void printListPoly(ArrayList<PolynomialFunction> list) {
        
        for (int i = 0; i < list.size(); i++) {
            
        }
    }

    public boolean isIntervalEqual(ArrayList<Double> keys) {
        ArrayList<Double> newlist = new ArrayList<>();

        for (int i = 0; i < keys.size(); i++) {
            if ((i + 1) < keys.size()) {
                double minus = keys.get(i + 1) - keys.get(i);
                newlist.add(minus);
            }
        }

        printList(newlist);

        for (int j = 0; j < newlist.size(); j++) {
            if ((j + 1) < newlist.size()) {
                double minus = newlist.get(j + 1) - newlist.get(j);

                if (minus != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public double computeBackwardDifference(double x0, double value, double h, HashMap<Double, Integer> map) {
        double function = 0;
        double r = 0;
        ArrayList<Double> list = new ArrayList();

        if (h == 0) {
            //    h = 1;
        }

        r = (value - x0) / h;

        int column = findColumn(x0, map);

        

        if (checker(column)) {
            list = getAllValueColumnAt(column);
            function = list.get(0);

            
            

            for (int m = 1; m < list.size(); m++) {
                function += (getProduct(r, m) / factorial(m)) * list.get(m);

            }

        } else {
            int j = column;

            r = (value - x0) / h;

            for (int i = 0; i <= j || j >= 0; i++, j--) {
                list.add(arr[i][j]);
            }

            ArrayList<Double> temp = new ArrayList(map.keySet());
            Collections.sort(temp);
            ArrayList<Double> keys = reverseList(temp);

            printList(keys);

            ArrayList<Double> x_values = getXValues(x0, keys);

            function = list.get(0);

            

            for (int m = 1; m < list.size(); m++) {
                function += (getProduct(value, x_values, m) / (factorial(m) * Math.pow(h, m))) * list.get(m);

            }

            printList(list);
        }

        return function;
    }

    public String computeBackwardDifferencefx(double x0, double h, HashMap<Double, Integer> map) {
        PolynomialFunction function0;
        ArrayList<Double> list = new ArrayList();
        ArrayList<PolynomialFunction> partial = new ArrayList();
        PolynomialFunction fx = new PolynomialFunction(new double[]{0});

        int column = findColumn(x0, map);
        ArrayList<Double> open = new ArrayList<>(map.keySet());
        Collections.sort(open);
        list = getAllValueColumnAt(column);

        if (!checker(column)) {
            open = new ArrayList<>(reverseList(open));
            printList(open);

            int j = column;
            list.clear();
            list = new ArrayList();

            for (int i = 0; i <= j || j >= 0; i++, j--) {
                list.add(arr[i][j]);
            }

        }

        ArrayList<Double> x_values = getXValues(x0, open);

        function0 = new PolynomialFunction(new double[]{list.get(0)});

        for (int m = 1; m < list.size(); m++) {
            PolynomialFunction prod = getProductFx(x0, x_values, m);


            partial.add(prod.multiply(new PolynomialFunction(new double[]{list.get(m) / (factorial(m) * Math.pow(h, m))})));
        }
        printListPoly(partial);

        for (int j = 0; j < partial.size(); j++) {
            fx = fx.add(partial.get(j));
        }

        fx = fx.add(function0);

        return fx.toString();

    }
    
    public boolean isX0inRange(double x0, HashMap<Double, Integer> map){
        return map.get(x0) != null;
    }

    public ArrayList<Double> getXValues(double x0, ArrayList<Double> xval) {
        int index = 0;
        for (int i = 0; i < xval.size(); i++) {
            if (x0 == xval.get(i)) {
                index = i;
                break;
            }
        }
        printList(new ArrayList<>(xval.subList(index, xval.size())));

        return new ArrayList<>(xval.subList(index, xval.size()));
    }

    public ArrayList<Double> reverseList(ArrayList<Double> temp) {
        ArrayList<Double> keys = new ArrayList<>();
        for (int i = temp.size() - 1; i >= 0; i--) {
            keys.add(temp.get(i));
        }

        return keys;
    }

    public PolynomialFunction getProductFx(double x0, ArrayList<Double> keys, int index) {
        PolynomialFunction prod = new PolynomialFunction(new double[]{keys.get(0) * -1, 1});

        for (int i = 1; i < index; i++) {

            if (i < keys.size()) {
                
                prod = prod.multiply(new PolynomialFunction(new double[]{keys.get(i) * -1, 1}));
            }
        }

        return prod;
    }

    public double getProduct(double value, ArrayList<Double> keys, int index) {
        double prod = 1;

        for (int i = 0; i < index; i++) {
            prod = prod * (value - keys.get(i));

            
        }

        return prod;
    }

    public double getProduct(double value, int index) {
        double prod = value;

        if (index == 1) {
            return value;
        }

        for (int i = 1; i < index; i++) {
            prod = prod * --value;
        }

        return prod;
    }

    public double factorial(double value) {
        double prod = 1;

        for (int i = 1; i <= value; i++) {
            prod *= i;
        }

        return prod;
    }

    public void setListToMatrix(ArrayList<Double> list, int length) {
        int m = 0;
        int k = 0, y = 0;

        for (int i = 0; i < list.size(); i++) {
            
            if (i < length && k < row && y < column) {
                arr[k][y] = list.get(i);
            } else {
                k++;
                y = 0;
                arr[k][y] = list.get(i);
                m = length - 1;
                length = length + m;
            }
            y++;
        }
    }

    public String toString() {
        String s = "\t";

        for (int i = 0; i < arr.length; i++) {
            s += i + "\t";
        }

        s += "\n";

        for (int i = 0; i < arr.length; i++) {

            s += i + "\t";

            for (int j = 0; j < arr.length; j++) {
                s += arr[i][j] + "\t";
            }

            s += "\n";
        }

        return s;
    }

}
