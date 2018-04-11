package main;

import java.awt.event.ActionEvent;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        
        btnProgramacion.addActionListener((ActionEvent e) -> {
            
            Main.this.setTitle("Programación");
        });
        
        btnBases.addActionListener((ActionEvent e) -> {
            
            Main.this.setTitle("Bases de Datos");
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProgramacion = new javax.swing.JButton();
        btnBases = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CURSO DAM");

        btnProgramacion.setText("Programación");

        btnBases.setText("Bases");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnProgramacion)
                .addGap(73, 73, 73)
                .addComponent(btnBases)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProgramacion)
                    .addComponent(btnBases))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBases;
    private javax.swing.JButton btnProgramacion;
    // End of variables declaration//GEN-END:variables
}
