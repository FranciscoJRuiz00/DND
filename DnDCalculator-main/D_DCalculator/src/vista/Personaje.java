/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario
 */
public class Personaje extends javax.swing.JFrame {


    /**
     * Creates new form Personaje
     */
    public Personaje() {
        initComponents();
    }

    //parametros iniciales
    int n_evento=0;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ApartadoTexto = new javax.swing.JLabel();
        biopanel = new javax.swing.JPanel();
        Gustos = new javax.swing.JLabel();
        fotopg = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Nombretext = new javax.swing.JTextField();
        TituloFuerza = new javax.swing.JLabel();
        Gustos3 = new javax.swing.JLabel();
        Gustos4 = new javax.swing.JLabel();
        Gustos5 = new javax.swing.JLabel();
        Gustos6 = new javax.swing.JLabel();
        saludBtn = new javax.swing.JButton();
        fuerzaBtn = new javax.swing.JButton();
        destrezaBtn = new javax.swing.JButton();
        sabiduriaBtn = new javax.swing.JButton();
        defensaBts = new javax.swing.JButton();
        carismaBtn = new javax.swing.JButton();
        Nombre1 = new javax.swing.JLabel();
        DadoAccion = new javax.swing.JButton();
        DadoCofre = new javax.swing.JButton();
        DadoAprendiz = new javax.swing.JButton();
        Dadoataque = new javax.swing.JButton();
        Dadomagia = new javax.swing.JButton();
        reestablecer = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        ApartadoTexto.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 34)); // NOI18N
        ApartadoTexto.setForeground(new java.awt.Color(255, 255, 255));
        ApartadoTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApartadoTexto.setText("Personaje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(ApartadoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ApartadoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        biopanel.setBackground(new java.awt.Color(102, 204, 255));

        Gustos.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Gustos.setText("Salud:");

        fotopg.setText("Haz click para insertar imagen");
        fotopg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fotopg.setMinimumSize(new java.awt.Dimension(16, 16));
        fotopg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotopgMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fotopgMousePressed(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Nombre.setText("Eventos:");

        Nombretext.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Nombretext.setText("...");
        Nombretext.setAlignmentY(0.2F);
        Nombretext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombretextMousePressed(evt);
            }
        });
        Nombretext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombretextActionPerformed(evt);
            }
        });

        TituloFuerza.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        TituloFuerza.setText("Fuerza:");

        Gustos3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Gustos3.setText("Destreza:");

        Gustos4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Gustos4.setText("Sabiduria:");

        Gustos5.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Gustos5.setText("Carisma:");

        Gustos6.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Gustos6.setText("Defensa:");

        saludBtn.setBackground(new java.awt.Color(255, 255, 255));
        saludBtn.setText("...");
        saludBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 153, 255)));
        saludBtn.setFocusable(false);

        fuerzaBtn.setBackground(new java.awt.Color(255, 255, 255));
        fuerzaBtn.setText("...");
        fuerzaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 204, 255)));
        fuerzaBtn.setFocusable(false);

        destrezaBtn.setBackground(new java.awt.Color(255, 255, 255));
        destrezaBtn.setText("...");
        destrezaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 204, 255)));
        destrezaBtn.setFocusable(false);

        sabiduriaBtn.setBackground(new java.awt.Color(255, 255, 255));
        sabiduriaBtn.setText("...");
        sabiduriaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 204, 255)));
        sabiduriaBtn.setFocusable(false);

        defensaBts.setBackground(new java.awt.Color(255, 255, 255));
        defensaBts.setText("...");
        defensaBts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 204, 255)));
        defensaBts.setFocusable(false);

        carismaBtn.setBackground(new java.awt.Color(255, 255, 255));
        carismaBtn.setText("...");
        carismaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 204, 255)));
        carismaBtn.setFocusable(false);

        Nombre1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Nombre1.setText("Nombre:");

        DadoAccion.setText("Dado de acción");
        DadoAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadoAccionMouseClicked(evt);
            }
        });
        DadoAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadoAccionActionPerformed(evt);
            }
        });

        DadoCofre.setText("Dado de cofre");
        DadoCofre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadoCofreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DadoCofreMousePressed(evt);
            }
        });
        DadoCofre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadoCofreActionPerformed(evt);
            }
        });

        DadoAprendiz.setText("Dado de aprendiz");
        DadoAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadoAprendizMouseClicked(evt);
            }
        });
        DadoAprendiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadoAprendizActionPerformed(evt);
            }
        });

        Dadoataque.setText("Dado de ataque");
        Dadoataque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadoataqueMouseClicked(evt);
            }
        });
        Dadoataque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadoataqueActionPerformed(evt);
            }
        });

        Dadomagia.setText("Dado de magia");
        Dadomagia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadomagiaMouseClicked(evt);
            }
        });
        Dadomagia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadomagiaActionPerformed(evt);
            }
        });

        reestablecer.setText("Reestablecer");
        reestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reestablecerMouseClicked(evt);
            }
        });

        jButton7.setText("Generar Stats");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout biopanelLayout = new javax.swing.GroupLayout(biopanel);
        biopanel.setLayout(biopanelLayout);
        biopanelLayout.setHorizontalGroup(
            biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(biopanelLayout.createSequentialGroup()
                                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Gustos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(biopanelLayout.createSequentialGroup()
                                        .addComponent(Gustos6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGroup(biopanelLayout.createSequentialGroup()
                                    .addComponent(Gustos4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)))
                            .addGroup(biopanelLayout.createSequentialGroup()
                                .addComponent(Gustos3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(biopanelLayout.createSequentialGroup()
                            .addComponent(TituloFuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)))
                    .addGroup(biopanelLayout.createSequentialGroup()
                        .addComponent(Gustos5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carismaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(fuerzaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(destrezaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sabiduriaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defensaBts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nombretext)
                    .addComponent(saludBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(biopanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(biopanelLayout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, biopanelLayout.createSequentialGroup()
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(121, 121, 121))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, biopanelLayout.createSequentialGroup()
                                    .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DadoAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DadoCofre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Dadomagia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DadoAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30))
                                .addGroup(biopanelLayout.createSequentialGroup()
                                    .addComponent(reestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                        .addComponent(fotopg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(biopanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(Dadoataque, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        biopanelLayout.setVerticalGroup(
            biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biopanelLayout.createSequentialGroup()
                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(biopanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(biopanelLayout.createSequentialGroup()
                                .addComponent(fotopg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(biopanelLayout.createSequentialGroup()
                                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(biopanelLayout.createSequentialGroup()
                                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nombretext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Gustos, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                            .addComponent(DadoAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(saludBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, biopanelLayout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(DadoCofre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fuerzaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TituloFuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(DadoAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Dadomagia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destrezaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gustos3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(biopanelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(Dadoataque, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Gustos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sabiduriaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(biopanelLayout.createSequentialGroup()
                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(defensaBts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Gustos6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(biopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Gustos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carismaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(biopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(biopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        biopanel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombretextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombretextActionPerformed

    }//GEN-LAST:event_NombretextActionPerformed

    private void NombretextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombretextMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombretextMousePressed

    private void fotopgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotopgMouseClicked
        /*JFileChooser browseImageFile = new JFileChooser();

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File SelectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = SelectedImageFile.getAbsolutePath();

            ImageIcon ii = new ImageIcon(selectedImagePath);

            Image image = ii.getImage().getScaledInstance(fotopg.getWidth(), fotopg.getHeight(), Image.SCALE_SMOOTH);

            fotopg.setIcon(new ImageIcon(image));
        }*/
    }//GEN-LAST:event_fotopgMouseClicked

    private void DadoCofreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoCofreActionPerformed
        //aqui va el 
    }//GEN-LAST:event_DadoCofreActionPerformed

    private void DadoAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoAccionActionPerformed

    }//GEN-LAST:event_DadoAccionActionPerformed

    private void DadoAprendizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoAprendizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DadoAprendizActionPerformed

    private void DadoataqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadoataqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DadoataqueActionPerformed

    private void DadomagiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadomagiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DadomagiaActionPerformed

    private void DadoCofreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadoCofreMousePressed

        //aqui se pone el switch del d6
    }//GEN-LAST:event_DadoCofreMousePressed

    private void DadoCofreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadoCofreMouseClicked
           
    }//GEN-LAST:event_DadoCofreMouseClicked

    private void DadoAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadoAccionMouseClicked
       
    }//GEN-LAST:event_DadoAccionMouseClicked

    private void DadoAprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadoAprendizMouseClicked
       /*numDado=(int) (Math.random()*10+1);
            if(numDado==1){System.out.println("Te ha salido un: ");
            System.out.println(numDado);
             JOptionPane.showMessageDialog(null,"“Intentaste aprender a transformarte, pero en lugar de eso solamente conseguiste deformar tu cara, pierdes 10 de carisma”");
            carisma = carisma - 10;
            carismaBtn.setText(String.valueOf(carisma));}
            
            if(numDado>1 && numDado<6)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"“Intentaste aprender un hechizo explosivo pero lo ejecutaste mal y saliste herido, tu salud se redujo en 5 junto con tu sabiduria”");  
            salud = salud - 5;
            sabiduria = sabiduria - 5;
            saludBtn.setText(String.valueOf(salud));
            sabiduriaBtn.setText(String.valueOf(sabiduria));}

            if(numDado>5 && numDado<10)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"“Genial has aprendido a utilizar el hechizo de ralentización, obtienes 2 de destreza ”");
            destreza = destreza + 2;
            destrezaBtn.setText(String.valueOf(destreza));}
            
            if(numDado==10)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"“¡Asombroso!, has aprendido a cómo usar la gran bola de fuego, tu fuerza ha aumentado en 10”");
            fuerza = fuerza + 10;
            fuerzaBtn.setText(String.valueOf(fuerza));}
        */
    }//GEN-LAST:event_DadoAprendizMouseClicked

    private void DadomagiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadomagiaMouseClicked
        /*    numDado=(int) (Math.random()*12+1); 
            if(numDado==1){System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"“Tu magia ha salido terriblemente mal, todas tus estadisticas se reducieron en 5”");
        salud = salud - 5;
        carisma = carisma - 5;
        destreza = destreza - 5;
        fuerza = fuerza - 5;
        sabiduria = sabiduria - 5;
        defensa = defensa -5;
        
        saludBtn.setText(String.valueOf(salud));
        carismaBtn.setText(String.valueOf(carisma));
        destrezaBtn.setText(String.valueOf(destreza));
        fuerzaBtn.setText(String.valueOf(fuerza));
        sabiduriaBtn.setText(String.valueOf(sabiduria));
        defensaBts.setText(String.valueOf(defensa));}
            
            if(numDado>1 && numDado<5)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"Tu magia ha salido y has desgastado tu armadura, se redució en 2 tu defensa");
            defensa = defensa - 2;
            defensaBts.setText(String.valueOf(defensa));}
            
            if(numDado>4 && numDado<9)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"Tu magia ha salido bien y has memorizado textos runicos, haz ganado 2 de sabiduria");
            sabiduria = sabiduria + 2;
            sabiduriaBtn.setText(String.valueOf(sabiduria));}
            
            if(numDado>8 && numDado<12)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"Tu magia ha salido muy bien, te aplicaste a ti mismo un hechizo de agilidad, tu destreza aumentó en 3");
            destreza = destreza + 3;
            destrezaBtn.setText(String.valueOf(destreza));}
            
            if(numDado==12)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
            JOptionPane.showMessageDialog(null,"¡Haz ejecutado tu magia de manera pefecta!, todas tus estadisticas aumentaron en 5");
       salud = salud + 5;
        carisma = carisma + 5;
        destreza = destreza + 5;
        fuerza = fuerza + 5;
        sabiduria = sabiduria + 5;
        defensa = defensa + 5;
        
        saludBtn.setText(String.valueOf(salud));
        carismaBtn.setText(String.valueOf(carisma));
        destrezaBtn.setText(String.valueOf(destreza));
        fuerzaBtn.setText(String.valueOf(fuerza));
        sabiduriaBtn.setText(String.valueOf(sabiduria));
        defensaBts.setText(String.valueOf(defensa));}
        */
    }//GEN-LAST:event_DadomagiaMouseClicked

    private void DadoataqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadoataqueMouseClicked
        /*numDado=(int) (Math.random()*20+1);
            if(numDado==1)
            {System.out.println("Te ha salido un: ");
            System.out.println(numDado);
             JOptionPane.showMessageDialog(null,"Tu ataque termina horriblemente mal, te atoraste en un hueco y el enemigo aprovechó para meterte un golpe critico, pierdes 50 de vida");
             salud = salud - 50;
             saludBtn.setText(String.valueOf(salud));}
            
            
            if(numDado>1 && numDado<5)
            {
                System.out.println("Te ha salido un: ");
            System.out.println(numDado);
 JOptionPane.showMessageDialog(null,"El enemigo esquiva tu ataque, además quedaste en una mala posición y diste una oportunidad para que el enemigo contraatacara, pierdes 20 de vida");
     salud = salud - 20;
     saludBtn.setText(String.valueOf(salud));}
            
            if(numDado>4 && numDado<11)
            {
                System.out.println("Te ha salido un: ");
            System.out.println(numDado);
 JOptionPane.showMessageDialog(null,"Pierdes el equilibrio y fallas el ataque, el enemigo aprovecha a contraatacar pero al perder el equilibrio su ataque no conecta adecuadamente, pierdes 10 de vida");
      salud = salud - 10;
     saludBtn.setText(String.valueOf(salud)); }
            
            
            if(numDado>10 && numDado<14)
            {
                System.out.println("Te ha salido un: ");
            System.out.println(numDado);
 JOptionPane.showMessageDialog(null,"Tu ataque falla, pero el enemigo no tuvo oportunidad de contraatacar");}
            
            
            if(numDado>13 && numDado<20)
            {
                System.out.println("Te ha salido un: ");
            System.out.println(numDado);
 JOptionPane.showMessageDialog(null,"Haz acertado tu ataque, el enemigo pierde vida igual a tu fuerza");}
            
            
            if(numDado == 20)
            {
                System.out.println("Te ha salido un: ");
            System.out.println(numDado);
 JOptionPane.showMessageDialog(null,"“Al atacar al enemigo haz acertado un golpe critico, lo que inflinge el triple de tu fuerza como daño”");}
        */
    }//GEN-LAST:event_DadoataqueMouseClicked

    private void reestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reestablecerMouseClicked

    }//GEN-LAST:event_reestablecerMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void fotopgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotopgMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotopgMousePressed


    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApartadoTexto;
    public javax.swing.JButton DadoAccion;
    public javax.swing.JButton DadoAprendiz;
    public javax.swing.JButton DadoCofre;
    public javax.swing.JButton Dadoataque;
    public javax.swing.JButton Dadomagia;
    private javax.swing.JLabel Gustos;
    private javax.swing.JLabel Gustos3;
    private javax.swing.JLabel Gustos4;
    private javax.swing.JLabel Gustos5;
    private javax.swing.JLabel Gustos6;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JTextField Nombretext;
    private javax.swing.JLabel TituloFuerza;
    private javax.swing.JPanel biopanel;
    public javax.swing.JButton carismaBtn;
    public javax.swing.JButton defensaBts;
    public javax.swing.JButton destrezaBtn;
    public javax.swing.JLabel fotopg;
    public javax.swing.JButton fuerzaBtn;
    public javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JButton reestablecer;
    public javax.swing.JButton sabiduriaBtn;
    public javax.swing.JButton saludBtn;
    // End of variables declaration//GEN-END:variables
}