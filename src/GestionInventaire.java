
import formulaire.Inventaire.Inventaire;
import java.awt.Cursor;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OBAM
 */
public class GestionInventaire extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionStock
     */
    public GestionInventaire() {
        //this.setU setUndecorated(true);
        initComponents();
        getContentPane().setBackground(new java.awt.Color(51, 51, 51));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(null);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(765, 600));
        setMinimumSize(new java.awt.Dimension(765, 600));
        setPreferredSize(new java.awt.Dimension(765, 600));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Gestion Des Inventaires");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 10, 309, 29);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/201558.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 0, 130, 110);

        jLabel5.setBackground(new java.awt.Color(0, 102, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nouvel");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 200, 80, 22);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(10, 120, 740, 10);

        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton17MouseExited(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(350, 290, 91, 50);

        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(350, 150, 91, 50);

        jLabel8.setBackground(new java.awt.Color(0, 153, 204));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Inventaires");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 130, 180, 20);

        jLabel11.setBackground(new java.awt.Color(0, 153, 204));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tables des Inventaires");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 340, 180, 22);

        jList4.setBackground(new java.awt.Color(51, 51, 51));
        jList4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList4.setForeground(new java.awt.Color(255, 255, 255));
        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "       Liste de tous les Articles", "Enregistrement de nouveaux articles", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jList4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(280, 380, 270, 60);

        jList5.setBackground(new java.awt.Color(51, 51, 51));
        jList5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList5.setForeground(new java.awt.Color(255, 255, 255));
        jList5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "       Liste de tous les Articles", "Enregistrement de nouveaux articles", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(jList5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(40, 40, 270, 70);

        jList6.setBackground(new java.awt.Color(51, 51, 51));
        jList6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 10)); // NOI18N
        jList6.setForeground(new java.awt.Color(255, 255, 255));
        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "       Liste de tous les Articles", "Enregistrement de nouveaux articles", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(jList6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(260, 220, 270, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MouseExited

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        Inventaire inv= new Inventaire(new JFrame(),true) ;
        inv.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseExited

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JList jList6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
