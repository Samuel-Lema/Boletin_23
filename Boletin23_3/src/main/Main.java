package main;

import java.awt.event.ActionEvent;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        btnSaudo.addActionListener((ActionEvent e) -> {
            
            lbMensaxe.setText("Un saudo a DAM.");
        });
        
        btnDespedida.addActionListener((ActionEvent e) -> {
            
            lbMensaxe.setText("Fin do programa.");
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaudo = new javax.swing.JButton();
        btnDespedida = new javax.swing.JButton();
        lbMensaxe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSaudo.setText("Saudo");

        btnDespedida.setText("Despedida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnSaudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnDespedida)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(lbMensaxe, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaudo)
                    .addComponent(btnDespedida))
                .addGap(62, 62, 62)
                .addComponent(lbMensaxe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDespedida;
    private javax.swing.JButton btnSaudo;
    private javax.swing.JLabel lbMensaxe;
    // End of variables declaration//GEN-END:variables
}
