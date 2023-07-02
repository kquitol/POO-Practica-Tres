/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.tres.quitokaren.penasofia.vista.cantante;

/*import ec.edu.ups.java.ejemplo.diez.controlador.PersonaControlador;
import ec.edu.ups.java.ejemplo.diez.modelo.Persona;
import java.text.SimpleDateFormat;*/
import ec.edu.ups.practica.tres.quitokaren.penasofia.controlador.ControladorCantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cantante;
import javax.swing.JOptionPane;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class VentanaBuscarCantante extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;

    /**
     * Creates new form VentanaBuscarPersona
     */
    public VentanaBuscarCantante(ControladorCantante controladorCantante) {
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
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblNSencillosCant = new java.awt.Label();
        lblEdad = new java.awt.Label();
        lblNacionalidadCant = new java.awt.Label();
        lblSalarioCant = new java.awt.Label();
        lblNombreArtisticoCant = new java.awt.Label();
        lblGeneroMusicalCant = new java.awt.Label();
        lblCodigo = new java.awt.Label();
        lblNombre = new java.awt.Label();
        lblApellido = new java.awt.Label();
        lblNConciertosCant = new java.awt.Label();
        lblNGirasCant = new java.awt.Label();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        txtNSencillos = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtNConciertos = new javax.swing.JTextField();
        txtNGiras = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
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
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNSencillosCant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNSencillosCant.setText("Numero de Sencillos");

        lblEdad.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblEdad.setText("Edad");

        lblNacionalidadCant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNacionalidadCant.setText("Nacionalidad");

        lblSalarioCant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSalarioCant.setText("Salario");

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

        lblNConciertosCant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNConciertosCant.setText("Numero de Conciertos");

        lblNGirasCant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNGirasCant.setText("Numero de Giras");

        txtEdad.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(51, 102, 255));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEdad.setToolTipText("");
        txtEdad.setEnabled(false);

        txtNacionalidad.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNacionalidad.setForeground(new java.awt.Color(51, 102, 255));
        txtNacionalidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNacionalidad.setToolTipText("");
        txtNacionalidad.setEnabled(false);

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

        txtNSencillos.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNSencillos.setForeground(new java.awt.Color(51, 102, 255));
        txtNSencillos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNSencillos.setToolTipText("");
        txtNSencillos.setEnabled(false);
        txtNSencillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNSencillosActionPerformed(evt);
            }
        });

        txtSalario.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(51, 102, 255));
        txtSalario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSalario.setToolTipText("");
        txtSalario.setEnabled(false);
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtNombreArtistico.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNombreArtistico.setForeground(new java.awt.Color(51, 102, 255));
        txtNombreArtistico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreArtistico.setToolTipText("");
        txtNombreArtistico.setEnabled(false);

        txtNConciertos.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNConciertos.setForeground(new java.awt.Color(51, 102, 255));
        txtNConciertos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNConciertos.setToolTipText("");
        txtNConciertos.setEnabled(false);

        txtNGiras.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        txtNGiras.setForeground(new java.awt.Color(51, 102, 255));
        txtNGiras.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNGiras.setToolTipText("");
        txtNGiras.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalarioCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGeneroMusicalCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreArtisticoCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacionalidadCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar)
                            .addComponent(btnBuscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNSencillosCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNGirasCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNConciertosCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNacionalidadCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSalarioCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNSencillosCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNConciertosCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNGirasCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNGiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreArtisticoCant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGeneroMusicalCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGap(48, 48, 48)
                .addComponent(btnCancelar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtNSencillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNSencillosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNSencillosActionPerformed

    private void txtGeneroMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroMusicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroMusicalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigoS = txtCodigo.getText();
        int codigo = Integer.parseInt(codigoS);
        Cantante cantan = controladorCantante.buscar(codigo);
        if (cantan != null){
            txtNombre.setText(cantan.getNombre());
            txtApellido.setText(cantan.getApellido());
            txtEdad.setText(String.valueOf(cantan.getEdad()));
            txtNacionalidad.setText(cantan.getNacionalidad());
            txtSalario.setText(String.valueOf(cantan.calcularSalario()));
            txtNombreArtistico.setText(cantan.getNombreArtistico());
            txtGeneroMusical.setText(cantan.getGeneroMusical());
            txtNSencillos.setText(String.valueOf(cantan.getNumeroDeSencillos()));
            txtNConciertos.setText(String.valueOf(cantan.getNumeroDeConciertos()));
            txtNGiras.setText(String.valueOf(cantan.getNumeroDeGiras()));
        } else {
            JOptionPane.showMessageDialog(this, "La persona con codigo " + codigo + " no ha sido encontrada!");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void limpiarCampos(){
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtEdad.setText("");
        this.txtNacionalidad.setText("");
        this.txtSalario.setText("");
        this.txtNombreArtistico.setText("");
        this.txtGeneroMusical.setText("");
        this.txtNSencillos.setText("");
        this.txtNConciertos.setText("");
        this.txtNGiras.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label lblApellido;
    private java.awt.Label lblCodigo;
    private java.awt.Label lblEdad;
    private java.awt.Label lblGeneroMusicalCant;
    private java.awt.Label lblNConciertosCant;
    private java.awt.Label lblNGirasCant;
    private java.awt.Label lblNSencillosCant;
    private java.awt.Label lblNacionalidadCant;
    private java.awt.Label lblNombre;
    private java.awt.Label lblNombreArtisticoCant;
    private java.awt.Label lblSalarioCant;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNConciertos;
    private javax.swing.JTextField txtNGiras;
    private javax.swing.JTextField txtNSencillos;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
