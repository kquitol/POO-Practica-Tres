package ec.edu.ups.practica.tres.quitokaren.penasofia.vista.cantante;

import ec.edu.ups.practica.tres.quitokaren.penasofia.controlador.ControladorCantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cantante;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class VentanaListarCantante extends javax.swing.JInternalFrame {

    private ControladorCantante controladorCantante;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaListarPersona
     */
    public VentanaListarCantante(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
    }

    public void cambiarIdioma(Locale localizacion) {
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        btnCancelar.setText(mensajes.getString("btn.Cancelar"));
        String borderTitle = mensajes.getString("jpanel.listCant");
        Border border = BorderFactory.createTitledBorder(borderTitle);
        jPanel1.setBorder(border);
        DefaultTableModel model = (DefaultTableModel) tblPersonas.getModel();
        String codigo = mensajes.getString("lbl.codigo");
        String nombre = mensajes.getString("lbl.nombre");
        String apellido = mensajes.getString("lbl.codigo");
        String edad = mensajes.getString("lbl.edad");
        String nacionalidad = mensajes.getString("lbl.nacionalidad");
        String salario = mensajes.getString("lbl.salario");
        String nombreArtistico = mensajes.getString("lbl.nombreArtistico");
        String generoMusical = mensajes.getString("lbl.generoMusical");
        String numeroDeSencillos = mensajes.getString("lbl.nSencillos");
        String numeroDeConciertos = mensajes.getString("lbl.nConciertos");
        String numeroDeGiras = mensajes.getString("lbl.nGiras");
        model.setColumnIdentifiers(new String[]{codigo, nombre, apellido, edad, nacionalidad, salario, 
            nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(229, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listar Personas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Nombre Artistico", "Genero Musical", "N sencillos", "N conciertos", "N Giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblPersonas);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.cargarDatosTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cargarDatosTabla() {
        DefaultTableModel modelo = (DefaultTableModel) this.tblPersonas.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantantes = controladorCantante.listar();
        for (Cantante cantante : listaCantantes) {
            int codigoI = cantante.getCodigo();
            String codigo = String.valueOf(codigoI);
            String nombre = cantante.getNombre();
            String apellido = cantante.getApellido();
            int edadI = cantante.getEdad();
            String edad = String.valueOf(edadI);
            String nacionalidad = cantante.getNacionalidad();
            double salarioD = cantante.getSalario();
            String salario = String.valueOf(salarioD);
            String nombreArtistico = cantante.getNombreArtistico();
            String generoMusical = cantante.getGeneroMusical();
            String numeroDeSencillos = String.valueOf(cantante.getNumeroDeSencillos());
            String numeroDeConciertos = String.valueOf(cantante.getNumeroDeConciertos());
            String numeroDeGiras = String.valueOf(cantante.getNumeroDeGiras());

            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras};
            modelo.addRow(rowData);
        }
        this.tblPersonas.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables
}
