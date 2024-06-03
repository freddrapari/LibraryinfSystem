
package Libraryaccess;
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Booksinlibrary extends javax.swing.JFrame {

    /**
     * Creates new form Booksinlibrary
     */
    public Booksinlibrary() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtBOOKID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtTITLE = new javax.swing.JTextField();
        jtxtAUTHOR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtYEAR = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbtnADD = new javax.swing.JButton();
        jbtnDELETE = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbtnREFRESH = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BOOKS IN THE LIBRARY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 360, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("BOOK ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 90, -1));

        jtxtBOOKID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBOOKIDActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtBOOKID, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 10, 220, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("TITLE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 60, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("AUTHOR");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 105, 90, 40));
        jPanel2.add(jtxtTITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 60, 220, 30));

        jtxtAUTHOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAUTHORActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtAUTHOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 112, 220, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("YEAR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, -1));
        jPanel2.add(jtxtYEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 162, 220, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 360, 200));

        jPanel3.setBackground(new java.awt.Color(255, 0, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnADD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnADD.setText("ADD");
        jbtnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnADDActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, -1));

        jbtnDELETE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDELETE.setText("DELETE");
        jbtnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDELETEActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 300, 210));

        jbtnREFRESH.setBackground(new java.awt.Color(153, 255, 153));
        jbtnREFRESH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnREFRESH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BOOK ID", "AUTHOR", "TITTLE", "YEAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jbtnREFRESH);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 830, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtxtBOOKIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBOOKIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBOOKIDActionPerformed

    private void jbtnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDELETEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDELETEActionPerformed

    private void jtxtAUTHORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAUTHORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAUTHORActionPerformed

    private void jbtnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnADDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbtnADDActionPerformed

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
            java.util.logging.Logger.getLogger(Booksinlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booksinlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booksinlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booksinlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booksinlibrary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnADD;
    private javax.swing.JButton jbtnDELETE;
    private javax.swing.JTable jbtnREFRESH;
    private javax.swing.JTextField jtxtAUTHOR;
    private javax.swing.JTextField jtxtBOOKID;
    private javax.swing.JTextField jtxtTITLE;
    private javax.swing.JTextField jtxtYEAR;
    // End of variables declaration//GEN-END:variables
}