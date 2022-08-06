
package Formularios;

import javax.swing.JOptionPane;

public class Procedimientos extends javax.swing.JFrame {
    
    static String procedimiento;

    public Procedimientos() {
        this.setTitle("Procedimientos");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LBL_Title = new javax.swing.JLabel();
        LBL_welcome = new javax.swing.JLabel();
        LBL_QueDesea = new javax.swing.JLabel();
        LBL_Opcion1 = new javax.swing.JLabel();
        LBL_Opcion2 = new javax.swing.JLabel();
        LBL_Opcion3 = new javax.swing.JLabel();
        LBL_Opcion4 = new javax.swing.JLabel();
        LBL_Opcion5 = new javax.swing.JLabel();
        LBL_Respuesta = new javax.swing.JTextField();
        Button_enviar2 = new javax.swing.JButton();
        LBL_Eleccion = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBL_welcome.setText("Bienvenido paciente");

        LBL_QueDesea.setText("Escoja el procedimiento que desea:");

        LBL_Opcion1.setText("1. Revision general                     $25");

        LBL_Opcion2.setText(" 2. Revision en profundidad       $50");

        LBL_Opcion3.setText("3. Radiografia                                $75");

        LBL_Opcion4.setText("4. Examenes de sangre              $100");

        LBL_Opcion5.setText("5. Cirugia                                         $200");

        LBL_Respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBL_RespuestaActionPerformed(evt);
            }
        });

        Button_enviar2.setText("Guardar");
        Button_enviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_enviar2ActionPerformed(evt);
            }
        });

        LBL_Eleccion.setText("Su eleccion:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(LBL_welcome)))
                .addGap(77, 77, 77)
                .addComponent(LBL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBL_Opcion3)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LBL_QueDesea)
                        .addComponent(LBL_Opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBL_Opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LBL_Opcion4)
                    .addComponent(LBL_Opcion5)))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL_Eleccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_enviar2))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBL_welcome))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(LBL_QueDesea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBL_Opcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_Opcion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_Opcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_Opcion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_Opcion5)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_enviar2)
                    .addComponent(LBL_Eleccion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBL_RespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBL_RespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LBL_RespuestaActionPerformed

    private void Button_enviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_enviar2ActionPerformed
        int resp = Integer.valueOf(LBL_Respuesta.getText());
        switch(resp){
            case 1:
                InfoPaciente.p1.setGastoProcedimientos(25);
                procedimiento="Revision general";
                break;
            case 2:
                InfoPaciente.p1.setGastoProcedimientos(50);
                procedimiento="Revision en profundidad";
                break;
            case 3:
                InfoPaciente.p1.setGastoProcedimientos(75);
                procedimiento="Radiografia";
                break;
            case 4:
                InfoPaciente.p1.setGastoProcedimientos(100);
                procedimiento="Examenes de sangre";
                break;
            case 5:
                InfoPaciente.p1.setGastoProcedimientos(200);
                procedimiento="Cirugia";
                break;
            default:
                InfoPaciente.p1.setGastoProcedimientos(9999);
                procedimiento="Cura del cancer";
                break;
        }
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Datos guardados con exito!");
        new Medicamentos().setVisible(true);
    }//GEN-LAST:event_Button_enviar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_enviar2;
    private javax.swing.JLabel LBL_Eleccion;
    private javax.swing.JLabel LBL_Opcion1;
    private javax.swing.JLabel LBL_Opcion2;
    private javax.swing.JLabel LBL_Opcion3;
    private javax.swing.JLabel LBL_Opcion4;
    private javax.swing.JLabel LBL_Opcion5;
    private javax.swing.JLabel LBL_QueDesea;
    private javax.swing.JTextField LBL_Respuesta;
    private javax.swing.JLabel LBL_Title;
    private javax.swing.JLabel LBL_welcome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

}
