package Formularios;
import clinica_veterinaria.paciente;

import javax.swing.JOptionPane;

public class InfoPaciente extends javax.swing.JFrame {
    static paciente p1 = new paciente();

    public InfoPaciente() {
        this.setTitle("Ingreso paciente");
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jOptionPane1 = new javax.swing.JOptionPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        Panel = new javax.swing.JPanel();
        LBL_Name = new javax.swing.JLabel();
        Text_Name = new javax.swing.JTextField();
        LBL_titular = new javax.swing.JLabel();
        Text_Titular = new javax.swing.JTextField();
        LBL_raza = new javax.swing.JLabel();
        Text_raza = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextA_sintomas = new javax.swing.JTextArea();
        Button_enviar1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBL_Name.setText("Nombre Paciente:");

        Text_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NameActionPerformed(evt);
            }
        });

        LBL_titular.setText("Titular del paciente:");

        Text_Titular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_TitularActionPerformed(evt);
            }
        });

        LBL_raza.setText("Raza:");

        Text_raza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_razaActionPerformed(evt);
            }
        });

        jLabel1.setText("Escriba los sintomas en el siguiente area:");

        TextA_sintomas.setColumns(20);
        TextA_sintomas.setRows(5);
        TextA_sintomas.setText(" \n");
        jScrollPane1.setViewportView(TextA_sintomas);

        Button_enviar1.setText("Enviar");
        Button_enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_enviar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_titular)
                            .addComponent(LBL_Name)
                            .addComponent(LBL_raza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_Name)
                            .addComponent(Text_Titular)
                            .addComponent(Text_raza, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Button_enviar1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Name)
                    .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_titular)
                    .addComponent(Text_Titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_raza)
                    .addComponent(Text_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Button_enviar1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NameActionPerformed

    private void Text_TitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_TitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_TitularActionPerformed

    private void Text_razaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_razaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_razaActionPerformed

    private void Button_enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_enviar1ActionPerformed
        p1.setNombre(Text_Name.getText());
        p1.setTitular(Text_Titular.getText());
        p1.setRaza(Text_raza.getText());
        p1.setSintomas(TextA_sintomas.getText());
        
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Datos guardados con exito!");
        new Procedimientos().setVisible(true);
    }//GEN-LAST:event_Button_enviar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_enviar1;
    private javax.swing.JLabel LBL_Name;
    private javax.swing.JLabel LBL_raza;
    private javax.swing.JLabel LBL_titular;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextArea TextA_sintomas;
    private javax.swing.JTextField Text_Name;
    private javax.swing.JTextField Text_Titular;
    private javax.swing.JTextField Text_raza;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
