/*
 
*Programmer : Amal Assem Dora .
*experience :2 Years in Java programming language .
*Education : fourth year in computer science departement in faculty of electronic engineering (2019/2020).
*THis code to generate a cryptographic system by using technique caesar cipher & playfair cipher .

 */
package Encryption_Techniques;

import javax.swing.JOptionPane;

public class Encryption_Techniques_form extends javax.swing.JFrame {

    /**
     * Creates new form Encryption_Techniques_form
     */
    public Encryption_Techniques_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        plain = new javax.swing.JTextField();
        cipher = new javax.swing.JTextField();
        encrypt = new javax.swing.JButton();
        decrypt = new javax.swing.JButton();
        key = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Function_Combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encryption Techniques");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Plain Text :");

        jLabel2.setText("Cipher Text :");

        plain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainActionPerformed(evt);
            }
        });

        cipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cipherActionPerformed(evt);
            }
        });

        encrypt.setText("Encrypt");
        encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptActionPerformed(evt);
            }
        });

        decrypt.setText("Decrypt");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel3.setText("Keyword :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose technique", "Caesar Cipher", "Playfair Cipher", "Feistel Cipher", "DES", "RC4", "RSA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Made by: Amal Assem");

        Function_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose function", "AND", "OR", "XOR" }));
        Function_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Function_ComboActionPerformed(evt);
            }
        });

        jLabel5.setText("If choose feistel cipher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(386, 386, 386))
                            .addComponent(plain, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cipher, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(135, 135, 135))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Function_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addContainerGap()))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(encrypt)
                .addGap(186, 186, 186)
                .addComponent(decrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plain, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(cipher, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Function_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encrypt)
                    .addComponent(decrypt)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plainActionPerformed

    private void cipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cipherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cipherActionPerformed

    private void encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptActionPerformed
        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the choice technology .", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jComboBox1.getSelectedIndex() == 1) {
            String f;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be integer.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(plain.getText().equals(""))) {
                f = CaesarCipher.encrypt_Caeser(plain.getText(), Integer.parseInt(key.getText()) % 26);
                cipher.setText(f);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to "
                        + "be encoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (jComboBox1.getSelectedIndex() == 2) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(plain.getText().equals(""))) {
                PlayFairCipher playfair = new PlayFairCipher();
                s = playfair.encode_Playfair(plain.getText(), key.getText());
                cipher.setText(s);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to"
                        + " be encoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (jComboBox1.getSelectedIndex() == 3) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(plain.getText().equals(""))) {
                s = Feistel.FeistelCipher(plain.getText(), key.getText(), Function_Combo.getSelectedItem().toString());
                cipher.setText(s);
            } else if (Function_Combo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Enter the function ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to be decoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (jComboBox1.getSelectedIndex() == 4) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(plain.getText().equals(""))) {
                s = DES.encription(plain.getText(), key.getText());
                cipher.setText(s);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to"
                        + " be encoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (jComboBox1.getSelectedIndex() == 5) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(plain.getText().equals(""))) {
                s = RC4.Encryption_Decryption(plain.getText(), key.getText());
                cipher.setText(s);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to"
                        + " be encoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (jComboBox1.getSelectedIndex() == 6) {
            if (!(plain.getText().equals(""))) {
                RSA rsa = new RSA();

                System.out.println("plain : " + plain.getText());
                String f = rsa.RSA(4, plain.getText(), "e");
                cipher.setText(f);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_encryptActionPerformed

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the choice technology ."
                    + "", "Error", JOptionPane.ERROR_MESSAGE);

        }//caesar decryption
        else if (jComboBox1.getSelectedIndex() == 1) {
            String f;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be integer.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(cipher.getText().equals(""))) {
                f = CaesarCipher.decrypt_Caeser(cipher.getText(), Integer.parseInt(key.getText()) % 26);
                plain.setText(f);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to "
                        + "be decoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } //playfair decryption
        else if (jComboBox1.getSelectedIndex() == 2) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(cipher.getText().equals(""))) {
                PlayFairCipher playfair = new PlayFairCipher();
                s = playfair.decode_Playfair(cipher.getText(), key.getText());
                plain.setText(s);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to be "
                        + "decoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            //fiestel cipher
        } else if (jComboBox1.getSelectedIndex() == 3) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(cipher.getText().equals(""))) {
                s = Feistel.FeistelCipher(cipher.getText(), key.getText(), Function_Combo.getSelectedItem().toString());
                plain.setText(s);
            } else if (Function_Combo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Enter the function ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to be "
                        + "decoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            //des cipher
        } else if (jComboBox1.getSelectedIndex() == 4) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(cipher.getText().equals(""))) {
                s = DES.decription(cipher.getText(), key.getText());
                plain.setText(s);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to be "
                        + "decoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            //rc4 cipher
        } else if (jComboBox1.getSelectedIndex() == 5) {
            String s;
            if (key.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter the keyword please!"
                        + "\nkeyword must be string.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(cipher.getText().equals(""))) {
                s = RC4.Encryption_Decryption(cipher.getText(), key.getText());
                plain.setText(s);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text you want to be "
                        + "decoded ,please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            //RSA cipher
        } else if (jComboBox1.getSelectedIndex() == 6) {
            if (!(cipher.getText().equals(""))) {
                RSA rsa = new RSA();
                System.out.println("cipher : " + cipher.getText());
                String f = rsa.RSA(4, cipher.getText(), "D");
                plain.setText(f);
            } else {
                JOptionPane.showMessageDialog(null, "Enter the text please!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_decryptActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        plain.setText("");
        key.setText("");
        cipher.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_clearActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Function_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Function_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Function_ComboActionPerformed

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
            java.util.logging.Logger.getLogger(Encryption_Techniques_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encryption_Techniques_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encryption_Techniques_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encryption_Techniques_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encryption_Techniques_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Function_Combo;
    private javax.swing.JTextField cipher;
    private javax.swing.JButton clear;
    private javax.swing.JButton decrypt;
    private javax.swing.JButton encrypt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField key;
    private javax.swing.JTextField plain;
    // End of variables declaration//GEN-END:variables
}
