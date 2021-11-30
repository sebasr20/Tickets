 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.RegistroEquipo;
import controlador.RegistroEvento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Equipo;
import modelo.Evento;

/**
 *
 * @author Sebastian
 */
public class CrearEvento extends javax.swing.JFrame {
        
    /**
     * Creates new form CrearEvento
     */
    public CrearEvento() {
        initComponents();
        llenarEquipos();
        desactivarTextBox();
        this.jbtnCancelar.requestFocus();
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtDescripcion = new javax.swing.JTextField();
        jlblLocal = new javax.swing.JLabel();
        jcmbEquipo = new javax.swing.JComboBox<>();
        jbtnGuardar = new javax.swing.JButton();
        jtxtFechaCampeonato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtDia = new javax.swing.JTextField();
        jtxtMes = new javax.swing.JTextField();
        jtxtYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbtnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jcbmHora = new javax.swing.JComboBox<>();
        jcbmMinuto = new javax.swing.JComboBox<>();
        jchkEstado = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jtxtLocal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbtnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("/");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Evento");
        setResizable(false);

        jLabel1.setText("LOCAL");

        jLabel2.setText("CAMPEONATO");

        jtxtDescripcion.setText("Campeonato PlanVital 2021");
        jtxtDescripcion.setToolTipText("");

        jlblLocal.setText("VS");

        jbtnGuardar.setBackground(new java.awt.Color(0, 102, 255));
        jbtnGuardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jtxtFechaCampeonato.setText("#");
        jtxtFechaCampeonato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFechaCampeonatoFocusGained(evt);
            }
        });

        jLabel3.setText("FECHA");

        jtxtDia.setText("DIA");
        jtxtDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtDiaFocusGained(evt);
            }
        });

        jtxtMes.setText("MES");
        jtxtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtMesFocusGained(evt);
            }
        });

        jtxtYear.setText("AÑO");
        jtxtYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtYearFocusGained(evt);
            }
        });

        jLabel7.setText("HORA");

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jLabel10.setText("JORNADA");

        jcbmHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        jcbmMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jchkEstado.setText("Disponible");
        jchkEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkEstadoActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoColoColo.png"))); // NOI18N

        jtxtLocal.setText("COLO COLO");

        jLabel5.setText("VISITA");

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Crear Evento - Partido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jcbmHora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbmMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(104, 104, 104)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(60, 60, 60)
                                .addComponent(jchkEstado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jtxtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblLocal)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jtxtFechaCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(269, 269, 269)
                                        .addComponent(jLabel5)
                                        .addGap(73, 73, 73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblLocal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtFechaCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbmMinuto)
                            .addComponent(jtxtYear)
                            .addComponent(jtxtMes)
                            .addComponent(jtxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbmHora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jchkEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        String equipoLocal,descripcionEvento,dia,mes,year,fechaStr,hora,minuto;
        int jornada;
        Date fechaEvento;
        String horaEvento;
        int visita;
        boolean disponible;
        //Nombre del Evento
        //nombreEvento = this.jtxtLocal.getText() + " vs " + this.jcmbEquipo.getSelectedItem();
        equipoLocal = this.jtxtLocal.getText();
        visita = this.jcmbEquipo.getSelectedIndex() + 1;
        
        //Fecha del Campeonato EJ. Fecha 33

        try {
            jornada = Integer.parseInt(this.jtxtFechaCampeonato.getText());
        } catch (NumberFormatException e) {
            jornada = 0;
        }
        
        
        descripcionEvento = this.jtxtDescripcion.getText();
        
        dia = this.jtxtDia.getText();
        mes = this.jtxtMes.getText();
        year = this.jtxtYear.getText();
        
        if (dia.isEmpty() || mes.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha", "Validación",1);
            this.jtxtDia.requestFocus();
            return;
        }
        
        fechaStr = dia+"/"+mes+"/"+year;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            fechaEvento = formato.parse(fechaStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato dd/mm/aaaa", "Validación",1);
            this.jtxtDia.requestFocus();
            return;
        }
        
        hora = this.jcbmHora.getSelectedItem().toString();
        minuto = this.jcbmMinuto.getSelectedItem().toString();
        
        if (hora.isEmpty() || minuto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese hora del evento", "Validación",1);
            this.jcbmHora.requestFocus();
            return;
        }
        
        horaEvento = hora+":"+minuto;
        
        disponible = this.jchkEstado.isSelected();
        
        //Evento evento = new Evento(0, nombreEvento, descripcionEvento, fechaEvento, horaEvento, visita, disponible);
        Evento evento = new Evento(0, equipoLocal, descripcionEvento, jornada, fechaEvento, horaEvento, visita, disponible);
        
        RegistroEvento re = new RegistroEvento();
        
        if (re.agregar(evento)) {
            JOptionPane.showMessageDialog(this, "Se agregó el evento", "Aviso",1);
            
            limpiar();
        }
        else{
            JOptionPane.showMessageDialog(this, "No se agregó el evento", "Aviso",1);
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jtxtFechaCampeonatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFechaCampeonatoFocusGained
        this.jtxtFechaCampeonato.setText("");
    }//GEN-LAST:event_jtxtFechaCampeonatoFocusGained

    private void jchkEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchkEstadoActionPerformed

    private void jtxtDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtDiaFocusGained
        if (this.jtxtDia.getText().equalsIgnoreCase("DIA")) {
            this.jtxtDia.setText("");
        }
    }//GEN-LAST:event_jtxtDiaFocusGained

    private void jtxtMesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtMesFocusGained
        if (this.jtxtMes.getText().equalsIgnoreCase("MES")) {
            this.jtxtMes.setText("");
        }
    }//GEN-LAST:event_jtxtMesFocusGained

    private void jtxtYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtYearFocusGained
        if (this.jtxtYear.getText().equalsIgnoreCase("AÑO")) {
            this.jtxtYear.setText("");
        }
    }//GEN-LAST:event_jtxtYearFocusGained

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void llenarEquipos() {
        String equipo;
        int idequipo;

        RegistroEquipo re = new RegistroEquipo();
        List<Equipo> lista = re.buscarTodos();
        DefaultComboBoxModel valor = new DefaultComboBoxModel();
        this.jcmbEquipo.setModel(valor);
        for (Equipo equipo1 : lista) {
            equipo = equipo1.getNombreEquipo();
            idequipo = equipo1.getIdEquipo();
            //valor.addElement(new Categoria(idcategoria, categoria));
            valor.addElement(equipo);
        }

    }
       
    public void limpiar(){

        this.jtxtFechaCampeonato.setText("#");
        this.jtxtDia.setText("DIA");
        this.jtxtMes.setText("MES");
        this.jtxtYear.setText("AÑO");
        this.jchkEstado.setSelected(false);
        this.jcmbEquipo.setSelectedIndex(0);
        this.jcbmHora.setSelectedIndex(0);
        this.jcbmMinuto.setSelectedIndex(0);
    }
    
    private void desactivarTextBox(){
        this.jtxtLocal.setEditable(false);
        this.jtxtDescripcion.setEditable(false);

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
//            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CrearEvento().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcbmHora;
    private javax.swing.JComboBox<String> jcbmMinuto;
    private javax.swing.JCheckBox jchkEstado;
    private javax.swing.JComboBox<String> jcmbEquipo;
    private javax.swing.JLabel jlblLocal;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtDia;
    private javax.swing.JTextField jtxtFechaCampeonato;
    private javax.swing.JTextField jtxtLocal;
    private javax.swing.JTextField jtxtMes;
    private javax.swing.JTextField jtxtYear;
    // End of variables declaration//GEN-END:variables
}
