/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lab;

import javax.swing.JButton;

/**
 *
 * @author Carlos Nuila
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    
    JButton[][] tablero = new JButton[8][8];
    Pieza peon1 = new Peon(1);
    Pieza peon2 = new Peon(2);
    Pieza torre1 = new Torre(1);
    Pieza torre2 = new Torre(2);
    Pieza caballo1 = new Caballo(1);
    Pieza caballo2 = new Caballo(2);
    Pieza rey1 = new Rey(1);
    Pieza rey2 = new Rey(2);
    Pieza reina1 = new Reina(1);
    Pieza reina2 = new Reina(2);
    Pieza alfil1 = new Alfil(1);
    Pieza alfil2 = new Alfil(2);

    Pieza listaPiezas[][] = new Pieza[2][6];

    JButton posActual = new JButton();
    JButton posDestino = new JButton();

    int turno;
    
    
    public Interfaz() {
        initComponents();
        listaPiezas[0][0] = peon1;
        listaPiezas[0][2] = torre1;
        listaPiezas[0][4] = caballo1;
        listaPiezas[0][1] = rey1;
        listaPiezas[0][3] = reina1;
        listaPiezas[0][5] = alfil1;

        listaPiezas[1][0] = peon2;
        listaPiezas[1][2] = torre2;
        listaPiezas[1][4] = caballo2;
        listaPiezas[1][1] = rey2;
        listaPiezas[1][3] = reina2;
        listaPiezas[1][5] = alfil2;
        
        tablero[0][0] = jb_00;
        tablero[0][1] = jb_01;
        tablero[0][2] = jb_02;
        tablero[0][3] = jb_03;
        tablero[0][4] = jb_04;
        tablero[0][5] = jb_05;
        tablero[0][6] = jb_06;
        tablero[0][7] = jb_07;
        tablero[1][0] = jb_10;
        tablero[1][1] = jb_11;
        tablero[1][2] = jb_12;
        tablero[1][3] = jb_13;
        tablero[1][4] = jb_14;
        tablero[1][5] = jb_15;
        tablero[1][6] = jb_16;
        tablero[1][7] = jb_17;
        tablero[2][0] = jb_20;
        tablero[2][1] = jb_21;
        tablero[2][2] = jb_22;
        tablero[2][3] = jb_23;
        tablero[2][4] = jb_24;
        tablero[2][5] = jb_25;
        tablero[2][6] = jb_26;
        tablero[2][7] = jb_27;
        tablero[3][0] = jb_30;
        tablero[3][1] = jb_31;
        tablero[3][2] = jb_32;
        tablero[3][3] = jb_33;
        tablero[3][4] = jb_34;
        tablero[3][5] = jb_35;
        tablero[3][6] = jb_36;
        tablero[3][7] = jb_37;
        tablero[4][0] = jb_40;
        tablero[4][1] = jb_41;
        tablero[4][2] = jb_42;
        tablero[4][3] = jb_43;
        tablero[4][4] = jb_44;
        tablero[4][5] = jb_45;
        tablero[4][6] = jb_46;
        tablero[4][7] = jb_47;
        tablero[5][0] = jb_50;
        tablero[5][1] = jb_51;
        tablero[5][2] = jb_52;
        tablero[5][3] = jb_53;
        tablero[5][4] = jb_54;
        tablero[5][5] = jb_55;
        tablero[5][6] = jb_56;
        tablero[5][7] = jb_57;
        tablero[6][0] = jb_60;
        tablero[6][1] = jb_61;
        tablero[6][2] = jb_62;
        tablero[6][3] = jb_63;
        tablero[6][4] = jb_64;
        tablero[6][5] = jb_65;
        tablero[6][6] = jb_66;
        tablero[6][7] = jb_67;
        tablero[7][0] = jb_70;
        tablero[7][1] = jb_71;
        tablero[7][2] = jb_72;
        tablero[7][3] = jb_73;
        tablero[7][4] = jb_74;
        tablero[7][5] = jb_75;
        tablero[7][6] = jb_76;
        tablero[7][7] = jb_77;
        tableroDefecto(0, 0);
        
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
        jb_00 = new javax.swing.JButton();
        jb_01 = new javax.swing.JButton();
        jb_10 = new javax.swing.JButton();
        jb_11 = new javax.swing.JButton();
        jb_20 = new javax.swing.JButton();
        jb_21 = new javax.swing.JButton();
        jb_30 = new javax.swing.JButton();
        jb_31 = new javax.swing.JButton();
        jb_12 = new javax.swing.JButton();
        jb_02 = new javax.swing.JButton();
        jb_13 = new javax.swing.JButton();
        jb_03 = new javax.swing.JButton();
        jb_32 = new javax.swing.JButton();
        jb_22 = new javax.swing.JButton();
        jb_33 = new javax.swing.JButton();
        jb_23 = new javax.swing.JButton();
        jb_27 = new javax.swing.JButton();
        jb_37 = new javax.swing.JButton();
        jb_36 = new javax.swing.JButton();
        jb_26 = new javax.swing.JButton();
        jb_04 = new javax.swing.JButton();
        jb_05 = new javax.swing.JButton();
        jb_06 = new javax.swing.JButton();
        jb_07 = new javax.swing.JButton();
        jb_17 = new javax.swing.JButton();
        jb_16 = new javax.swing.JButton();
        jb_15 = new javax.swing.JButton();
        jb_14 = new javax.swing.JButton();
        jb_24 = new javax.swing.JButton();
        jb_34 = new javax.swing.JButton();
        jb_35 = new javax.swing.JButton();
        jb_25 = new javax.swing.JButton();
        jb_70 = new javax.swing.JButton();
        jb_43 = new javax.swing.JButton();
        jb_52 = new javax.swing.JButton();
        jb_71 = new javax.swing.JButton();
        jb_40 = new javax.swing.JButton();
        jb_63 = new javax.swing.JButton();
        jb_72 = new javax.swing.JButton();
        jb_60 = new javax.swing.JButton();
        jb_53 = new javax.swing.JButton();
        jb_62 = new javax.swing.JButton();
        jb_51 = new javax.swing.JButton();
        jb_61 = new javax.swing.JButton();
        jb_42 = new javax.swing.JButton();
        jb_50 = new javax.swing.JButton();
        jb_73 = new javax.swing.JButton();
        jb_41 = new javax.swing.JButton();
        jb_55 = new javax.swing.JButton();
        jb_64 = new javax.swing.JButton();
        jb_54 = new javax.swing.JButton();
        jb_47 = new javax.swing.JButton();
        jb_76 = new javax.swing.JButton();
        jb_44 = new javax.swing.JButton();
        jb_65 = new javax.swing.JButton();
        jb_46 = new javax.swing.JButton();
        jb_66 = new javax.swing.JButton();
        jb_45 = new javax.swing.JButton();
        jb_74 = new javax.swing.JButton();
        jb_56 = new javax.swing.JButton();
        jb_67 = new javax.swing.JButton();
        jb_57 = new javax.swing.JButton();
        jb_77 = new javax.swing.JButton();
        jb_75 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.setPreferredSize(new java.awt.Dimension(693, 771));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_00.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_00, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 31, 61, 58));

        jb_01.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 31, 61, 58));

        jb_10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 95, 61, 58));

        jb_11.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 95, 61, 58));

        jb_20.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 159, 61, 58));

        jb_21.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 159, 61, 58));

        jb_30.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_30, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 223, 61, 58));

        jb_31.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 223, 61, 58));

        jb_12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 95, 61, 58));

        jb_02.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 31, 61, 58));

        jb_13.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 95, 61, 58));

        jb_03.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 31, 61, 58));

        jb_32.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 223, 61, 58));

        jb_22.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 159, 61, 58));

        jb_33.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 223, 61, 58));

        jb_23.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 159, 61, 58));

        jb_27.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 159, 61, 58));

        jb_37.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_37, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 223, 61, 58));

        jb_36.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_36, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 223, 61, 58));

        jb_26.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 159, 61, 58));

        jb_04.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_04, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 31, 61, 58));

        jb_05.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_05, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 31, 61, 58));

        jb_06.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_06, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 31, 61, 58));

        jb_07.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_07, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 31, 61, 58));

        jb_17.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 95, 61, 58));

        jb_16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 95, 61, 58));

        jb_15.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 95, 61, 58));

        jb_14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 95, 61, 58));

        jb_24.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 159, 61, 58));

        jb_34.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_34, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 223, 61, 58));

        jb_35.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_35, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 223, 61, 58));

        jb_25.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 159, 61, 58));

        jb_70.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_70, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 479, 61, 58));

        jb_43.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_43, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 287, 61, 58));

        jb_52.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_52, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 351, 61, 58));

        jb_71.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_71, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 479, 61, 58));

        jb_40.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_40, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 287, 61, 58));

        jb_63.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_63, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 415, 61, 58));

        jb_72.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_72, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 479, 61, 58));

        jb_60.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_60, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 415, 61, 58));

        jb_53.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_53, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 351, 61, 58));

        jb_62.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_62, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 415, 61, 58));

        jb_51.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_51, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 351, 61, 58));

        jb_61.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_61, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 415, 61, 58));

        jb_42.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_42, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 287, 61, 58));

        jb_50.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_50, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 351, 61, 58));

        jb_73.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_73, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 479, 61, 58));

        jb_41.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_41, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 287, 61, 58));

        jb_55.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_55, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 351, 61, 58));

        jb_64.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_64, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 415, 61, 58));

        jb_54.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_54, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 351, 61, 58));

        jb_47.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_47, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 287, 61, 58));

        jb_76.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_76, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 479, 61, 58));

        jb_44.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_44, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 287, 61, 58));

        jb_65.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_65, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 415, 61, 58));

        jb_46.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 287, 61, 58));

        jb_66.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_66, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 415, 61, 58));

        jb_45.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_45, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 287, 61, 58));

        jb_74.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_74, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 479, 61, 58));

        jb_56.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_56, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 351, 61, 58));

        jb_67.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jb_67, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 415, 61, 58));

        jb_57.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_57, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 351, 61, 58));

        jb_77.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_77, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 479, 61, 58));

        jb_75.setBackground(new java.awt.Color(255, 244, 163));
        jPanel1.add(jb_75, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 479, 61, 58));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    //Método Recursivo
    public void tableroDefecto(int fila, int columna) {
        if (fila < 8) {
            if (columna < 8) {
                if (fila == 1) {
                    tablero[fila][columna].setIcon(peon2.getImagen());
                }
                if (fila == 6) {
                    tablero[fila][columna].setIcon(peon1.getImagen());
                }
                if (fila == 0 && (columna == 0 || columna == 7)) {
                    tablero[fila][columna].setIcon(torre2.getImagen());
                }
                if (fila == 7 && (columna == 0 || columna == 7)) {
                    tablero[fila][columna].setIcon(torre1.getImagen());
                }
                if (fila == 0 && (columna == 1 || columna == 6)) {
                    tablero[fila][columna].setIcon(caballo2.getImagen());
                }
                if (fila == 7 && (columna == 1 || columna == 6)) {
                    tablero[fila][columna].setIcon(caballo1.getImagen());
                }
                if (fila == 0 && (columna == 2 || columna == 5)) {
                    tablero[fila][columna].setIcon(alfil2.getImagen());
                }
                if (fila == 7 && (columna == 2 || columna == 5)) {
                    tablero[fila][columna].setIcon(alfil1.getImagen());
                }
                if (fila == 0 && columna == 3) {
                    tablero[fila][columna].setIcon(rey2.getImagen());
                }
                if (fila == 7 && columna == 3) {
                    tablero[fila][columna].setIcon(rey1.getImagen());
                }
                if (fila == 0 && columna == 4) {
                    tablero[fila][columna].setIcon(reina2.getImagen());
                }
                if (fila == 7 && columna == 4) {
                    tablero[fila][columna].setIcon(reina1.getImagen());
                }
                columna++;
                tableroDefecto(fila, columna);
            } else {
                columna = 0;
                fila++;
                tableroDefecto(fila, columna);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_00;
    private javax.swing.JButton jb_01;
    private javax.swing.JButton jb_02;
    private javax.swing.JButton jb_03;
    private javax.swing.JButton jb_04;
    private javax.swing.JButton jb_05;
    private javax.swing.JButton jb_06;
    private javax.swing.JButton jb_07;
    private javax.swing.JButton jb_10;
    private javax.swing.JButton jb_11;
    private javax.swing.JButton jb_12;
    private javax.swing.JButton jb_13;
    private javax.swing.JButton jb_14;
    private javax.swing.JButton jb_15;
    private javax.swing.JButton jb_16;
    private javax.swing.JButton jb_17;
    private javax.swing.JButton jb_20;
    private javax.swing.JButton jb_21;
    private javax.swing.JButton jb_22;
    private javax.swing.JButton jb_23;
    private javax.swing.JButton jb_24;
    private javax.swing.JButton jb_25;
    private javax.swing.JButton jb_26;
    private javax.swing.JButton jb_27;
    private javax.swing.JButton jb_30;
    private javax.swing.JButton jb_31;
    private javax.swing.JButton jb_32;
    private javax.swing.JButton jb_33;
    private javax.swing.JButton jb_34;
    private javax.swing.JButton jb_35;
    private javax.swing.JButton jb_36;
    private javax.swing.JButton jb_37;
    private javax.swing.JButton jb_40;
    private javax.swing.JButton jb_41;
    private javax.swing.JButton jb_42;
    private javax.swing.JButton jb_43;
    private javax.swing.JButton jb_44;
    private javax.swing.JButton jb_45;
    private javax.swing.JButton jb_46;
    private javax.swing.JButton jb_47;
    private javax.swing.JButton jb_50;
    private javax.swing.JButton jb_51;
    private javax.swing.JButton jb_52;
    private javax.swing.JButton jb_53;
    private javax.swing.JButton jb_54;
    private javax.swing.JButton jb_55;
    private javax.swing.JButton jb_56;
    private javax.swing.JButton jb_57;
    private javax.swing.JButton jb_60;
    private javax.swing.JButton jb_61;
    private javax.swing.JButton jb_62;
    private javax.swing.JButton jb_63;
    private javax.swing.JButton jb_64;
    private javax.swing.JButton jb_65;
    private javax.swing.JButton jb_66;
    private javax.swing.JButton jb_67;
    private javax.swing.JButton jb_70;
    private javax.swing.JButton jb_71;
    private javax.swing.JButton jb_72;
    private javax.swing.JButton jb_73;
    private javax.swing.JButton jb_74;
    private javax.swing.JButton jb_75;
    private javax.swing.JButton jb_76;
    private javax.swing.JButton jb_77;
    // End of variables declaration//GEN-END:variables
}
