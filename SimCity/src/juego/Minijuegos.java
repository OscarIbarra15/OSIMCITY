
package juego;

import javax.swing.JFrame;

public class Minijuegos extends javax.swing.JFrame {

    
    
    public Minijuegos() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBInicio = new javax.swing.JButton();
        jMiniJuegos = new javax.swing.JLabel();
        jMaze = new javax.swing.JLabel();
        btnMaze = new javax.swing.JButton();
        JBuscaMinas = new javax.swing.JLabel();
        ImagenBuscaminas = new javax.swing.JLabel();
        btnBuscaMinas = new javax.swing.JButton();
        jSnake = new javax.swing.JLabel();
        ImagenSnake = new javax.swing.JLabel();
        btnSnake = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minijuegos");
        setMaximumSize(new java.awt.Dimension(1400, 720));
        setMinimumSize(new java.awt.Dimension(1400, 720));
        getContentPane().setLayout(null);

        JBInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/Boton Inicio.png"))); // NOI18N
        JBInicio.setText("Inicio");
        JBInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        JBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(JBInicio);
        JBInicio.setBounds(1190, 20, 90, 50);

        jMiniJuegos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jMiniJuegos.setForeground(new java.awt.Color(255, 0, 0));
        jMiniJuegos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMiniJuegos.setText("Mini Juegos");
        getContentPane().add(jMiniJuegos);
        jMiniJuegos.setBounds(270, 10, 650, 30);

        jMaze.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMaze.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMaze.setText("Maze");
        jMaze.setToolTipText("");
        getContentPane().add(jMaze);
        jMaze.setBounds(590, 340, 70, 30);

        btnMaze.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMaze.setText("Iniciar");
        btnMaze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMazeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaze);
        btnMaze.setBounds(580, 130, 73, 23);

        JBuscaMinas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBuscaMinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBuscaMinas.setText("Busca Minas");
        getContentPane().add(JBuscaMinas);
        JBuscaMinas.setBounds(830, 340, 110, 30);

        ImagenBuscaminas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/BuscaminasLogo.png"))); // NOI18N
        getContentPane().add(ImagenBuscaminas);
        ImagenBuscaminas.setBounds(790, 160, 190, 190);

        btnBuscaMinas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscaMinas.setText("Iniciar");
        btnBuscaMinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMinasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaMinas);
        btnBuscaMinas.setBounds(840, 130, 73, 23);

        jSnake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSnake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSnake.setText("Snake");
        getContentPane().add(jSnake);
        jSnake.setBounds(310, 330, 80, 30);

        ImagenSnake.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ImagenSnake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/SnakeLogo.png"))); // NOI18N
        getContentPane().add(ImagenSnake);
        ImagenSnake.setBounds(250, 160, 190, 170);

        btnSnake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSnake.setText("Iniciar");
        btnSnake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnakeActionPerformed(evt);
            }
        });
        getContentPane().add(btnSnake);
        btnSnake.setBounds(300, 130, 73, 23);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/FondoMinijuegos.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1340, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInicioActionPerformed
        Portada Pantalla = new Portada();
        Pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBInicioActionPerformed

    private void btnSnakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnakeActionPerformed
        // TODO add your handling code here:
        SnakeGameThread SGT = new SnakeGameThread();
    	Thread Snake = new Thread(SGT);
    	Snake.start();
    }//GEN-LAST:event_btnSnakeActionPerformed

    private void btnMazeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMazeActionPerformed
        Maze obj;
        obj = new Maze();
    }//GEN-LAST:event_btnMazeActionPerformed

    private void btnBuscaMinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMinasActionPerformed
        // TODO add your handling code here:
        Frame obj;
        obj = new Frame();
    }//GEN-LAST:event_btnBuscaMinasActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Minijuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenBuscaminas;
    private javax.swing.JLabel ImagenSnake;
    private javax.swing.JButton JBInicio;
    private javax.swing.JLabel JBuscaMinas;
    private javax.swing.JButton btnBuscaMinas;
    private javax.swing.JButton btnMaze;
    private javax.swing.JButton btnSnake;
    private javax.swing.JLabel jMaze;
    private javax.swing.JLabel jMiniJuegos;
    private javax.swing.JLabel jSnake;
    // End of variables declaration//GEN-END:variables
}
