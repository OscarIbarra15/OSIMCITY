package juego;

import javax.swing.JFrame;

public class OsimCity extends javax.swing.JFrame {

    public OsimCity() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBInicio = new javax.swing.JButton();
        JBMinijuegos = new javax.swing.JButton();
        MarioBros = new javax.swing.JLabel();
        JlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 720));
        setPreferredSize(new java.awt.Dimension(1400, 720));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        JBInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/Boton Inicio.png"))); // NOI18N
        JBInicio.setText("Inicio");
        JBInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        JBInicio.setFocusable(false);
        JBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(JBInicio);
        JBInicio.setBounds(1080, 30, 90, 50);

        JBMinijuegos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBMinijuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/Boton Ir.png"))); // NOI18N
        JBMinijuegos.setText("Minijuegos");
        JBMinijuegos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        JBMinijuegos.setFocusable(false);
        JBMinijuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMinijuegosActionPerformed(evt);
            }
        });
        getContentPane().add(JBMinijuegos);
        JBMinijuegos.setBounds(1220, 30, 130, 50);

        MarioBros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/MarioCorriendo.gif"))); // NOI18N
        getContentPane().add(MarioBros);
        MarioBros.setBounds(20, 650, 20, 40);

        JlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/Juego.png"))); // NOI18N
        getContentPane().add(JlFondo);
        JlFondo.setBounds(7, -5, 1390, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        int x = MarioBros.getX();
        int y = MarioBros.getY();
        
        if (evt.getKeyChar()=='d'){
            x = x + 6;
            MarioBros.setLocation(x, y);
        }
        
        
        if(MarioBros.getX()>1355){
            Minijuegos Pantalla = new Minijuegos();
            Pantalla.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void JBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInicioActionPerformed
        Portada Pantalla = new Portada();
        Pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBInicioActionPerformed

    private void JBMinijuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMinijuegosActionPerformed
        Minijuegos Pantalla = new Minijuegos();
        Pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBMinijuegosActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OsimCity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBInicio;
    private javax.swing.JButton JBMinijuegos;
    private javax.swing.JLabel JlFondo;
    private javax.swing.JLabel MarioBros;
    // End of variables declaration//GEN-END:variables
}
