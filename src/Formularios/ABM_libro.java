/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import metodos_adicionales.validador;
import Clases.estado_libro;
import Clases.libro;
import Clases.nivel_bibliografico;
import Clases.nivel_institucional;
import Clases.tipo_registro;
import Metodos.Cargar;
import java.sql.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import metodos_adicionales.Guardar;
import metodos_adicionales.JItem;
import metodos_adicionales.Leer;

/**
 *
 * @author Gaston
 */
public class ABM_libro extends javax.swing.JDialog {

    /**
     * Creates new form ABM_libro1
     */
    public ABM_libro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbo_Tipo_registro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbo_nivel_bibliografico = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbo_nivel_institucional = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_InvActual = new javax.swing.JTextField();
        txt_InvAnterior = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_ISBN = new javax.swing.JTextField();
        txt_ISSN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_otros_Indicadores = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_cod_ubicacion = new javax.swing.JTextField();
        Btn_Paso1_Siguinte = new javax.swing.JButton();
        Btn_Paso1_atras = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Check_si_donacion = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Check_si_compra = new javax.swing.JCheckBox();
        Check_no_compra = new javax.swing.JCheckBox();
        Check_no_donacion = new javax.swing.JCheckBox();
        Check_noSe_donacion = new javax.swing.JCheckBox();
        bto_sig_autor = new javax.swing.JButton();
        txt_sig_autor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_seud_autor = new javax.swing.JTextField();
        txt_apell_autor = new javax.swing.JTextField();
        txt_nomb_autor = new javax.swing.JTextField();
        cbo_cant_autor = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_lugar = new javax.swing.JTextField();
        txt_año_publicacion = new javax.swing.JTextField();
        txt_edicion = new javax.swing.JTextField();
        txt_editor = new javax.swing.JTextField();
        txt_editorial = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Btn_Paso2_Siguinte = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_resumen = new javax.swing.JTextArea();
        txt_materia = new javax.swing.JTextField();
        txt_terminos_descrip = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_Subtitulo = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cbo_estado_libro = new javax.swing.JComboBox<>();
        cbo_necesidad_intervencion = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_daño = new javax.swing.JTextArea();
        Btn_Paso3_editar = new javax.swing.JButton();
        Btn_Paso3_Guardar = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 204, 153), null, null));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel1.setText("Campo De Control");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabel2.setText("Tipo de Registro:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cbo_Tipo_registro.setToolTipText("");
        jPanel1.add(cbo_Tipo_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 130, -1));

        jLabel3.setText("Nivel Bibliografico:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jPanel1.add(cbo_nivel_bibliografico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, -1));

        jLabel4.setText("Nivel Institucional:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jPanel1.add(cbo_nivel_institucional, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 130, -1));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel5.setText("Cabecera");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel7.setText("Nº de Inventario Actual: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel8.setText("Nº de Inventario Anterior: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txt_InvActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_InvActualKeyTyped(evt);
            }
        });
        jPanel1.add(txt_InvActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, -1));

        txt_InvAnterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_InvAnteriorKeyTyped(evt);
            }
        });
        jPanel1.add(txt_InvAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 110, -1));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel6.setText("Códigos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel13.setText("ISBN:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel14.setText("ISSN:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        txt_ISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ISBNKeyTyped(evt);
            }
        });
        jPanel1.add(txt_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 210, -1));

        txt_ISSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ISSNKeyTyped(evt);
            }
        });
        jPanel1.add(txt_ISSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 210, -1));

        jLabel15.setText("Otros Indicadores: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        txt_otros_Indicadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_otros_IndicadoresKeyTyped(evt);
            }
        });
        jPanel1.add(txt_otros_Indicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 210, -1));

        jLabel17.setText("Códigos de Ubicación:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        txt_cod_ubicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cod_ubicacionKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cod_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 210, -1));

        Btn_Paso1_Siguinte.setText("Siguiente Paso");
        Btn_Paso1_Siguinte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Paso1_Siguinte.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(Btn_Paso1_Siguinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 110, 60));

        Btn_Paso1_atras.setText("Atras");
        Btn_Paso1_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Paso1_atras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Paso1_atras.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Btn_Paso1_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Paso1_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Paso1_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 110, 60));
        Btn_Paso1_atras.getAccessibleContext().setAccessibleDescription("");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abm/31602959-castaño-claro-papel-reciclado-textura-limpie-el-fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        jTabbedPane1.addTab("Paso 1", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Check_si_donacion.setText("Si");
        jPanel2.add(Check_si_donacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel9.setText("Donación:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel10.setText("Compra:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        Check_si_compra.setText("Si");
        jPanel2.add(Check_si_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        Check_no_compra.setText("No");
        jPanel2.add(Check_no_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        Check_no_donacion.setText("No");
        jPanel2.add(Check_no_donacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        Check_noSe_donacion.setText("No se sabe");
        jPanel2.add(Check_noSe_donacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        bto_sig_autor.setText("Siguiente Autor");
        jPanel2.add(bto_sig_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 40));
        jPanel2.add(txt_sig_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, -1));

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel12.setText("Procedencia");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel21.setText("Seudónimo:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txt_seud_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_seud_autorKeyTyped(evt);
            }
        });
        jPanel2.add(txt_seud_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 210, -1));

        txt_apell_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apell_autorKeyTyped(evt);
            }
        });
        jPanel2.add(txt_apell_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, -1));

        txt_nomb_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nomb_autorKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nomb_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 210, -1));

        cbo_cant_autor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel2.add(cbo_cant_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel20.setText("Cantidad:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel18.setText("Nombre:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel19.setText("Apellido:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel11.setText("Autor");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel25.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel25.setText("Edición");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel30.setText("Lugar:");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        txt_lugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lugarKeyTyped(evt);
            }
        });
        jPanel2.add(txt_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 210, -1));
        jPanel2.add(txt_año_publicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 130, -1));

        txt_edicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edicionKeyTyped(evt);
            }
        });
        jPanel2.add(txt_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 210, -1));
        jPanel2.add(txt_editor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 210, -1));
        jPanel2.add(txt_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 210, -1));

        jLabel26.setText("Editorial:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel27.setText("Editor:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel28.setText("Edición;");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jLabel29.setText("Año de Publicación:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        Btn_Paso2_Siguinte.setText("Siguiente Paso");
        Btn_Paso2_Siguinte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Paso2_Siguinte.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(Btn_Paso2_Siguinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 110, 60));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abm/31602959-castaño-claro-papel-reciclado-textura-limpie-el-fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        jTabbedPane1.addTab("Paso 2", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setText("Terminos Descriptivos:");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel33.setText("Materia:");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel34.setText("Resumen:");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txta_resumen.setColumns(20);
        txta_resumen.setRows(5);
        jScrollPane1.setViewportView(txta_resumen);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, 60));
        jPanel3.add(txt_materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 210, -1));
        jPanel3.add(txt_terminos_descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 210, -1));

        jLabel31.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel31.setText("Descripción");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel3.add(txt_Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 210, -1));
        jPanel3.add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 210, -1));

        jLabel23.setText("Título:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel24.setText("Subtítulo:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel22.setText("Título");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel35.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        jLabel35.setText("Conservación");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel36.setText("Estado");
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel37.setText("Nesecidad de Intervención:");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jPanel3.add(cbo_estado_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 150, -1));

        cbo_necesidad_intervencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jPanel3.add(cbo_necesidad_intervencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        jLabel38.setText("Daño:");
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        txta_daño.setColumns(20);
        txta_daño.setRows(5);
        jScrollPane2.setViewportView(txta_daño);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 210, 60));

        Btn_Paso3_editar.setText("Editar");
        Btn_Paso3_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Paso3_editar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(Btn_Paso3_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 110, 60));

        Btn_Paso3_Guardar.setText("Guardar");
        Btn_Paso3_Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Paso3_Guardar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Btn_Paso3_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Paso3_GuardarActionPerformed(evt);
            }
        });
        jPanel3.add(Btn_Paso3_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 110, 60));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abm/31602959-castaño-claro-papel-reciclado-textura-limpie-el-fondo.jpg"))); // NOI18N
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        jTabbedPane1.addTab("Paso 3", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Paso1_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Paso1_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Paso1_atrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // TODO add your handling code here:
        DefaultComboBoxModel miDefaultCombo1 = new DefaultComboBoxModel();
        DefaultComboBoxModel miDefaultCombo2 = new DefaultComboBoxModel();
        DefaultComboBoxModel miDefaultCombo3 = new DefaultComboBoxModel();
        DefaultComboBoxModel miDefaultCombo4 = new DefaultComboBoxModel();
        Cargar miCargar = new Cargar();
        Leer miLeer = new Leer();
       
        estado_libro []  miEstadoL = miLeer.leer_estado_libro();
        nivel_bibliografico []  miNivelB = miLeer.leer_nivel_bibliografico();
        nivel_institucional [] miNivelInst = miLeer.leer_nivel_institucional();
        tipo_registro[] miTipoRegistro = miLeer.leer_tipo_registro();
        
        miDefaultCombo1 = miCargar.cargar_combo_estadoLibro(miDefaultCombo1, miEstadoL);
        miDefaultCombo2 = miCargar.cargar_combo_NInstitucional(miDefaultCombo2, miNivelInst);
        miDefaultCombo3 = miCargar.cargar_combo_NBibliografico(miDefaultCombo3, miNivelB);
        miDefaultCombo4 = miCargar.cargar_combo_tipoRegistro(miDefaultCombo4, miTipoRegistro);
        
       
        cbo_estado_libro.setModel(miDefaultCombo1);
        cbo_nivel_institucional.setModel(miDefaultCombo2);
         cbo_nivel_bibliografico.setModel(miDefaultCombo3);
        cbo_Tipo_registro.setModel(miDefaultCombo4);
       
        cbo_estado_libro.setSelectedIndex(-1);  
        cbo_nivel_bibliografico.setSelectedIndex(-1);  
        cbo_nivel_institucional.setSelectedIndex(-1);  
        cbo_Tipo_registro.setSelectedIndex(-1); 
    }//GEN-LAST:event_formWindowOpened

    private void Btn_Paso3_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Paso3_GuardarActionPerformed

        try{
        // TODO add your handling code here:
         Guardar miGuardar = new Guardar(); 
         libro miLibro = new libro();
   
      //PASO 1 ------     
         
         int pos = cbo_Tipo_registro.getSelectedIndex();
             if (pos >=0) {
                    Object obj = cbo_Tipo_registro.getItemAt(pos);
                    JItem item = new JItem(obj);         
                    
                     JOptionPane.showMessageDialog(null, (item.getItemData().toString()));
                     miLibro.setIdtipoderegistro(  (Integer)item.getItemData()  );
             }
             
         int pos1 = cbo_nivel_bibliografico.getSelectedIndex();
            if (pos1 >=0) {
                  Object obj = cbo_nivel_bibliografico.getItemAt(pos1);
                  JItem item = new JItem(obj);         
                   miLibro.setIdnivelbibliografico((Integer)item.getItemData());
             }
         
          int pos2 = cbo_nivel_institucional.getSelectedIndex();
            if (pos2>=0) {
                  Object obj = cbo_nivel_institucional.getItemAt(pos2);
                  JItem item = new JItem(obj);         
                   miLibro.setIdnivelinstitucional((Integer)item.getItemData());
             }
            
            
  
           miLibro.setNumerodeinventario(txt_InvActual.getText());
           miLibro.setNrodeinventarioanterior(txt_InvAnterior.getText());
           miLibro.setIsbn(txt_ISBN.getText());
           miLibro.setIssn(txt_ISSN.getText());
           miLibro.setOtrosindicadores(txt_otros_Indicadores.getText());
         
    //PASO 2 ------   
    
           miLibro.setIntcodigodeubicacion(Integer.parseInt(txt_cod_ubicacion.getText()));
           miLibro.setEdicion(txt_edicion.getText());
           miLibro.setAniopublicacion(Date.valueOf(txt_año_publicacion.getText()));
           miLibro.setLugar(Integer.parseInt(txt_lugar.getText()));
           
           miLibro.setTitulo(txt_titulo.getText());
           miLibro.setSubtitulo(txt_Subtitulo.getText());
           miLibro.setTerminosdescriptivos(Integer.parseInt(txt_terminos_descrip.getText()));
    
    //PASO 3 ------  
    
            int pos3 = cbo_estado_libro.getSelectedIndex();
            if (pos3 >=0) {
                  Object obj = cbo_estado_libro.getItemAt(pos3);
                  JItem item = new JItem(obj);         
                   miLibro.setIdestadoconservacion((Integer)item.getItemData());
             } 
            
            int pos4 = cbo_necesidad_intervencion.getSelectedIndex();
            if (pos4 >=0) {
                  Object obj = cbo_necesidad_intervencion.getItemAt(pos4);
                  JItem item = new JItem(obj);         
                   miLibro.setNecesidadinterferencia((Integer)item.getItemData());
             } 
            
            miLibro.setIdanio(txta_daño.getTabSize());
           
            miGuardar.GuardarLibro(miLibro);
             
     
            
              JOptionPane.showMessageDialog(null, "EL LIBRO SE GUARDO CORRECTAMENTE");
         
              // JOptionPane.showMessageDialog(null, "HUBO UN INCONVENIENTE PARA GUARDAR EL LIBRO");
           
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
           
        }
    }//GEN-LAST:event_Btn_Paso3_GuardarActionPerformed

    private void txt_InvActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_InvActualKeyTyped
        char c;               
    c=evt.getKeyChar();  
   
          if(Character.isDigit(c)==false)  
            { 
             getToolkit().beep();  
             
            // JOptionPane.showMessageDialog(null, "ERRRROR");  
             evt.consume();
          
            }   
    }//GEN-LAST:event_txt_InvActualKeyTyped

    private void txt_InvAnteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_InvAnteriorKeyTyped
          char c;               
    c=evt.getKeyChar();  
   
          if(Character.isDigit(c)==false)  
            { 
             getToolkit().beep();  
            
             evt.consume();
          
            }  
    }//GEN-LAST:event_txt_InvAnteriorKeyTyped

    private void txt_ISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ISBNKeyTyped
        validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_ISBNKeyTyped

    private void txt_ISSNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ISSNKeyTyped
         validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_ISSNKeyTyped

    private void txt_otros_IndicadoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_otros_IndicadoresKeyTyped
         validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_otros_IndicadoresKeyTyped

    private void txt_cod_ubicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_ubicacionKeyTyped
              char c;               
    c=evt.getKeyChar();  
          if(Character.isDigit(c)==false)  
            { 
             getToolkit().beep();  
             evt.consume();
            }  
    }//GEN-LAST:event_txt_cod_ubicacionKeyTyped

    private void txt_nomb_autorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomb_autorKeyTyped
       validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_nomb_autorKeyTyped

    private void txt_apell_autorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apell_autorKeyTyped
       validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_apell_autorKeyTyped

    private void txt_seud_autorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_seud_autorKeyTyped
       validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_seud_autorKeyTyped

    private void txt_lugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lugarKeyTyped
       validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_lugarKeyTyped

    private void txt_edicionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edicionKeyTyped
       validador mivalidar = new validador();
        if (mivalidar.validarletras(evt)){
         evt.consume();  
            }
    }//GEN-LAST:event_txt_edicionKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ABM_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABM_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABM_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABM_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ABM_libro dialog = new ABM_libro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Paso1_Siguinte;
    private javax.swing.JButton Btn_Paso1_atras;
    private javax.swing.JButton Btn_Paso2_Siguinte;
    private javax.swing.JButton Btn_Paso3_Guardar;
    private javax.swing.JButton Btn_Paso3_editar;
    private javax.swing.JCheckBox Check_noSe_donacion;
    private javax.swing.JCheckBox Check_no_compra;
    private javax.swing.JCheckBox Check_no_donacion;
    private javax.swing.JCheckBox Check_si_compra;
    private javax.swing.JCheckBox Check_si_donacion;
    private javax.swing.JButton bto_sig_autor;
    private javax.swing.JComboBox<String> cbo_Tipo_registro;
    private javax.swing.JComboBox<String> cbo_cant_autor;
    private javax.swing.JComboBox<String> cbo_estado_libro;
    private javax.swing.JComboBox<String> cbo_necesidad_intervencion;
    private javax.swing.JComboBox<String> cbo_nivel_bibliografico;
    private javax.swing.JComboBox<String> cbo_nivel_institucional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_ISBN;
    private javax.swing.JTextField txt_ISSN;
    private javax.swing.JTextField txt_InvActual;
    private javax.swing.JTextField txt_InvAnterior;
    private javax.swing.JTextField txt_Subtitulo;
    private javax.swing.JTextField txt_apell_autor;
    private javax.swing.JTextField txt_año_publicacion;
    private javax.swing.JTextField txt_cod_ubicacion;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editor;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_lugar;
    private javax.swing.JTextField txt_materia;
    private javax.swing.JTextField txt_nomb_autor;
    private javax.swing.JTextField txt_otros_Indicadores;
    private javax.swing.JTextField txt_seud_autor;
    private javax.swing.JTextField txt_sig_autor;
    private javax.swing.JTextField txt_terminos_descrip;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTextArea txta_daño;
    private javax.swing.JTextArea txta_resumen;
    // End of variables declaration//GEN-END:variables
}
