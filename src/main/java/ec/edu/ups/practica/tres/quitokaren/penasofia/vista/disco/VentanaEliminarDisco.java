/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.tres.quitokaren.penasofia.vista.disco;

import ec.edu.ups.practica.tres.quitokaren.penasofia.controlador.ControladorCantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Disco;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class VentanaEliminarDisco extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    
    /**
     * Creates new form VentanaAgregarDisco
     */
    public VentanaEliminarDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
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
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblNombreArtisticoCant = new java.awt.Label();
        lblGeneroMusicalCant = new java.awt.Label();
        lblCodigo = new java.awt.Label();
        lblNombre = new java.awt.Label();
        lblApellido = new java.awt.Label();
        txtGeneroMusical = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCodigoDisco = new javax.swing.JTextField();
        txtNombreDisco = new javax.swing.JTextField();
        txtAnioLanzamientoDisco = new javax.swing.JTextField();
        lblCodigoDisco = new java.awt.Label();
        lblNombreDisco = new java.awt.Label();
        lblAnioLanzamientoDisco = new java.awt.Label();
        btnAceptar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(236, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Cantante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        txtCodigo.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(51, 102, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigo.setToolTipText("Ingrese el codigo del cantante");

        txtNombre.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 102, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.setToolTipText("");
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(51, 102, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtApellido.setToolTipText("");
        txtApellido.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNombreArtisticoCant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNombreArtisticoCant.setText("Nombre Artistico");

        lblGeneroMusicalCant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblGeneroMusicalCant.setText("Genero Musical");

        lblCodigo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblCodigo.setText("Codigo");

        lblNombre.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblApellido.setText("Apellido");

        txtGeneroMusical.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtGeneroMusical.setForeground(new java.awt.Color(51, 102, 255));
        txtGeneroMusical.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGeneroMusical.setToolTipText("");
        txtGeneroMusical.setEnabled(false);
        txtGeneroMusical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroMusicalActionPerformed(evt);
            }
        });

        txtNombreArtistico.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNombreArtistico.setForeground(new java.awt.Color(51, 102, 255));
        txtNombreArtistico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreArtistico.setToolTipText("");
        txtNombreArtistico.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGeneroMusicalCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreArtisticoCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreArtisticoCant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreArtistico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGeneroMusicalCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(236, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Eliminar Disco", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        txtCodigoDisco.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtCodigoDisco.setForeground(new java.awt.Color(51, 102, 255));
        txtCodigoDisco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigoDisco.setToolTipText("Ingrese el codigo del cantante");

        txtNombreDisco.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNombreDisco.setForeground(new java.awt.Color(51, 102, 255));
        txtNombreDisco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreDisco.setToolTipText("");
        txtNombreDisco.setEnabled(false);

        txtAnioLanzamientoDisco.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtAnioLanzamientoDisco.setForeground(new java.awt.Color(51, 102, 255));
        txtAnioLanzamientoDisco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAnioLanzamientoDisco.setToolTipText("");
        txtAnioLanzamientoDisco.setEnabled(false);
        txtAnioLanzamientoDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioLanzamientoDiscoActionPerformed(evt);
            }
        });

        lblCodigoDisco.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblCodigoDisco.setText("Codigo");

        lblNombreDisco.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNombreDisco.setText("Nombre");

        lblAnioLanzamientoDisco.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAnioLanzamientoDisco.setText("Año de lanzamiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnioLanzamientoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAnioLanzamientoDisco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreDisco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoDisco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 342, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnioLanzamientoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnioLanzamientoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCodigoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigoS = txtCodigo.getText();
        int codigo = Integer.parseInt(codigoS);
        Cantante cantante = controladorCantante.buscar(codigo);
        if (cantante != null){
            txtNombre.setText(cantante.getNombre());
            txtApellido.setText(cantante.getApellido());
            txtNombreArtistico.setText(cantante.getNombreArtistico());
            txtGeneroMusical.setText(cantante.getGeneroMusical());
            this.cambiarEstadoCampos(true);
        } else {
            JOptionPane.showMessageDialog(this, "El cantante con codigo " + codigo + " no ha sido encontrado!");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtGeneroMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroMusicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroMusicalActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        this.limpiarCampos();
        //this.cambiarEstadoCampos(false);
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtAnioLanzamientoDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioLanzamientoDiscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioLanzamientoDiscoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int codigoC = Integer.parseInt(txtCodigo.getText());
        int codigoDisco = Integer.parseInt(txtCodigoDisco.getText());
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar el disco?");
        if(respuesta == JOptionPane.YES_OPTION){
            if(controladorCantante.eliminarDisco(codigoC, codigoDisco)){
                JOptionPane.showMessageDialog(this, "El disco ha sido eliminada exitosamente! :)");
                this.limpiarCampos();                
            }else{
                JOptionPane.showMessageDialog(this, "La persona no ha sido eliminada! :(");
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

       private void limpiarCampos(){
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtNombreArtistico.setText("");
        this.txtGeneroMusical.setText("");
        this.txtCodigoDisco.setText("");
        this.txtNombreDisco.setText("");
        this.txtAnioLanzamientoDisco.setText("");
    }
           private void cambiarEstadoCampos(boolean estado) {
        this.txtCodigo.setEnabled(!estado);
        this.txtCodigoDisco.setEnabled(estado);
        this.txtNombreDisco.setEnabled(estado);
        this.txtAnioLanzamientoDisco.setEnabled(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label lblAnioLanzamientoDisco;
    private java.awt.Label lblApellido;
    private java.awt.Label lblCodigo;
    private java.awt.Label lblCodigoDisco;
    private java.awt.Label lblGeneroMusicalCant;
    private java.awt.Label lblNombre;
    private java.awt.Label lblNombreArtisticoCant;
    private java.awt.Label lblNombreDisco;
    private javax.swing.JTextField txtAnioLanzamientoDisco;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoDisco;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreDisco;
    // End of variables declaration//GEN-END:variables
}
