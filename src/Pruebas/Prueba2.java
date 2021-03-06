/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import Agenda_GUI.GeneradorEventos;
import Agenda_GUI.DetectorEventosAgenda;
import Agenda_GUI.PaneldeControl;
/**
 *
 * @author alev2477
 */
public class Prueba2 extends javax.swing.JFrame implements DetectorEventosAgenda {

    private PaneldeControl panelControl;
    /**
     * Creates new form Prueba1
     */
    public Prueba2() {
        initComponents();
        
        
        panelControl = new PaneldeControl(agenda1);
        agenda1.addEscucharEventosAgenda(this);
        jTextoMes.setText(agenda1.MostrarMesActual());
        jTextAnno.setText(agenda1.MostrarAnnoActual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTexto1 = new javax.swing.JTextField();
        jBoton1 = new javax.swing.JButton();
        jBoton2 = new javax.swing.JButton();
        agenda1 = new Agenda_GUI.Agenda();
        jBoton3 = new javax.swing.JButton();
        jTexto2 = new javax.swing.JTextField();
        jTexto3 = new javax.swing.JTextField();
        jTexto4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBdecMes = new javax.swing.JButton();
        jBincMes = new javax.swing.JButton();
        jTextoMes = new javax.swing.JTextField();
        jTextAnno = new javax.swing.JTextField();
        paneldeControl1 = new Agenda_GUI.PaneldeControl();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBoton1.setText("Agregar tarea");
        jBoton1.setToolTipText("");
        jBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton1ActionPerformed(evt);
            }
        });

        jBoton2.setText("Mostrar tarea");
        jBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton2ActionPerformed(evt);
            }
        });

        jBoton3.setText("Ocultar Tarea");
        jBoton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton3ActionPerformed(evt);
            }
        });

        jTexto3.setText("Comer");

        jTexto4.setText("12:00");
        jTexto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexto4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha");

        jLabel2.setText("Tarea");

        jLabel3.setText("Hora");

        jBdecMes.setText("-mes");
        jBdecMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdecMesActionPerformed(evt);
            }
        });

        jBincMes.setText("+mes");
        jBincMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBincMesActionPerformed(evt);
            }
        });

        jTextoMes.setEditable(false);
        jTextoMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextAnno.setEditable(false);
        jTextAnno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(agenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jBdecMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextAnno, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTextoMes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBincMes)
                        .addGap(64, 64, 64)
                        .addComponent(paneldeControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBoton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBoton2)
                            .addComponent(jBoton3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jTextAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBdecMes)
                        .addComponent(jTextoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBincMes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addComponent(jBoton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBoton2)
                .addGap(58, 58, 58)
                .addComponent(jBoton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(paneldeControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton1ActionPerformed
        agenda1.CalendarioAgenda.Hacercita(jTexto1.getText(), jTexto3.getText(), 
                jTexto4.getText());
        agenda1.MostrarTareasxDia(jTexto1.getText());
    }//GEN-LAST:event_jBoton1ActionPerformed

    private void jBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton2ActionPerformed
        agenda1.MostrarTareasxDia(jTexto1.getText());
    }//GEN-LAST:event_jBoton2ActionPerformed

    private void jBoton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton3ActionPerformed
        agenda1.ocultarTareasxDia(jTexto1.getText());
    }//GEN-LAST:event_jBoton3ActionPerformed

    private void jTexto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexto4ActionPerformed

    private void jBdecMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdecMesActionPerformed
           
        agenda1.decrementarUnMes();
        jTextoMes.setText(agenda1.MostrarMesActual());
        jTextAnno.setText(agenda1.MostrarAnnoActual());
    }//GEN-LAST:event_jBdecMesActionPerformed

    private void jBincMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBincMesActionPerformed
        agenda1.incrementarUnMes();
        jTextoMes.setText(agenda1.MostrarMesActual());
        jTextAnno.setText(agenda1.MostrarAnnoActual());
        
    }//GEN-LAST:event_jBincMesActionPerformed

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
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Agenda_GUI.Agenda agenda1;
    private javax.swing.JButton jBdecMes;
    private javax.swing.JButton jBincMes;
    private javax.swing.JButton jBoton1;
    private javax.swing.JButton jBoton2;
    private javax.swing.JButton jBoton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextAnno;
    private javax.swing.JTextField jTexto1;
    private javax.swing.JTextField jTexto2;
    private javax.swing.JTextField jTexto3;
    private javax.swing.JTextField jTexto4;
    private javax.swing.JTextField jTextoMes;
    private Agenda_GUI.PaneldeControl paneldeControl1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void EventoAgendaActuando(GeneradorEventos o, Object arg) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     if(agenda1.getevento()==agenda1.ClICKPANEL)
               jTexto1.setText(agenda1.getTareaString());
     if(agenda1.getevento()==agenda1.CLICKTAREA)
               jTexto2.setText(agenda1.getTareaString());       
    }
    
}
