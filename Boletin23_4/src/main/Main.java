package main;

import java.awt.event.ActionEvent;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        btnToPanel2.addActionListener((ActionEvent e) -> {
            
            Panel1.setVisible(false);
            Panel2.setVisible(true);
        });
        
        btnToPanel1.addActionListener((ActionEvent e) -> {
            
            Panel1.setVisible(true);
            Panel2.setVisible(false);
        });
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel2 = new javax.swing.JPanel();
        btnToPanel1 = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        btnToPanel2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        btnToPanel1.setText("Ir a la ventana 2");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(btnToPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btnToPanel1)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        getContentPane().add(Panel2);

        btnToPanel2.setText("Ir a la ventana 1");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(btnToPanel2)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btnToPanel2)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        getContentPane().add(Panel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btnToPanel1;
    private javax.swing.JButton btnToPanel2;
    // End of variables declaration//GEN-END:variables
}
