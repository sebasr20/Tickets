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
import javax.swing.table.DefaultTableModel;
import modelo.Equipo;
import modelo.Evento;

/**
 *
 * @author Sebastian
 */
public class ActualizarEvento extends javax.swing.JFrame {

    private int idEvento, jornada, idVisita;
    private String equipoLocal, descripcionEvento, horaEvento, nomVisita;
    private Date fechaEvento;
    private boolean disponible;

    /**
     * Creates new form ListarEvento
     */
    public ActualizarEvento() {
        initComponents();
        cargarTabla();

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
        jLabel3 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtnEditar = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblListarEventos = new javax.swing.JTable();
        jbtnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtLocal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcmbEquipo = new javax.swing.JComboBox<>();
        jlblLocal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtFechaCampeonato = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtDia = new javax.swing.JTextField();
        jtxtMes = new javax.swing.JTextField();
        jtxtYear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbmHora = new javax.swing.JComboBox<>();
        jcbmMinuto = new javax.swing.JComboBox<>();
        jchkEstado = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de Eventos");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoColoColo.png"))); // NOI18N

        jLabel2.setText("BUSCAR EVENTO");

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

        jbtnBuscar.setBackground(new java.awt.Color(0, 102, 255));
        jbtnBuscar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Editar Eventos Programados");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eventos Programados"));

        jtblListarEventos.setBackground(new java.awt.Color(255, 255, 255));
        jtblListarEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Visita", "Jornada", "Fecha", "Hora", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblListarEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblListarEventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblListarEventos);
        if (jtblListarEventos.getColumnModel().getColumnCount() > 0) {
            jtblListarEventos.getColumnModel().getColumn(0).setPreferredWidth(5);
            jtblListarEventos.getColumnModel().getColumn(1).setPreferredWidth(60);
            jtblListarEventos.getColumnModel().getColumn(3).setPreferredWidth(10);
            jtblListarEventos.getColumnModel().getColumn(4).setPreferredWidth(10);
            jtblListarEventos.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        jLabel4.setText("LOCAL");

        jtxtLocal.setEnabled(false);

        jLabel5.setText("VISITA");

        jcmbEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Equipo" }));
        jcmbEquipo.setToolTipText("");
        jcmbEquipo.setEnabled(false);

        jlblLocal.setText("VS");

        jLabel10.setText("JORNADA");

        jtxtFechaCampeonato.setText("#");
        jtxtFechaCampeonato.setEnabled(false);
        jtxtFechaCampeonato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFechaCampeonatoFocusGained(evt);
            }
        });

        jLabel7.setText("FECHA");

        jtxtDia.setText("DIA");
        jtxtDia.setEnabled(false);
        jtxtDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtDiaFocusGained(evt);
            }
        });

        jtxtMes.setText("MES");
        jtxtMes.setEnabled(false);
        jtxtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtMesFocusGained(evt);
            }
        });

        jtxtYear.setText("AÑO");
        jtxtYear.setEnabled(false);
        jtxtYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtYearFocusGained(evt);
            }
        });

        jLabel8.setText("HORA");

        jcbmHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jcbmHora.setEnabled(false);

        jcbmMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jcbmMinuto.setEnabled(false);

        jchkEstado.setText("DISPONIBLE");
        jchkEstado.setEnabled(false);
        jchkEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlblLocal)
                                .addGap(25, 25, 25)
                                .addComponent(jcmbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtxtFechaCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jcbmHora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbmMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(jtxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(jtxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(60, 60, 60)
                        .addComponent(jchkEstado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblLocal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtFechaCampeonato, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcbmHora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtYear)
                                .addComponent(jtxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbmMinuto)
                                .addComponent(jtxtMes)))
                        .addComponent(jchkEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        cargarTabla();
        limpiar();
        deshabilitar();
        this.jbtnEditar.setEnabled(false);
        this.jbtnActualizar.setEnabled(false);
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        this.jbtnEditar.setEnabled(false);
        this.jbtnActualizar.setEnabled(true);
        this.jtblListarEventos.setEnabled(false);
        activar();

    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jtblListarEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblListarEventosMouseClicked
        String dia, mes, year, hra, min;

        //creo una variable para asignar el valor de la fila que estoy haciendo click
        int seleccionar = this.jtblListarEventos.rowAtPoint(evt.getPoint());

        this.jbtnEditar.setEnabled(true);
        habilitar();
        desactivar();
        this.jtxtLocal.setText(equipoLocal);

        //lleno los lbl con los datos obtenidos de cada columna de la fila
        idEvento = Integer.parseInt(String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 0)));
        llenarEquipos(String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 1)));
        this.jtxtFechaCampeonato.setText(String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 2)));

        //guardamos la posicion de la fecha en tres variables
        dia = String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 3));
        mes = String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 3));
        year = String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 3));

        //Extraemos el dia con getChars()
        char d[] = new char[2];
        dia.getChars(8, 10, d, 0);
        dia = String.valueOf(d);
        this.jtxtDia.setText(dia);

        //2021-01-20
        //Extraemos el mes con getChars()
        char m[] = new char[2];
        mes.getChars(5, 7, m, 0);
        mes = String.valueOf(m);
        this.jtxtMes.setText(mes);

        //Extraemos el año con getChars()
        char a[] = new char[4];
        year.getChars(0, 4, a, 0);
        year = String.valueOf(a);
        this.jtxtYear.setText(year);

        //guardamos la posicion de hora en dos variables
        hra = String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 4));
        min = String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 4));

        //Extraemos la hora con getChars()
        char hora[] = new char[2];
        hra.getChars(0, 2, hora, 0);
        //Extraemos los minutos con getChars()
        char minuto[] = new char[2];
        min.getChars(3, 5, minuto, 0);

        //guardamos los datos extraidos en cada variable afin
        hra = String.valueOf(hora);
        min = String.valueOf(minuto);
        this.jcbmHora.setSelectedItem(hra);
        this.jcbmMinuto.setSelectedItem(min);

        //Guardamos la posición de disponible
        String disp = String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 5));

        //si es true, se marca el checkbox
        if (disp.equalsIgnoreCase("true")) {
            this.jchkEstado.setSelected(true);
        }

//        this.jlblEvento.setText(String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 1)));
//        this.jlblDescripcion.setText(String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 2)));
//        this.jlblFecha.setText(String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 3)));
//        this.jlblHora.setText(String.valueOf(this.jtblListarEventos.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_jtblListarEventosMouseClicked

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        limpiar();
        deshabilitar();
        idEvento = 0;
        cargarTabla();
        this.jbtnActualizar.setEnabled(false);
        this.jtxtBuscar.requestFocus();
        this.jbtnEditar.setEnabled(false);

    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtxtFechaCampeonatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFechaCampeonatoFocusGained
        this.jtxtFechaCampeonato.setText("");
    }//GEN-LAST:event_jtxtFechaCampeonatoFocusGained

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

    private void jchkEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchkEstadoActionPerformed

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

        String dia, mes, year, fechaStr, hora, minuto;

        equipoLocal = this.jtxtLocal.getText();
        idVisita = this.jcmbEquipo.getSelectedIndex() + 1;
        jornada = Integer.parseInt(this.jtxtFechaCampeonato.getText());

        dia = this.jtxtDia.getText();
        mes = this.jtxtMes.getText();
        year = this.jtxtYear.getText();

        if (dia.isEmpty() || mes.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha", "Validación", 1);
            this.jtxtDia.requestFocus();
            return;
        }

        fechaStr = dia + "/" + mes + "/" + year;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            fechaEvento = formato.parse(fechaStr);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato dd/mm/aaaa", "Validación", 1);
            this.jtxtDia.requestFocus();
            return;
        }

        hora = this.jcbmHora.getSelectedItem().toString();
        minuto = this.jcbmMinuto.getSelectedItem().toString();

        if (hora.isEmpty() || minuto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese hora del evento", "Validación", 1);
            this.jcbmHora.requestFocus();
            return;
        }

        horaEvento = hora + ":" + minuto;

        if (this.jchkEstado.isSelected()) {
            disponible = true;
        } else {
            disponible = false;
        }

        RegistroEvento regev = new RegistroEvento();
        Evento evento = new Evento(idEvento, "", "", jornada, fechaEvento, horaEvento, idVisita, disponible);
        if (regev.actualizar(evento)) {
            JOptionPane.showMessageDialog(null, "Datos Actualizados", "Aviso", 2);
            idEvento = 0;
            cargarTabla();
            limpiar();
            deshabilitar();
            cargarTabla();
            this.jtxtBuscar.requestFocus();
            this.jbtnEditar.setEnabled(false);
            this.jbtnEditar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "Error al aactualizar los Datos", "Error al actualizar", 1);
        }


    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private String consultarEquipo(int idVisita) {
        String equipoVisita;
        RegistroEquipo re = new RegistroEquipo();
        Equipo equipo = re.buscarPorId(idVisita);
        equipoVisita = equipo.getNombreEquipo();

        return equipoVisita;
    }

    private void llenarEquipos(String equipoVisita) {
        String equipo;
        int idvisita;
        RegistroEquipo re = new RegistroEquipo();
        List<Equipo> lista = re.buscarTodos();
        DefaultComboBoxModel valor = new DefaultComboBoxModel();
        this.jcmbEquipo.setModel(valor);
        for (Equipo equipo1 : lista) {
            equipo = equipo1.getNombreEquipo();
            idvisita = equipo1.getIdEquipo();
            valor.addElement(equipo);
            if (equipo.equalsIgnoreCase(equipoVisita)) {
                this.jcmbEquipo.setSelectedItem(equipoVisita);
            }
        }

    }

    public void cargarTabla() {
        RegistroEvento regev = new RegistroEvento();
        DefaultTableModel modelo = (DefaultTableModel) this.jtblListarEventos.getModel();

        try {
            idEvento = Integer.parseInt(this.jtxtBuscar.getText());
        } catch (NumberFormatException e) {
            idEvento = 0;
        }

        modelo.setRowCount(0);

        if (idEvento == 0) {//listar todos
            List<Evento> lista = regev.buscarTodos();

            for (Evento evento : lista) {
                idEvento = evento.getIdEvento();
                equipoLocal = evento.getEquipoLocal();
                descripcionEvento = evento.getDescripcionEvento();
                idVisita = evento.getVisita();

                nomVisita = this.consultarEquipo(idVisita);

                jornada = evento.getJornadaEvento();
                fechaEvento = evento.getFechaEvento();
                horaEvento = evento.getHoraEvento();
                disponible = evento.isDisponible();

                modelo.addRow(new Object[]{idEvento, nomVisita, jornada, fechaEvento, horaEvento, disponible});
            }
        } else { //listar por id

            Evento evento = regev.buscarPorId(idEvento);
            idEvento = evento.getIdEvento();
            equipoLocal = evento.getEquipoLocal();
            descripcionEvento = evento.getDescripcionEvento();
            idVisita = evento.getVisita();

            nomVisita = this.consultarEquipo(idVisita);

            jornada = evento.getJornadaEvento();
            fechaEvento = evento.getFechaEvento();
            horaEvento = evento.getHoraEvento();
            disponible = evento.isDisponible();

            modelo.addRow(new Object[]{idEvento, nomVisita, jornada, fechaEvento, horaEvento, disponible});
        }

    }

    public void limpiar() {
        this.jtxtBuscar.setText("");
        this.jtxtLocal.setText("");
        this.jtxtFechaCampeonato.setText("#");
        this.jtxtDia.setText("DIA");
        this.jtxtMes.setText("MES");
        this.jtxtYear.setText("AÑO");
        this.jcbmHora.setSelectedItem("00");
        this.jcbmMinuto.setSelectedItem("00");
        this.jcmbEquipo.removeAllItems();
        this.jcmbEquipo.addItem("Seleccione Equipo");
        this.jchkEstado.setSelected(false);

    }

    public void deshabilitar() {
        this.jtxtLocal.setEnabled(false);
        this.jcmbEquipo.setEnabled(false);
        this.jtxtFechaCampeonato.setEnabled(false);
        this.jtxtDia.setEnabled(false);
        this.jtxtMes.setEnabled(false);
        this.jtxtYear.setEnabled(false);
        this.jcbmHora.setEnabled(false);
        this.jcbmMinuto.setEnabled(false);
        this.jchkEstado.setEnabled(false);
    }

    public void habilitar() {
        this.jtxtLocal.setEnabled(true);
        this.jtxtFechaCampeonato.setEnabled(true);
        this.jtxtDia.setEnabled(true);
        this.jtxtMes.setEnabled(true);
        this.jtxtYear.setEnabled(true);
        //this.jbtnActualizar.setEnabled(true);
    }

    public void activar() {
        this.jtxtLocal.setEditable(false);
        this.jcmbEquipo.setEnabled(true);
        this.jtxtFechaCampeonato.setEditable(true);
        this.jcbmHora.setEnabled(true);
        this.jcbmMinuto.setEnabled(true);
        this.jtxtDia.setEditable(true);
        this.jtxtMes.setEditable(true);
        this.jtxtYear.setEditable(true);
        this.jchkEstado.setEnabled(true);
    }

    public void desactivar() {
        this.jtxtLocal.setEditable(false);
        this.jtxtFechaCampeonato.setEditable(false);
        this.jtxtDia.setEditable(false);
        this.jtxtMes.setEditable(false);
        this.jtxtYear.setEditable(false);
        this.jchkEstado.setEnabled(false);
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
//            java.util.logging.Logger.getLogger(ListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ListarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ActualizarEvento().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnActualizar;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcbmHora;
    private javax.swing.JComboBox<String> jcbmMinuto;
    private javax.swing.JCheckBox jchkEstado;
    private javax.swing.JComboBox<String> jcmbEquipo;
    private javax.swing.JLabel jlblLocal;
    private javax.swing.JTable jtblListarEventos;
    private javax.swing.JTextField jtxtBuscar;
    private javax.swing.JTextField jtxtDia;
    private javax.swing.JTextField jtxtFechaCampeonato;
    private javax.swing.JTextField jtxtLocal;
    private javax.swing.JTextField jtxtMes;
    private javax.swing.JTextField jtxtYear;
    // End of variables declaration//GEN-END:variables
}
