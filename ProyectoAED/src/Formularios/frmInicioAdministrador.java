/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import ListasEnlazadas.ListaCurso;

/**
 *
 * @author oscar
 */
public class frmInicioAdministrador extends javax.swing.JFrame {

    frmMenu menu;
    ListaCurso LC;
    frmRegistroUsuario nuevoUsuario;
    public frmInicioAdministrador(frmMenu menu) {
        initComponents();
        this.menu=menu;
        LC=menu.LC;
        nuevoUsuario=menu.RU;
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
        btnCrearCurso = new javax.swing.JButton();
        btnCrearAula = new javax.swing.JButton();
        btnRegistrarNuevoU = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bienvenido administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 38, -1, -1));

        btnCrearCurso.setText("Crear curso");
        btnCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCursoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 155, -1));

        btnCrearAula.setText("Crear aula");
        btnCrearAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 155, -1));

        btnRegistrarNuevoU.setText("Registrar nuevo usuario");
        btnRegistrarNuevoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoUActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarNuevoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoActionPerformed
        // TODO add your handling code here:
        frmNuevoCurso nuevoCurso=new frmNuevoCurso(LC,menu,this);
        dispose();
        nuevoCurso.setVisible(true);
    }//GEN-LAST:event_btnCrearCursoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCrearAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAulaActionPerformed
        // TODO add your handling code here:
        frmNuevaSeccion nuevaAula=new frmNuevaSeccion(menu,this);
        dispose();
        nuevaAula.setVisible(true);
    }//GEN-LAST:event_btnCrearAulaActionPerformed

    private void btnRegistrarNuevoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoUActionPerformed
        // TODO add your handling code here:
        dispose();
        nuevoUsuario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarNuevoUActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearAula;
    private javax.swing.JButton btnCrearCurso;
    private javax.swing.JButton btnRegistrarNuevoU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
