/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.RegistroCategoria;
import controlador.RegistroCliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Cliente;

/**
 *
 * @author Sebastian
 */
public class ActualizarCliente extends javax.swing.JFrame {

    String rutCliente, runSeleccionado;
    String nombre;
    String appaterno;
    String apmaterno;
    int categoria;
    String nomCategoria;
    RegistroCliente regcli = new RegistroCliente();
    /**
     * Creates new form EliminarCliente
     */
    public ActualizarCliente() {
        initComponents();
        desactivarTextBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblClientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbtnListar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jtxtRun = new javax.swing.JTextField();
        jbtnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtxtAPaterno = new javax.swing.JTextField();
        jtxtAMaterno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcmb_categoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jbtnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Cliente");

        jbtnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        jbtnCancelar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("RUN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Clientes"));

        jtblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUN", "Nombre", "Ap. Paterno", "Ap. Materno", "Categoria"
            }
        ));
        jtblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoColoColo.png"))); // NOI18N

        jbtnListar.setBackground(new java.awt.Color(0, 102, 255));
        jbtnListar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbtnListar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnListar.setText("Buscar");
        jbtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        jbtnLimpiar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnEditar.setBackground(new java.awt.Color(0, 102, 255));
        jbtnEditar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEditar.setText("Editar");
        jbtnEditar.setEnabled(false);
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jLabel6.setText("APELLIDO PATERNO");

        jLabel7.setText("APELLIDO MATERNO");

        jcmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jcmb_categoria.setToolTipText("Categoría del Cliente");

        jLabel1.setText("CATEGORÍA CLIENTE");

        jLabel8.setText("NOMBRE");

        jbtnActualizar.setBackground(new java.awt.Color(0, 102, 102));
        jbtnActualizar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setEnabled(false);
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jbtnListar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jtxtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtAMaterno)
                                .addComponent(jLabel1)
                                .addComponent(jcmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListarActionPerformed

        try {
            rutCliente = this.jtxtRun.getText();
        } catch (Exception e) {
            rutCliente = "";
        }
        
        mostrarTabla();

    }//GEN-LAST:event_jbtnListarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        limpiar();
        
        rutCliente = "";
        mostrarTabla();
        desactivarTextBox();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        activarTextBox();
        this.jbtnActualizar.setEnabled(true);
        this.jbtnEditar.setEnabled(false);
        this.jtxtNombre.requestFocus();
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jtblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblClientesMouseClicked

        int seleccionar = this.jtblClientes.rowAtPoint(evt.getPoint());

        //le asigno el run a la variable y activo el botón eliminar
        runSeleccionado = String.valueOf(this.jtblClientes.getValueAt(seleccionar, 0));
        this.jtxtNombre.setText(String.valueOf(this.jtblClientes.getValueAt(seleccionar, 1)));
        this.jtxtAPaterno.setText(String.valueOf(this.jtblClientes.getValueAt(seleccionar, 2)));
        this.jtxtAMaterno.setText(String.valueOf(this.jtblClientes.getValueAt(seleccionar, 3)));
        llenarCategoria(String.valueOf(this.jtblClientes.getValueAt(seleccionar, 4)));
        this.jbtnEditar.setEnabled(true);
        
    }//GEN-LAST:event_jtblClientesMouseClicked

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed
        int idcat;
        String nombre,appaterno, apmaterno, rutCli;
           
        
        nombre = this.jtxtNombre.getText();
        appaterno = this.jtxtAPaterno.getText();
        apmaterno = this.jtxtAMaterno.getText();
        idcat = this.jcmb_categoria.getSelectedIndex() + 1;
        
        Cliente cliente = new Cliente(runSeleccionado, nombre, appaterno, apmaterno, idcat);

        regcli.actualizar(cliente);
        JOptionPane.showMessageDialog(null, "Datos Actualizados", "Aviso", 2);
        limpiar();
        rutCliente = "";
        mostrarTabla();
        desactivarTextBox();
    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private String consultarCategoria(int idCat) {
        String cat;
        RegistroCategoria rc = new RegistroCategoria();
        Categoria categoria = rc.buscarPorId(idCat);
        cat = categoria.getNombreCategoria();

        return cat;
    }
    
    private void llenarCategoria(String cat) {
        String categoria;
        int idcategoria;
        RegistroCategoria rc = new RegistroCategoria();
        List<Categoria> lista = rc.buscarTodos();
        DefaultComboBoxModel valor = new DefaultComboBoxModel();
        this.jcmb_categoria.setModel(valor);
        for (Categoria categ : lista) {
            categoria = categ.getNombreCategoria();
            idcategoria = categ.getIdcategoria();
            valor.addElement(categoria);
            if (categoria.equalsIgnoreCase(cat)) {
                this.jcmb_categoria.setSelectedItem(cat);  
            }
              
        }
        

    }

    private void mostrarTabla() {
        RegistroCategoria regcat = new RegistroCategoria();
        DefaultTableModel modelo = (DefaultTableModel) this.jtblClientes.getModel();

        modelo.setRowCount(0);

        if (rutCliente.isEmpty()) {//listar todos
            List<Cliente> lista = regcli.buscarTodos();

            for (Cliente cliente : lista) {
                rutCliente = cliente.getRutCliente();
                nombre = cliente.getNombre();
                appaterno = cliente.getAppaterno();
                apmaterno = cliente.getApmaterno();
                categoria = cliente.getCategoria();

                nomCategoria = this.consultarCategoria(categoria);
                modelo.addRow(new Object[]{rutCliente, nombre, appaterno, apmaterno, nomCategoria});
            }

        } else { //listar por rut

            Cliente cliente = regcli.buscarPorRut(rutCliente);
            rutCliente = cliente.getRutCliente();
            nombre = cliente.getNombre();
            appaterno = cliente.getAppaterno();
            apmaterno = cliente.getApmaterno();
            categoria = cliente.getCategoria();

            nomCategoria = this.consultarCategoria(categoria);
            modelo.addRow(new Object[]{rutCliente, nombre, appaterno, apmaterno, nomCategoria});
        }
    }
    
    private void desactivarTextBox(){
        this.jtxtNombre.setEditable(false);
        this.jtxtAPaterno.setEditable(false);
        this.jtxtAMaterno.setEditable(false);
        this.jcmb_categoria.setEnabled(false);
    }
    
    private void activarTextBox(){
        this.jtxtNombre.setEditable(true);
        this.jtxtAPaterno.setEditable(true);
        this.jtxtAMaterno.setEditable(true);
        this.jcmb_categoria.setEnabled(true);
    }
    
    public void limpiar(){
        this.jtxtRun.setText("");
        this.jtxtNombre.setText("");
        this.jtxtAPaterno.setText("");
        this.jtxtAMaterno.setText("");
        this.jcmb_categoria.removeAllItems();
        this.jcmb_categoria.addItem("Seleccione");
        
        this.jtxtRun.requestFocus();
        this.jbtnActualizar.setEnabled(false);
        this.jbtnEditar.setEnabled(false);
        
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ActualizarCliente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnListar;
    private javax.swing.JComboBox<String> jcmb_categoria;
    private javax.swing.JTable jtblClientes;
    private javax.swing.JTextField jtxtAMaterno;
    private javax.swing.JTextField jtxtAPaterno;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtRun;
    // End of variables declaration//GEN-END:variables
}
