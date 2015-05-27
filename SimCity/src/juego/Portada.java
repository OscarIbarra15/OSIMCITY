package juego;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Portada extends javax.swing.JFrame {
    public Portada() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelUABC = new javax.swing.JLabel();
        BotonHaciaMinijuegos = new javax.swing.JButton();
        BotonHaciaOsimCity = new javax.swing.JButton();
        LabelOsimCity = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCiudad = new javax.swing.JMenu();
        MenuIrAOsimCity = new javax.swing.JMenuItem();
        MenuMinijuegos = new javax.swing.JMenuItem();
        MenuInfoJuego = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        MenuCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OSIM CITY");
        setMaximumSize(new java.awt.Dimension(1350, 800));
        setPreferredSize(new java.awt.Dimension(1350, 700));
        setSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(null);

        LabelUABC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUABC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/UABC.png"))); // NOI18N
        getContentPane().add(LabelUABC);
        LabelUABC.setBounds(1180, 30, 100, 170);

        BotonHaciaMinijuegos.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        BotonHaciaMinijuegos.setText("Ir a MININUEGOS");
        BotonHaciaMinijuegos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        BotonHaciaMinijuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHaciaMinijuegosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonHaciaMinijuegos);
        BotonHaciaMinijuegos.setBounds(1160, 600, 120, 23);

        BotonHaciaOsimCity.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        BotonHaciaOsimCity.setText("Ir a OSIM City");
        BotonHaciaOsimCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        BotonHaciaOsimCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHaciaOsimCityActionPerformed(evt);
            }
        });
        getContentPane().add(BotonHaciaOsimCity);
        BotonHaciaOsimCity.setBounds(20, 600, 110, 21);

        LabelOsimCity.setFont(new java.awt.Font("Tunga", 1, 48)); // NOI18N
        LabelOsimCity.setForeground(new java.awt.Color(255, 255, 255));
        LabelOsimCity.setText("OSIM City");
        getContentPane().add(LabelOsimCity);
        LabelOsimCity.setBounds(40, 60, 190, 70);

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/FondoProyecto.png"))); // NOI18N
        LabelFondo.setText("jLabel1");
        LabelFondo.setMaximumSize(new java.awt.Dimension(1400, 700));
        LabelFondo.setMinimumSize(new java.awt.Dimension(1400, 700));
        LabelFondo.setPreferredSize(new java.awt.Dimension(1400, 700));
        getContentPane().add(LabelFondo);
        LabelFondo.setBounds(0, 0, 1360, 700);

        MenuCiudad.setIcon(new javax.swing.ImageIcon("C:\\Users\\SauL Ibarra\\Documents\\NetBeansProjects\\SimCity\\src\\datos\\boton_inicio.png")); // NOI18N
        MenuCiudad.setText("Ciudad");
        MenuCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MenuIrAOsimCity.setText("OSIM City");
        MenuIrAOsimCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIrAOsimCityActionPerformed(evt);
            }
        });
        MenuCiudad.add(MenuIrAOsimCity);

        MenuMinijuegos.setText("Minijuegos");
        MenuMinijuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMinijuegosActionPerformed(evt);
            }
        });
        MenuCiudad.add(MenuMinijuegos);

        MenuInfoJuego.setText("Informacion del Juego");
        MenuCiudad.add(MenuInfoJuego);

        jMenuBar1.add(MenuCiudad);

        MenuSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\SauL Ibarra\\Documents\\NetBeansProjects\\SimCity\\src\\datos\\Salir.png")); // NOI18N
        MenuSalir.setText("Salir");

        MenuCerrar.setText("Cerrar");
        MenuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCerrarActionPerformed(evt);
            }
        });
        MenuSalir.add(MenuCerrar);

        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuIrAOsimCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIrAOsimCityActionPerformed
        OsimCity Pantalla = new OsimCity();
        Pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuIrAOsimCityActionPerformed

    private void MenuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCerrarActionPerformed
        JOptionPane.showMessageDialog(null,"Haz finalizado tu sesion en OSIM City","GRACIAS",JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_MenuCerrarActionPerformed

    private void MenuMinijuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMinijuegosActionPerformed
        Minijuegos Pantalla = new Minijuegos();
        Pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuMinijuegosActionPerformed

    private void BotonHaciaOsimCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHaciaOsimCityActionPerformed
        OsimCity Pantalla = new OsimCity();
        Pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonHaciaOsimCityActionPerformed

    private void BotonHaciaMinijuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHaciaMinijuegosActionPerformed
        Minijuegos Pantalla = new Minijuegos();
        Pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonHaciaMinijuegosActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonHaciaMinijuegos;
    private javax.swing.JButton BotonHaciaOsimCity;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelOsimCity;
    private javax.swing.JLabel LabelUABC;
    private javax.swing.JMenuItem MenuCerrar;
    private javax.swing.JMenu MenuCiudad;
    private javax.swing.JMenuItem MenuInfoJuego;
    private javax.swing.JMenuItem MenuIrAOsimCity;
    private javax.swing.JMenuItem MenuMinijuegos;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
