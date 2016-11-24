/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographyws1;

/**
 *
 * @author wl2-lam
 */
import java.io.*;
import java.security.*;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("ISBN Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Credit Card Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("BCHgenerator");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setText("BCHdecoder");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("SHA-1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextField1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        s = jTextField1.getText();
        d[0] = Integer.parseInt(String.valueOf(s.charAt(0)));
        d[1] = Integer.parseInt(String.valueOf(s.charAt(1)));
        d[2] = Integer.parseInt(String.valueOf(s.charAt(2)));
        d[3] = Integer.parseInt(String.valueOf(s.charAt(3)));
        d[4] = Integer.parseInt(String.valueOf(s.charAt(4)));
        d[5] = Integer.parseInt(String.valueOf(s.charAt(5)));
        d[6] = Integer.parseInt(String.valueOf(s.charAt(6)));
        d[7] = Integer.parseInt(String.valueOf(s.charAt(7)));
        d[8] = Integer.parseInt(String.valueOf(s.charAt(8)));
        d[9] = s.charAt(9);
        if (d[9] == 'x' || d[9] == 'X') {
            d[9] = 10;
        } else {
            d[9] = Integer.parseInt(String.valueOf(s.charAt(9)));
        }

        int cal = (d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8] + 10 * d[9]) % 11;
        if (cal == 0) {
            jTextArea1.setText("vaild\n" + s);

        } else {
            jTextArea1.setText("invaild");
        }

        }catch(NumberFormatException e1){
            jTextArea1.setText("please input number");
        }
        
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            s = jTextField1.getText();
            for (int i = 0; i < s.length(); i++) {
                d[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            for (int x = 0; x < d.length; x += 2) {
                int check = d[x] + d[x];

                if (check >= 10) {
                    check = check - 9;
                }

                d[x] = check;

            }

            int cal = (d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9] + d[10] + d[11] + d[12] + d[13] + d[14] + d[15]);
            cal = cal % 10;

            if (cal == 0) {
                jTextArea1.setText("vaild");

            } else {
                jTextArea1.setText("not vaild");
            }
        } catch (NumberFormatException e) {
            jTextArea1.setText("please enter correct information");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
        s = jTextField1.getText();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            d[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        d[6] = (4 * d[0] + 10 * d[1] + 9 * d[2] + 2 * d[3] + d[4] + 7 * d[5]) % 11;
        d[7] = (7 * d[0] + 8 * d[1] + 7 * d[2] + d[3] + 9 * d[4] + 6 * d[5]) % 11;
        d[8] = (9 * d[0] + d[1] + 7 * d[2] + 8 * d[3] + 7 * d[4] + 7 * d[5]) % 11;
        d[9] = (d[0] + 2 * d[1] + 9 * d[2] + 10 * d[3] + 4 * d[4] + d[5]) % 11;
        for (int i = 6; i < d.length; i++) {
            if (d[i] >= 10) {
                flag = false;

            }
        }

        if (flag == false) {
            jTextArea1.setText("unusable number");

        } else {
            jTextArea1.setText("vaild");
            jTextArea1.setText("the number generated will be" + d[0] + "" + d[1] + "" + d[2] + "" + d[3] + "" + d[4] + "" + d[5] + "" + d[6] + "" + d[7] + "" + d[8] + "" + d[9]);
        }
        }catch(NumberFormatException e1){
            jTextArea1.setText("please another correct information");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
        s = jTextField1.getText();
        int s1, s2, s3, s4, s5, s6, temp;
        s1 = s2 = s3 = s4 = s5 = s6 = temp = 0;
        double p, q, r, a, b,    temp1, i;
        p = q = r = a = b =    temp1 = i = 0;

        for (int j = 0; j < s.length(); j++) {
            d[j] = Integer.parseInt(String.valueOf(s.charAt(j)));
        }
        s1 = (d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9]) % 11;
        s2 = ((d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8] + 10 * d[9]) % 11);
        s3 = ((d[0] + 4 * d[1] + 9 * d[2] + 5 * d[3] + 3 * d[4] + 3 * d[5] + 5 * d[6] + 9 * d[7] + 4 * d[8] + d[9]) % 11);
        s4 = ((d[0] + 8 * d[1] + 5 * d[2] + 9 * d[3] + 4 * d[4] + 7 * d[5] + 2 * d[6] + 6 * d[7] + 3 * d[8] + 10 * d[9]) % 11);
        System.out.println(s1 + "" + s2 + "" + s3 + "" + s4);
        if (s1 == 0 && s2 == 0 && s3 == 0 && s4 == 0) {
            jTextArea1.setText("no error detect");
        } else {

            p = ((s2 * s2) - (s1 * s3));

            p = p % 11;
            if (0 > p) {
                p = neg((int) p);
            }
            q = ((s1 * s4) - (s2 * s3));

            q = q % 11;
            if (0 > q) {
                q = neg((int) q);
            }
            r = ((s3 * s3) - (s2 * s4));
            r = r % 11;
            if (0 > r) {
                r = neg((int) r);
            }
            System.out.println(p + "," + q + "," + r);
            if (p == 0 && q == 0 && r == 0) {
                s5 = divide(s1);
                s6 = ((s2 * s5) % 11);
                if (s6 < 1) {
                    jTextArea1.setText("more than 2 error detected");
                }
                d[s6 - 1] = d[s6 - 1] - s1;

                jTextArea1.setText("single error detected with magniude of " + s1 + " in the digit " + s6 + "\nand the revisied number is " + d[0] + "" + d[1] + "" + d[2] + "" + d[3] + "" + d[4] + "" + d[5] + "" + d[6] + "" + d[7] + "" + d[8] + "" + d[9]);

            } else {

                temp = (int) ((q * q) - (4 * p * r));
                temp = temp % 11;
                if (0 > temp) {
                    temp = neg(temp);
                }
                temp = sqrt(temp);
                System.out.println(temp);
                if (temp == -1) {
                    jTextArea1.setText("more than 2 error detected");

                } else {
                    temp1 = (-q + temp) % 11;
                    if (temp1 < 0) {
                        temp1 = neg((int) temp1);
                    }
                    a = (2 * p) % 11;
                    if (a < 0) {
                        a = neg((int) a);
                    }
                    a = divide((int) a);
                    temp1 = a * temp1;
                    i = temp1 % 11;
                    temp1 = 0;
                    temp1 = (-q - temp) % 11;
                    if (temp1 < 0) {
                        temp1= neg((int) temp1);
                    }

                    double j = a * temp1;
                    j = j % 11;
                    temp1=0;
                    temp1 = (i - j) % 11;
                    if (0 > temp1) {
                        temp1 = neg((int) temp1);
                    }

                    temp1 = divide((int) temp1);
                    b = ((i * s1) - s2) % 11;
                    if (0 > b) {
                        b = neg((int) b);
                    }

                    b = (b * temp1);
                    b = b % 11;
                    a=0;
                    a = (s1 - b) % 11;
                    if (a < 0) {
                        a = neg((int) a);
                    }
                    System.out.println(b);

                    System.out.println(i + "," +j+ "," + b + "," + a);
                    int ii = (int) i;
                    int ji = (int) j;
                    if (d[ii - 1] > a) {
                        d[ii - 1] = d[ii - 1] - (int) a;
                    } else {
                        d[ii - 1] = (d[ii - 1] + 11) - (int) a;
                    }

                    if (d[ji - 1] > b) {
                        d[ji - 1] = d[ji - 1] - (int) b;
                    } else {
                        System.out.println(d[ji - 1]);
                        d[ji - 1] = (d[ji - 1] + 11) - (int) b;
                    }

                    jTextArea1.setText("two error detected in prosition " + ii + " , " + ji + " with magnitude " + (int) a + " , " + (int) b + "\n the corrected number is" + d[0] + "" + d[1] + "" + d[2] + "" + d[3] + "" + d[4] + "" + d[5] + "" + d[6] + "" + d[7] + "" + d[8] + "" + d[9]);
                }
            }

        }
       }catch(NumberFormatException e1){
           jTextArea1.setText("please enter correct information");
       }catch(ArrayIndexOutOfBoundsException e2){
           jTextArea1.setText("more than 2 error");
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        s = jTextField1.getText();
        try {
            jTextArea1.setText("SHA1 hash of string: " + PasswordDemo.SHA1(s));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        }
        // TODO Auto-generated catch block

    }//GEN-LAST:event_jButton6ActionPerformed
    private static String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }

    public static String SHA1(String text)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md;
        md = MessageDigest.getInstance("SHA-1");
        byte[] sha1hash = new byte[40];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        sha1hash = md.digest();
        return convertToHex(sha1hash);
    }

    public int neg(int i) {
        int input = i;
        switch (input) {
            case -1:
                return 10;
            case -2:
                return 9;
            case -3:
                return 8;
            case -4:
                return 7;
            case -5:
                return 6;
            case -6:
                return 5;
            case -7:
                return 4;
            case -8:
                return 3;
            case -9:
                return 2;
            case -10:
                return 1;
            default:
                return 0;
        }
    }

    public int square(int i) {
        int input = i;
        switch (input) {
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 9;
            case 4:
                return 5;
            case 5:
                return 3;
            case 6:
                return 3;
            case 7:
                return 5;
            case 8:
                return 9;
            case 9:
                return 4;
            case 10:
                return 1;
            default:
                return 0;
        }
    }

    public int divide(int i) {
        int input = i;
        switch (input) {
            case 1:
                return 1;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 9;
            case 6:
                return 2;
            case 7:
                return 8;
            case 8:
                return 7;
            case 9:
                return 5;
            case 10:
                return 10;
            default:
                return 0;
        }

    }

    public int sqrt(int i) {
        int input = i;
        switch (input) {
            case 1:
                return 1;

            case 3:
                return 5;
            case 4:
                return 2;
            case 5:
                return 4;

            case 9:
                return 3;
            case 0:
                return 0;

            default:
                return -1;
        }
    }

    /**
     * @param args the command line arguments
     */
    private static String s = "";
    private final int[] d = new int[16];

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
