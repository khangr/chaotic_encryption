package form;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import ses.re;
import ses.snd;
import static sun.security.rsa.RSACore.rsa;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        ayar = new form.Ayar(this);
        tur = true;
        turtext.setText("Şifrele");
        panel_sag_dosya.setVisible(false);
        panel_sag_resim.setVisible(false);
        panel_sag_ses.setVisible(false);
        panel_sol_dosya.setVisible(false);
        panel_sol_resim.setVisible(false);
        panel_sol_ses.setVisible(false);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\okhangur\\Documents\\NetBeansProjects\\Kaotikleme\\src\\img\\kesikli.png").getImage().
                getScaledInstance(334, 254, Image.SCALE_DEFAULT));
        sol_panel_resim_label.setIcon(imageIcon);
        kaydedildi = new Kaydedildi();
        this.setLocation(250, 80);
        ses_kaydet = new re();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turGrup = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        ta4 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        ta5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panel_sol_yazi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plain = new javax.swing.JTextArea();
        panel_sag_yazi = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cipher = new javax.swing.JTextArea();
        panel_sol_resim = new javax.swing.JPanel();
        sol_panel_resim_label = new javax.swing.JLabel();
        panel_sag_resim = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_sol_dosya = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        sure = new javax.swing.JLabel();
        boyut = new javax.swing.JLabel();
        blk = new javax.swing.JLabel();
        panel_sag_dosya = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        prog = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        panel_sol_ses = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_sag_ses = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        turtext = new javax.swing.JTextField();

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane3.setViewportView(ta1);

        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane4.setViewportView(ta2);

        ta3.setColumns(20);
        ta3.setRows(5);
        jScrollPane5.setViewportView(ta3);

        ta4.setColumns(20);
        ta4.setRows(5);
        jScrollPane8.setViewportView(ta4);

        ta5.setColumns(20);
        ta5.setRows(5);
        jScrollPane9.setViewportView(ta5);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList1);

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kaosripto");
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_sol_yazi.setBackground(new java.awt.Color(204, 204, 204));
        panel_sol_yazi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_sol_yazi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_sol_yaziMouseClicked(evt);
            }
        });

        plain.setColumns(20);
        plain.setRows(5);
        jScrollPane1.setViewportView(plain);

        javax.swing.GroupLayout panel_sol_yaziLayout = new javax.swing.GroupLayout(panel_sol_yazi);
        panel_sol_yazi.setLayout(panel_sol_yaziLayout);
        panel_sol_yaziLayout.setHorizontalGroup(
            panel_sol_yaziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sol_yaziLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_sol_yaziLayout.setVerticalGroup(
            panel_sol_yaziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sol_yaziLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panel_sol_yazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 260));

        panel_sag_yazi.setBackground(new java.awt.Color(204, 204, 204));
        panel_sag_yazi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cipher.setColumns(20);
        cipher.setRows(5);
        jScrollPane2.setViewportView(cipher);

        javax.swing.GroupLayout panel_sag_yaziLayout = new javax.swing.GroupLayout(panel_sag_yazi);
        panel_sag_yazi.setLayout(panel_sag_yaziLayout);
        panel_sag_yaziLayout.setHorizontalGroup(
            panel_sag_yaziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sag_yaziLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_sag_yaziLayout.setVerticalGroup(
            panel_sag_yaziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sag_yaziLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panel_sag_yazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 340, 260));

        panel_sol_resim.setBackground(new java.awt.Color(204, 204, 204));
        panel_sol_resim.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sol_panel_resim_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sol_panel_resim_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_sol_resimLayout = new javax.swing.GroupLayout(panel_sol_resim);
        panel_sol_resim.setLayout(panel_sol_resimLayout);
        panel_sol_resimLayout.setHorizontalGroup(
            panel_sol_resimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sol_panel_resim_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        panel_sol_resimLayout.setVerticalGroup(
            panel_sol_resimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sol_panel_resim_label, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        jPanel3.add(panel_sol_resim, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 260));

        panel_sag_resim.setBackground(new java.awt.Color(204, 204, 204));
        panel_sag_resim.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panel_sag_resimLayout = new javax.swing.GroupLayout(panel_sag_resim);
        panel_sag_resim.setLayout(panel_sag_resimLayout);
        panel_sag_resimLayout.setHorizontalGroup(
            panel_sag_resimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        panel_sag_resimLayout.setVerticalGroup(
            panel_sag_resimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        jPanel3.add(panel_sag_resim, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 340, 260));

        panel_sol_dosya.setBackground(new java.awt.Color(204, 204, 204));
        panel_sol_dosya.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N

        jButton10.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jButton10.setText("Dosya Seç");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 195, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sure.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        boyut.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        blk.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sure)
                    .addComponent(boyut)
                    .addComponent(blk))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boyut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blk)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_sol_dosyaLayout = new javax.swing.GroupLayout(panel_sol_dosya);
        panel_sol_dosya.setLayout(panel_sol_dosyaLayout);
        panel_sol_dosyaLayout.setHorizontalGroup(
            panel_sol_dosyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sol_dosyaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_sol_dosyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_sol_dosyaLayout.setVerticalGroup(
            panel_sol_dosyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sol_dosyaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panel_sol_dosya, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 260));

        panel_sag_dosya.setBackground(new java.awt.Color(204, 204, 204));
        panel_sag_dosya.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prog.setBackground(new java.awt.Color(255, 255, 153));
        prog.setForeground(new java.awt.Color(255, 51, 51));
        prog.setStringPainted(true);
        jPanel10.add(prog, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 290, 35));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel10.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, -1, -1));

        javax.swing.GroupLayout panel_sag_dosyaLayout = new javax.swing.GroupLayout(panel_sag_dosya);
        panel_sag_dosya.setLayout(panel_sag_dosyaLayout);
        panel_sag_dosyaLayout.setHorizontalGroup(
            panel_sag_dosyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sag_dosyaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_sag_dosyaLayout.setVerticalGroup(
            panel_sag_dosyaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sag_dosyaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jPanel3.add(panel_sag_dosya, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 340, 260));

        panel_sol_ses.setBackground(new java.awt.Color(204, 204, 204));
        panel_sol_ses.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/re.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        javax.swing.GroupLayout panel_sol_sesLayout = new javax.swing.GroupLayout(panel_sol_ses);
        panel_sol_ses.setLayout(panel_sol_sesLayout);
        panel_sol_sesLayout.setHorizontalGroup(
            panel_sol_sesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sol_sesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_sol_sesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_sol_sesLayout.setVerticalGroup(
            panel_sol_sesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sol_sesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panel_sol_ses, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 260));

        panel_sag_ses.setBackground(new java.awt.Color(204, 204, 204));
        panel_sag_ses.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pl.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_2_2095337692.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 20));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_sag_sesLayout = new javax.swing.GroupLayout(panel_sag_ses);
        panel_sag_ses.setLayout(panel_sag_sesLayout);
        panel_sag_sesLayout.setHorizontalGroup(
            panel_sag_sesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sag_sesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_sag_sesLayout.setVerticalGroup(
            panel_sag_sesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sag_sesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel3.add(panel_sag_ses, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 340, 260));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tür", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jToggleButton1.setBackground(new java.awt.Color(153, 153, 153));
        turGrup.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_8_5199308957.png"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("Yazı");
        jToggleButton1.setPreferredSize(new java.awt.Dimension(93, 41));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(153, 153, 153));
        turGrup.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_4_9525986742.png"))); // NOI18N
        jToggleButton2.setText("Resim");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(153, 153, 153));
        turGrup.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_6_6852431487.png"))); // NOI18N
        jToggleButton3.setText("Dosya");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(153, 153, 153));
        turGrup.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_10_5068435356.png"))); // NOI18N
        jToggleButton4.setText("Kayıt");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Şifre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_18_8201716534.png"))); // NOI18N
        jButton1.setText("Başlangıç Değerleri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_20_2131978910.png"))); // NOI18N
        jButton2.setText("RSA ile Anahtar Oluştur");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_12_8061415359.png"))); // NOI18N
        jButton3.setText("Anahtar Dosya Seç");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_22_5132348988.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_26_4553813274.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imageedit_31_3183266200.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        turtext.setEditable(false);
        turtext.setFont(new java.awt.Font("Monospaced", 0, 9)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turtext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        panel_sag_dosya.setVisible(false);
        panel_sag_resim.setVisible(true);
        panel_sag_ses.setVisible(false);
        panel_sag_yazi.setVisible(false);
        panel_sol_dosya.setVisible(false);
        panel_sol_resim.setVisible(true);
        panel_sol_ses.setVisible(false);
        panel_sol_yazi.setVisible(false);

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jToggleButton1.isSelected() == true) {
            if (tur == true) {

                cipher.setText("");

                int lorenz_temp;
                char[] plain_text = plain.getText().toCharArray();
                for (int i = 0; i < plain.getText().length(); i++) {

                    switch (i % 16) {
                        case 0:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 3581), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 1:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 1645), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 2:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 6252), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 3:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 3544), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 4:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 2135), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 5:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 7833), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 6:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 3453), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 7:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 1234), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 8:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 9734), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 9:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 3455), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 10:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 3457), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 11:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 7865), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 12:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 6453), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 13:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 1231), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 14:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 2323), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;
                        case 15:
                            lorenz_temp = (int) plain_text[i] ^ Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_x0, 4444), 2);
                            plain_text[i] = (char) lorenz_temp;
                            break;

                    }
                }
                for (int i = 0; i < plain_text.length; i++) {
                    cipher.append("" + plain_text[i]);
                }

            }
        }

        if (jToggleButton4.isSelected() == true) {

            temp_data_sif_ses = new byte[(int) file_sifreli_ses.length()];

            try {
                ais_sif_ses = AudioSystem.getAudioInputStream(file_sifreli_ses);
            } catch (UnsupportedAudioFileException ex) {
                System.out.println("desteklemeyen format");
            } catch (IOException ex) {
                Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
            }

            dis_sif_ses = new DataInputStream(ais_sif_ses);
            af_sif_ses = ais_sif_ses.getFormat();
            file_data_sif_ses = new byte[(int) (ais_sif_ses.getFrameLength() * af_sif_ses.getFrameSize())];
            try {
                dis_sif_ses.readFully(file_data_sif_ses);
            } catch (IOException ex) {
                Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                dis_sif_ses.close();
            } catch (IOException ex) {
                Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                fis_sif_ses = new FileInputStream(file_sifreli_ses);
            } catch (FileNotFoundException ex) {
                System.out.println("Dosya bulunamadı!");
            }

            try {
                fis_sif_ses.read(temp_data_sif_ses);
            } catch (IOException ex) {
                System.out.println("Dosya okunamadı!");
            }

            try {
                fis_sif_ses.close();
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int i = 0; i < file_data_sif_ses.length; i++) {
                file_data_sif_ses[i] ^= (byte) Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_z0, i % blok_boyutu_ses), 2);
            }

            for (int i = 44; i < temp_data_sif_ses.length; i++) {
                temp_data_sif_ses[i] = file_data_sif_ses[i - 44];
            }

            array_sif_ses = path_sifreli_ses.split("\\.");
            ex_sif_ses = array_sif_ses[array_sif_ses.length - 1];

            try {
                fos_sif_ses = new FileOutputStream("sifses." + ex_sif_ses);
                fos_sif_ses.write(temp_data_sif_ses);
                fos_sif_ses.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Kayıt Yolu Hatası");
            } catch (IOException ex) {
                System.out.println("Kayıt Hatası");
            }

            try {
                clip_sif_ses = AudioSystem.getClip();
                clip_sif_ses.open(AudioSystem.getAudioInputStream(new File("sifses.wav")));

            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (jToggleButton3.isSelected() == true) {

            jLabel1.setText("Çalışıyor...");
            prog.setValue(0);

            new Thread(new Runnable() {
                public void run() {
                    long startTime = System.nanoTime();
                    for (int i = 0; i < file_data_dosya.length; i++) {
                        file_data_dosya[i] ^= (byte) Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_z0, i % blok_boyutu_dosya), 2);
                        prog.setValue(i * 100 / file_data_dosya.length);

                    }
                    long endTime = System.nanoTime();
                    long estimatedTime = endTime - startTime;
                    double seconds = (double) estimatedTime / 1000000000;
                    prog.setValue(100);
                    jLabel1.setText("");

                    sure.setText("Çalışma Süresi : " + seconds + " Sn");
                    boyut.setText("Veri Boyutu : " + file_data_dosya.length / 1024 + " Kbyte");
                    blk.setText("Veri Bloğu Boyutu : " + blok_boyutu_dosya);
                    array_dosya = path_dosya.split("\\.");
                    ex_dosya = array_dosya[array_dosya.length - 1];
                }
            }).start();

        }

        //şifrele resim
        if (jToggleButton2.isSelected() == true) {
            if (tur == true) {

                int j;
                int c;
                for (int po = 0; po < iterasyon; po++) {
                    img = end_img;
                    for (int i = 0; i < img.getWidth(); i++) {
                        lorenz_temp = kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_z0, (i + 746));
                        lorenz_int = Integer.parseInt(lorenz_temp, 2);
                        for (j = 0, c = lorenz_int % img.getHeight(); j < img.getHeight(); j++, c++) {
                            if (c == img.getHeight()) {
                                c = 0;
                            }
                            temp_img.setRGB(i, c, img.getRGB(i, j));
                        }
                    }

                    for (int i = 0; i < temp_img.getHeight(); i++) {
                        lorenz_temp = kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_z0, (i + 746));
                        lorenz_int = Integer.parseInt(lorenz_temp, 2);
                        for (j = 0, c = lorenz_int % temp_img.getWidth(); j < temp_img.getWidth(); j++, c++) {
                            if (c == temp_img.getWidth()) {
                                c = 0;
                            }
                            end_img.setRGB(c, i, temp_img.getRGB(j, i));
                        }
                    }
                }

                ImageIcon imageIcon = new ImageIcon(new ImageIcon(end_img).getImage().
                        getScaledInstance(334, 254, Image.SCALE_DEFAULT));
                jLabel2.setIcon(imageIcon);

            } else {

                int j;
                int c;

                for (int po = 0; po < iterasyon; po++) {
                    img = end_img;
                    for (int i = 0; i < img.getHeight(); i++) {
                        lorenz_temp = kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_z0, (i + 746));
                        lorenz_int = Integer.parseInt(lorenz_temp, 2);
                        for (j = 0, c = lorenz_int % img.getWidth(); j < img.getWidth(); j++, c++) {
                            if (c == img.getWidth()) {
                                c = 0;
                            }
                        }
                        for (j = 0; j < img.getWidth(); j++, c++) {
                            if (c == img.getWidth()) {
                                c = 0;
                            }
                            temp_img.setRGB(j, i, img.getRGB(c, i));
                        }
                    }

                    for (int i = 0; i < temp_img.getWidth(); i++) {
                        lorenz_temp = kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_z0, (i + 746));
                        lorenz_int = Integer.parseInt(lorenz_temp, 2);
                        for (j = 0, c = lorenz_int % img.getHeight(); j < temp_img.getHeight(); j++, c++) {
                            if (c == temp_img.getHeight()) {
                                c = 0;
                            }
                        }
                        for (j = 0; j < temp_img.getHeight(); j++, c++) {
                            if (c == temp_img.getHeight()) {
                                c = 0;
                            }
                            end_img.setRGB(i, j, temp_img.getRGB(i, c));
                        }
                    }

                }

                ImageIcon imageIcon = new ImageIcon(new ImageIcon(end_img).getImage().
                        getScaledInstance(334, 254, Image.SCALE_DEFAULT));
                jLabel2.setIcon(imageIcon);
            }

        }

        //şifrele
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //AYARLAR
        ayar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //yazi
        panel_sag_dosya.setVisible(false);
        panel_sag_resim.setVisible(true);
        panel_sag_ses.setVisible(false);
        panel_sag_yazi.setVisible(true);
        panel_sol_dosya.setVisible(false);
        panel_sol_resim.setVisible(true);
        panel_sol_ses.setVisible(false);
        panel_sol_yazi.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        //dosya
        panel_sag_dosya.setVisible(true);
        panel_sag_resim.setVisible(false);
        panel_sag_ses.setVisible(false);
        panel_sag_yazi.setVisible(false);
        panel_sol_dosya.setVisible(true);
        panel_sol_resim.setVisible(false);
        panel_sol_ses.setVisible(false);
        panel_sol_yazi.setVisible(false);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        //ses
        panel_sag_dosya.setVisible(false);
        panel_sag_resim.setVisible(false);
        panel_sag_ses.setVisible(true);
        panel_sag_yazi.setVisible(false);
        panel_sol_dosya.setVisible(false);
        panel_sol_resim.setVisible(false);
        panel_sol_ses.setVisible(true);
        panel_sol_yazi.setVisible(false);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // ANAHTARI KAYDET
            keys = rsa.rsa.uret();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        privateKey = (PrivateKey) keys[0];
        publicKey = (PublicKey) keys[1];
        try {
            rsaEnString_x0 = rsa.rsa.sifrele(Double.toString(lorenz_x0), publicKey);
            rsaEnString_y0 = rsa.rsa.sifrele(Double.toString(lorenz_y0), publicKey);
            rsaEnString_z0 = rsa.rsa.sifrele(Double.toString(lorenz_z0), publicKey);
            rsaEnString_ite = rsa.rsa.sifrele(Integer.toString(iterasyon), publicKey);
            rsaEnString_blok_dos = rsa.rsa.sifrele(Integer.toString(blok_boyutu_dosya), publicKey);
            rsaEnString_blok_ses = rsa.rsa.sifrele(Integer.toString(blok_boyutu_ses), publicKey);

            ayarlarıYaz();

        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Şifrele-çöz
        if (tur == false) {
            tur = true;
            turtext.setText("Şifrele");
        } else {
            tur = false;
            turtext.setText("Şifre Çöz");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // KAYDET
        if (jToggleButton2.isSelected() == true) {
            JFileChooser cho = new JFileChooser();
            cho.showOpenDialog(null);
            file = cho.getSelectedFile();
            String d_adi = file.getAbsolutePath() + ".png";
            File save_file = new File(d_adi);
            try {
                ImageIO.write(end_img, "png", save_file);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            kaydedildi.setpath(d_adi);
            kaydedildi.setVisible(true);
        }

        if (jToggleButton3.isSelected() == true) {
            JFileChooser cho = new JFileChooser();
            cho.showOpenDialog(null);
            file = cho.getSelectedFile();
            String d_adi = file.getAbsolutePath() + "." + ex_dosya;
            File save_file = new File(d_adi);
            try {
                fos_dosya = new FileOutputStream(save_file);
                fos_dosya.write(file_data_dosya);
                fos_dosya.close();
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            kaydedildi.setpath(d_adi);
            kaydedildi.setVisible(true);
        }

        if (jToggleButton1.isSelected() == true) {
            JFileChooser cho = new JFileChooser();
            cho.showOpenDialog(null);
            file = cho.getSelectedFile();
            file = cho.getSelectedFile();
            String d_adi = file.getAbsolutePath() + ".txt";
            File save_file = new File(d_adi);
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(d_adi));
                out.write(cipher.getText());
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            kaydedildi.setpath(d_adi);
            kaydedildi.setVisible(true);
        }
        if (jToggleButton4.isSelected() == true) {

            JFileChooser cho = new JFileChooser();
            cho.showOpenDialog(null);
            file_sifreli_ses = cho.getSelectedFile();
            String d_adi = file_sifreli_ses.getAbsolutePath();
            File save_file = new File(d_adi);

            try {
                fos_sif_ses = new FileOutputStream(d_adi + "." + ex_sif_ses);
                fos_sif_ses.write(temp_data_sif_ses);
                fos_sif_ses.close();
                kaydedildi.setpath(d_adi);
                kaydedildi.setVisible(true);
            } catch (FileNotFoundException ex) {
                System.out.println("Kayıt Yolu Hatası");
            } catch (IOException ex) {
                System.out.println("Kayıt Hatası");
            }

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void sol_panel_resim_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sol_panel_resim_labelMouseClicked
        // resim seç
        try {
            JFileChooser cho = new JFileChooser();
            cho.showOpenDialog(null);
            file = cho.getSelectedFile();
            String d_adi = file.getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(d_adi).getImage().
                    getScaledInstance(334, 254, Image.SCALE_DEFAULT));
            sol_panel_resim_label.setIcon(imageIcon);

            img = ImageIO.read(file);
            temp_img = ImageIO.read(file);
            end_img = ImageIO.read(file);
            img_w = img.getWidth();
            img_h = img.getHeight();
            k_img = ImageIO.read(file);
            new Yuklendi(d_adi).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sol_panel_resim_labelMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // ses kayıt                    

        kontrol_ses = false;
        jLabel4.setText("");
        if (ses_denetim == false) {
            ses_denetim = true;

            jButton11.setIcon(new ImageIcon("src\\img\\stp.png"));

            new Thread(new Runnable() {
                public void run() {
                    jLabel3.setText("Kayıtta...");
                    ses_kaydet.start();
                }
            }).start();

        } else {

            ses_denetim = false;
            long endTime = System.nanoTime();
            long estimatedTime = endTime - startTime;
            double seconds = (double) estimatedTime / 1000000000;

            jLabel3.setText("");
            ses_kaydet.finish();
            jButton11.setIcon(new ImageIcon("src\\img\\re.png"));

            file_sifreli_ses = new File("kayit.wav");
            path_sifreli_ses = file_sifreli_ses.getAbsolutePath();
            try {
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File("kayit.wav")));

            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jButton11ActionPerformed

    public void getall(double x0, double y0, double z0, int iterasyon, int blok, int ses_blok) {
        lorenz_x0 = x0;
        lorenz_y0 = y0;
        lorenz_z0 = z0;
        this.iterasyon = iterasyon;
        blok_boyutu_dosya = blok;
        this.blok_boyutu_ses = ses_blok;
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        JFileChooser cho = new JFileChooser();
        cho.showOpenDialog(null);
        file_dosya = cho.getSelectedFile();
        path_dosya = file_dosya.getAbsolutePath();
        jTextField1.setText(path_dosya);
        file_data_dosya = new byte[(int) file_dosya.length()];
        try {
            fis_dosya = new FileInputStream(file_dosya);
        } catch (FileNotFoundException ex) {
            System.out.println("fis = new FileInputStream(file);");
        }
        try {
            fis_dosya.read(file_data_dosya);
        } catch (IOException ex) {
            System.out.println("fis.read(file_data);");
        }
        try {
            fis_dosya.close();
        } catch (IOException ex) {
            System.out.println("fis_dosya.close();");
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser cho = new JFileChooser();
        cho.showOpenDialog(null);
        file_rsa = cho.getSelectedFile();
        String d_adi = file_rsa.getAbsolutePath();
        File save_file_rsa = new File(d_adi);
        try {
            FileInputStream f = new FileInputStream(save_file_rsa);
            ObjectInputStream ois = new ObjectInputStream(f);
            privateKey = (PrivateKey) ois.readObject();
            ois.close();
            f.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        cho = new JFileChooser();
        cho.showOpenDialog(null);
        file_rsa = cho.getSelectedFile();
        d_adi = file_rsa.getAbsolutePath();
        String temp_reader;
        save_file_rsa = new File(d_adi);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(d_adi));
            rsaEnString_x0 = Base64.getDecoder().decode(reader.readLine());
            rsaEnString_y0 = Base64.getDecoder().decode(reader.readLine());
            rsaEnString_z0 = Base64.getDecoder().decode(reader.readLine());
            rsaEnString_ite = Base64.getDecoder().decode(reader.readLine());
            rsaEnString_blok_dos = Base64.getDecoder().decode(reader.readLine());
            rsaEnString_blok_ses = Base64.getDecoder().decode(reader.readLine());

            reader.close();
        } catch (FileNotFoundException ex) {
            new hata().setVisible(true);
        } catch (IOException ex) {
            new hata().setVisible(true);
        }
        try {
            lorenz_x0 = Double.parseDouble(rsa.rsa.sifreAc(rsaEnString_x0, privateKey));
            lorenz_y0 = Double.parseDouble(rsa.rsa.sifreAc(rsaEnString_y0, privateKey));
            lorenz_z0 = Double.parseDouble(rsa.rsa.sifreAc(rsaEnString_z0, privateKey));
            iterasyon = Integer.parseInt(rsa.rsa.sifreAc(rsaEnString_ite, privateKey));
            blok_boyutu_dosya = Integer.parseInt(rsa.rsa.sifreAc(rsaEnString_blok_dos, privateKey));
            blok_boyutu_ses = Integer.parseInt(rsa.rsa.sifreAc(rsaEnString_blok_ses, privateKey));
            new Yuklendi(d_adi).setVisible(true);
        } catch (Exception ex) {
            new hata().setVisible(true);
        }
        ayar.getAll(lorenz_x0, lorenz_y0, lorenz_x0, iterasyon, blok_boyutu_dosya, blok_boyutu_ses);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        new Thread(new Runnable() {
            public void run() {
                clip.start();
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(new File("kayit.wav")));
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }).start();


    }//GEN-LAST:event_jButton12ActionPerformed

    private void panel_sol_yaziMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_sol_yaziMouseClicked
        // dosya aç
        plain.setText("");
        JFileChooser cho = new JFileChooser();
        cho.showOpenDialog(null);
        file_rsa = cho.getSelectedFile();
        String d_adi = file_rsa.getAbsolutePath();
        File save_file_rsa = new File(d_adi);
        File f = new File(d_adi);

        try {
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                plain.append(input.nextLine() + "\n");
            }
            input.close();
            new Yuklendi(d_adi).setVisible(true);
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }

    }//GEN-LAST:event_panel_sol_yaziMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            clip_sif_ses.start();
            clip_sif_ses = AudioSystem.getClip();
            clip_sif_ses.open(AudioSystem.getAudioInputStream(new File("kayit.wav")));

        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    
    
    
    
    
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String xx;
    String[] array;
    String path;
    File file;
    byte[] file_data;
    byte[] temp_data;
    byte[] temp;
    byte[] temp2;
    FileInputStream fis = null;
    FileOutputStream fos;
    AudioInputStream ais = null;
    DataInputStream dis;
    AudioFormat af;
    
    JFileChooser cho = new JFileChooser();
        cho.showOpenDialog(null);
        file_sifreli_ses = cho.getSelectedFile();
        path_sifreli_ses = file_sifreli_ses.getAbsolutePath();
        
        jLabel4.setText(path_sifreli_ses);


        /*try {
            ais = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("desteklemeyen format");
        } catch (IOException ex) {
            Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        dis = new DataInputStream(ais);
        af = ais.getFormat();
        file_data = new byte[(int) (ais.getFrameLength() * af.getFrameSize())];
        try {
            dis.readFully(file_data);
        } catch (IOException ex) {
            Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dis.close();
        } catch (IOException ex) {
            Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı!");
        }

        try {
            fis.read(temp_data);
        } catch (IOException ex) {
            System.out.println("Dosya okunamadı!");
        }

        try {
            fis.close();
        } catch (IOException ex) {
            System.out.println("Hata");
        }

        for (int i = 0; i < file_data.length; i++){
            file_data[i] ^= (byte) Integer.parseInt(kaotik.Lorenz.run(lorenz_x0, lorenz_y0, lorenz_z0, i % blok_boyutu_ses), 2);
        }

        for (int i = 44; i < temp_data.length; i++) {
            temp_data[i] = file_data[i - 44];
        }
 

        array = path.split("\\.");
        xx = array[array.length - 1];

        try {
            fos = new FileOutputStream("sesx.wav");
            fos.write(temp_data);
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Kayıt Yolu Hatası");
        } catch (IOException ex) {
            System.out.println("Kayıt Hatası");
        }
        
        temp_data_sif_ses = temp_data;
        
        try {
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File("sesx.wav")));

            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }*/


    }//GEN-LAST:event_jButton14ActionPerformed

    private void ayarlarıYaz() throws IOException {
        //Base64.getEncoder().encodeToString(rsaEnString_x0);

        JFileChooser cho = new JFileChooser();
        cho.showOpenDialog(null);
        file_rsa = cho.getSelectedFile();
        String d_adi = file_rsa.getAbsolutePath();
        File save_file_rsa = new File(d_adi);
        try {
            FileOutputStream f = new FileOutputStream(save_file_rsa + ".key");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(privateKey);
            o.close();
            f.close();
            kaydedildi.setpath(d_adi);
            kaydedildi.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(
                d_adi + ".ayr"));
        writer.write(Base64.getEncoder().encodeToString(rsaEnString_x0));
        writer.newLine();
        writer.write(Base64.getEncoder().encodeToString(rsaEnString_y0));
        writer.newLine();
        writer.write(Base64.getEncoder().encodeToString(rsaEnString_z0));
        writer.newLine();
        writer.write(Base64.getEncoder().encodeToString(rsaEnString_ite));
        writer.newLine();
        writer.write(Base64.getEncoder().encodeToString(rsaEnString_blok_dos));
        writer.newLine();
        writer.write(Base64.getEncoder().encodeToString(rsaEnString_blok_ses));
        writer.close();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    form.Ayar ayar;
    boolean tur;
    File file;
    String yol_resim;
    BufferedImage img;
    BufferedImage temp_img;
    BufferedImage k_img;
    BufferedImage end_img;
    int img_w;
    int img_h;
    private int iterasyon;
    private double lorenz_x0;
    private double lorenz_y0;
    private double lorenz_z0;
    String lorenz_temp;
    private int lorenz_int;
    ses.re ses_kaydet;
    FileInputStream fis_dosya = null;
    int blok_boyutu_dosya;
    File file_dosya;
    private byte[] file_data_dosya;
    String[] array_dosya;
    String ex_dosya;
    FileOutputStream fos_dosya;
    String path_dosya;
    form.Kaydedildi kaydedildi;
    boolean ses_denetim;
    private int blok_boyutu_ses;
    private String ayarkey;
    private PrivateKey privateKey;
    private PublicKey publicKey;
    private Object[] keys;
    private byte[] rsaEnString_x0;
    private byte[] rsaEnString_y0;
    private byte[] rsaEnString_z0;
    private byte[] rsaEnString_ite;
    private byte[] rsaEnString_blok_dos;
    private byte[] rsaEnString_blok_ses;
    private byte[][] rsaEnAll;
    private String rsaDeString;
    private File file_rsa;
    Clip clip;
    public static Clip clip_sif_ses;
    File file_sifreli_ses;
    String path_sifreli_ses;
    byte[] temp_data_sif_ses;
    public static byte[] temp_data_sif_ses_xxx;
    AudioInputStream ais_sif_ses;
    FileInputStream fis_sif_ses;
    FileOutputStream fos_sif_ses;
    DataInputStream dis_sif_ses;
    AudioFormat af_sif_ses;
    byte[] file_data_sif_ses;
    byte[] temp_sif_ses;
    byte[] temp2_sif_ses;
    String ex_sif_ses;
    String[] array_sif_ses;
    long startTime;
    String d_adi_xxx;
    File file_xxx;
    boolean kontrol_ses;

    String encryptedText; //Base64.getEncoder().encodeToString(cipherTextArray);


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blk;
    private javax.swing.JLabel boyut;
    private javax.swing.JTextArea cipher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JPanel panel_sag_dosya;
    private javax.swing.JPanel panel_sag_resim;
    private javax.swing.JPanel panel_sag_ses;
    private javax.swing.JPanel panel_sag_yazi;
    private javax.swing.JPanel panel_sol_dosya;
    private javax.swing.JPanel panel_sol_resim;
    private javax.swing.JPanel panel_sol_ses;
    private javax.swing.JPanel panel_sol_yazi;
    private javax.swing.JTextArea plain;
    private javax.swing.JProgressBar prog;
    private javax.swing.JLabel sol_panel_resim_label;
    private javax.swing.JLabel sure;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    private javax.swing.JTextArea ta3;
    private javax.swing.JTextArea ta4;
    private javax.swing.JTextArea ta5;
    private javax.swing.ButtonGroup turGrup;
    private javax.swing.JTextField turtext;
    // End of variables declaration//GEN-END:variables
}
