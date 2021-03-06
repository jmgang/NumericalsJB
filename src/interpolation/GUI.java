/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpolation;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import matrix.Array2D;

/**
 *
 * @author user
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form MainG
     */
    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        x0tf = new javax.swing.JTextField();
        findtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        computebt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        xtf = new javax.swing.JTextField();
        fxtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        answertf = new javax.swing.JTextField();
        vradio = new javax.swing.JRadioButton();
        fradio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Backward Difference Calculator\n");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setText("X values:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("X_0:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Answer:");

        computebt.setBackground(new java.awt.Color(255, 255, 255));
        computebt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        computebt.setText("Calculate Value");
        computebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computebtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("f(x) values:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Value: ");

        vradio.setText("Value");
        vradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vradioActionPerformed(evt);
            }
        });

        fradio.setText("Function");
        fradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fradioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(computebt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(vradio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fradio))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fxtf)
                        .addComponent(xtf)
                        .addComponent(x0tf)
                        .addComponent(findtf)
                        .addComponent(answertf, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addGap(308, 308, 308))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xtf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fxtf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x0tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findtf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vradio)
                    .addComponent(fradio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answertf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computebt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void computebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computebtActionPerformed
        if (!xtf.getText().trim().equals("") && !x0tf.getText().trim().equals("") && !findtf.getText().trim().equals("") && !fxtf.getText().trim().equals("")) {
            String x_values = xtf.getText().trim();
            String xfx_values = fxtf.getText().trim();
            System.out.println("all values: " + x_values + "\tfx values: " + xfx_values);

            System.out.println("xvalues: " + x_values);
            System.out.println("fxvalues: " + xfx_values);

            compute(x_values, xfx_values, x0tf.getText().trim(), findtf.getText().trim());

        } else {
            JOptionPane.showMessageDialog(this, "Input Error", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_computebtActionPerformed

    private void vradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vradioActionPerformed
        if (vradio.isSelected()) {
            fradio.setSelected(false);
            findtf.setEditable(true);
        }
    }//GEN-LAST:event_vradioActionPerformed

    private void fradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fradioActionPerformed
        if (fradio.isSelected()) {
            vradio.setSelected(false);
            findtf.setEditable(false);
        }
    }//GEN-LAST:event_fradioActionPerformed

    public void compute(String xvalues, String fxvalues, String x0f, String findtf) {

        HashMap<Double, Integer> map = new HashMap<>();
        ArrayList<Double> xs = new ArrayList<>();
        ArrayList<Double> fxs = new ArrayList<>();
        ArrayList<Double> keys = new ArrayList<>();
        ArrayList<Double> list = new ArrayList();
        ArrayList<Double> temp = new ArrayList();
        ArrayList<Double> masterList;
        double h = 1;
        String out = "";

        String[] fxx = fxvalues.split(",");
        String[] xv = xvalues.split(",");

        for (int i = 0; i < xv.length; i++) {
            map.put(Double.parseDouble(xv[i].trim()), i);
            keys.add(Double.parseDouble(xv[i].trim()));
        }

        for (int i = 0; i < fxx.length; i++) {
            list.add(Double.parseDouble(fxx[i].trim()));

        }

        masterList = new ArrayList(list);
        Array2D m = new Array2D(fxx.length, fxx.length);

        for (int i = 0; i < list.size(); i++) {
            m.setValueAt(0, i, list.get(i));
        }

        int ctr = 1;
        while (list.size() != 1) {
            for (int i = 0; i < list.size(); i++) {

                if ((i + 1) < list.size()) {
                    double diff = list.get(i + 1) - list.get(i);
                    temp.add(diff);
                    masterList.add(diff);
                    m.setValueAt(ctr, i, diff);

                    System.out.print(i + " ");

                }

            }

            System.out.println();

            list.clear();
            list = new ArrayList(temp);
            temp.clear();
            temp = new ArrayList();

            ctr++;
        }

        int size = 30;

        if (m.isIntervalEqual(keys)) {
            System.out.println("h: " + h);
            h = m.findInterval(keys);

            m.fixArray();
            System.out.println(m.toString());

            double x0 = Double.parseDouble(x0f);

            //check if x0 is part of the x values - later
            if (m.isX0inRange(x0, map)) {

                if(fradio.isSelected()){
                    answertf.setText(m.computeBackwardDifferencefx(x0, h, map));
                } else {
                    double findx = Double.parseDouble(findtf);
                    answertf.setText(m.computeBackwardDifference(x0, findx, h, map)+"");
                }

            } else {
                JOptionPane.showMessageDialog(this, "X_0 must be in the range of the x values!! ", "x0 Range Check Patrol", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please input points of equal interval!", "Interval Check Patrol", JOptionPane.ERROR_MESSAGE);
        }

    }

    public boolean checkIfEqualInterval() {
        return false;
    }

    public String removeLast(String str) {
        if (str.charAt(str.length() - 1) == ',') {
            System.out.println("substring: " + str.substring(0, str.length() - 1));
            return str.substring(0, str.length() - 1);
        }

        return str;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    // Set System L&F
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                    Font f = new Font("sans-serif", Font.BOLD, 12);

                    UIManager.put("", f);
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    // handle exception
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    // handle exception
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // handle exception
                    e.printStackTrace();
                }

                new GUI().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answertf;
    private javax.swing.JButton computebt;
    private javax.swing.JTextField findtf;
    private javax.swing.JRadioButton fradio;
    private javax.swing.JTextField fxtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton vradio;
    private javax.swing.JTextField x0tf;
    private javax.swing.JTextField xtf;
    // End of variables declaration//GEN-END:variables
}
