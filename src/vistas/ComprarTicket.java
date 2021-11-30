/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.Evento;

/**
 *
 * @author Sebastian
 */
public class ComprarTicket extends javax.swing.JFrame {
    //creo una variable de Evento para guardar los datos provenientes desde la otra ventana
    private Evento evento;
    /**
     * Creates new form ComprarTicket
     */
    
    //obtengo el objeto proveniente desde ListarEvento
    public ComprarTicket(final Evento evento) {
        initComponents();
        imgSectores();
        this.evento = evento;
        this.jLabel6.setText(evento.getEquipoLocal());
    }
    
    public void imgSectores(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sectores.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);
    }
    
    public void imgRapanui(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_rapanui.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgOceano(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_oceano.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgCordillera(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_cordillera.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgLautaro(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_lautaro.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgCaupolican(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_caupolican.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgGalvarino(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_galvarino.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgTucalpel(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_tucapel.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgArica(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_arica.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    public void imgMagallanes(){
        ImageIcon estadio = new ImageIcon(getClass().getResource("/Imagenes/sector_magallanes.png"));
        Icon estadioIcono =   new ImageIcon(estadio.getImage().getScaledInstance(this.jlblImagen.getWidth(), this.jlblImagen.getHeight(), Image.SCALE_SMOOTH));
        this.jlblImagen.setIcon(estadioIcono);  
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlblImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jrbtRapanui = new javax.swing.JRadioButton();
        jrbtCordillera = new javax.swing.JRadioButton();
        jrbtOceano = new javax.swing.JRadioButton();
        jrbtCaupolican = new javax.swing.JRadioButton();
        jrbtGalvarino = new javax.swing.JRadioButton();
        jrbtLautaro = new javax.swing.JRadioButton();
        jrbtTucapel = new javax.swing.JRadioButton();
        jrbtArica = new javax.swing.JRadioButton();
        jrbtMagallanes = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jlblPrecioOceano = new javax.swing.JLabel();
        jlblPrecioRapanui = new javax.swing.JLabel();
        jlblPrecioCordillera = new javax.swing.JLabel();
        jlblPrecioCaupolican = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblPrecioGalvarino = new javax.swing.JLabel();
        jlblPrecioLautaro = new javax.swing.JLabel();
        jlblPrecioTucapel = new javax.swing.JLabel();
        jlblPrecioArica = new javax.swing.JLabel();
        jlblPrecioMagallanes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venta de Ticket");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 460));

        jlblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estadio Monumental - David Arellano");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(jrbtRapanui);
        jrbtRapanui.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtRapanui.setForeground(new java.awt.Color(255, 255, 255));
        jrbtRapanui.setText("Rapa Nui");
        jrbtRapanui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtRapanuiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtCordillera);
        jrbtCordillera.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtCordillera.setForeground(new java.awt.Color(255, 255, 255));
        jrbtCordillera.setText("Cordillera");
        jrbtCordillera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtCordilleraActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtOceano);
        jrbtOceano.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtOceano.setForeground(new java.awt.Color(255, 255, 255));
        jrbtOceano.setText("Oceano");
        jrbtOceano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtOceanoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtCaupolican);
        jrbtCaupolican.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtCaupolican.setForeground(new java.awt.Color(255, 255, 255));
        jrbtCaupolican.setText("Caupolican");
        jrbtCaupolican.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtCaupolicanActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtGalvarino);
        jrbtGalvarino.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtGalvarino.setForeground(new java.awt.Color(255, 255, 255));
        jrbtGalvarino.setText("Galvarino");
        jrbtGalvarino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtGalvarinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtLautaro);
        jrbtLautaro.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtLautaro.setForeground(new java.awt.Color(255, 255, 255));
        jrbtLautaro.setText("Lautaro");
        jrbtLautaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtLautaroActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtTucapel);
        jrbtTucapel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtTucapel.setForeground(new java.awt.Color(255, 255, 255));
        jrbtTucapel.setText("Tucapel");
        jrbtTucapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtTucapelActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtArica);
        jrbtArica.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtArica.setForeground(new java.awt.Color(255, 255, 255));
        jrbtArica.setText("Arica");
        jrbtArica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtAricaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbtMagallanes);
        jrbtMagallanes.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jrbtMagallanes.setForeground(new java.awt.Color(255, 255, 255));
        jrbtMagallanes.setText("Magallanes");
        jrbtMagallanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtMagallanesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SECTORES");

        jlblPrecioOceano.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioOceano.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioOceano.setText("$ 30.000");

        jlblPrecioRapanui.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioRapanui.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioRapanui.setText("$ 45.000");

        jlblPrecioCordillera.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioCordillera.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioCordillera.setText("$ 20.000");

        jlblPrecioCaupolican.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioCaupolican.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioCaupolican.setText("$ 10.000");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRECIOS");

        jlblPrecioGalvarino.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioGalvarino.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioGalvarino.setText("$ 10.000");

        jlblPrecioLautaro.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioLautaro.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioLautaro.setText("$ 10.000");

        jlblPrecioTucapel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioTucapel.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioTucapel.setText("$ 10.000");

        jlblPrecioArica.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioArica.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioArica.setText("$   8.000");

        jlblPrecioMagallanes.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jlblPrecioMagallanes.setForeground(new java.awt.Color(255, 255, 255));
        jlblPrecioMagallanes.setText("$   8.000");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoColoColo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RUN");

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(34, 34, 34))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jrbtRapanui, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblPrecioRapanui, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel7))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtCaupolican, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioCaupolican, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtOceano, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioOceano, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtCordillera, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioCordillera, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtGalvarino, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioGalvarino, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtLautaro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioLautaro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtTucapel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioTucapel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtArica, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioArica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jrbtMagallanes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlblPrecioMagallanes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtRapanui)
                            .addComponent(jlblPrecioRapanui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtOceano)
                            .addComponent(jlblPrecioOceano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtCordillera)
                            .addComponent(jlblPrecioCordillera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtCaupolican)
                            .addComponent(jlblPrecioCaupolican, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtGalvarino)
                            .addComponent(jlblPrecioGalvarino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtLautaro)
                            .addComponent(jlblPrecioLautaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtTucapel)
                            .addComponent(jlblPrecioTucapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtArica)
                            .addComponent(jlblPrecioArica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtMagallanes)
                            .addComponent(jlblPrecioMagallanes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbtCordilleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtCordilleraActionPerformed
        imgCordillera();
    }//GEN-LAST:event_jrbtCordilleraActionPerformed

    private void jrbtOceanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtOceanoActionPerformed
        imgOceano();
    }//GEN-LAST:event_jrbtOceanoActionPerformed

    private void jrbtCaupolicanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtCaupolicanActionPerformed
        imgCaupolican();
    }//GEN-LAST:event_jrbtCaupolicanActionPerformed

    private void jrbtGalvarinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtGalvarinoActionPerformed
        imgGalvarino();
    }//GEN-LAST:event_jrbtGalvarinoActionPerformed

    private void jrbtLautaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtLautaroActionPerformed
        imgLautaro();
    }//GEN-LAST:event_jrbtLautaroActionPerformed

    private void jrbtRapanuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtRapanuiActionPerformed
        imgRapanui();
    }//GEN-LAST:event_jrbtRapanuiActionPerformed

    private void jrbtTucapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtTucapelActionPerformed
        imgTucalpel();
    }//GEN-LAST:event_jrbtTucapelActionPerformed

    private void jrbtAricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtAricaActionPerformed
        imgArica();
    }//GEN-LAST:event_jrbtAricaActionPerformed

    private void jrbtMagallanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtMagallanesActionPerformed
        imgMagallanes();
    }//GEN-LAST:event_jrbtMagallanesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
//            java.util.logging.Logger.getLogger(ComprarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ComprarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ComprarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ComprarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ComprarTicket().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jlblImagen;
    private javax.swing.JLabel jlblPrecioArica;
    private javax.swing.JLabel jlblPrecioCaupolican;
    private javax.swing.JLabel jlblPrecioCordillera;
    private javax.swing.JLabel jlblPrecioGalvarino;
    private javax.swing.JLabel jlblPrecioLautaro;
    private javax.swing.JLabel jlblPrecioMagallanes;
    private javax.swing.JLabel jlblPrecioOceano;
    private javax.swing.JLabel jlblPrecioRapanui;
    private javax.swing.JLabel jlblPrecioTucapel;
    private javax.swing.JRadioButton jrbtArica;
    private javax.swing.JRadioButton jrbtCaupolican;
    private javax.swing.JRadioButton jrbtCordillera;
    private javax.swing.JRadioButton jrbtGalvarino;
    private javax.swing.JRadioButton jrbtLautaro;
    private javax.swing.JRadioButton jrbtMagallanes;
    private javax.swing.JRadioButton jrbtOceano;
    private javax.swing.JRadioButton jrbtRapanui;
    private javax.swing.JRadioButton jrbtTucapel;
    // End of variables declaration//GEN-END:variables
}
