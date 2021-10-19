/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu_visualizadorimagen;

import java.awt.event.ItemEvent;

/**
 *
 * @author jorge
 */
public class VisualizadorImagen extends javax.swing.JFrame {

    /**
     * Creates new form VisualizadorImagen
     */
    public VisualizadorImagen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        todos = new javax.swing.JCheckBox();
        verde = new javax.swing.JCheckBox();
        rojo = new javax.swing.JCheckBox();
        azul = new javax.swing.JCheckBox();
        Ad = new javax.swing.JRadioButton();
        Ai = new javax.swing.JRadioButton();
        Bi = new javax.swing.JRadioButton();
        Bd = new javax.swing.JRadioButton();
        imagen1 = new com.mycompany.diu_visualizadorimagen.imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        todos.setText("Todos");
        todos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                todosItemStateChanged(evt);
            }
        });

        verde.setText("Verde");
        verde.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                verdeItemStateChanged(evt);
            }
        });

        rojo.setText("Rojo");
        rojo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rojoItemStateChanged(evt);
            }
        });

        azul.setText("Azul");
        azul.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                azulItemStateChanged(evt);
            }
        });

        Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdActionPerformed(evt);
            }
        });

        Ai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AiActionPerformed(evt);
            }
        });

        Bi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiActionPerformed(evt);
            }
        });

        Bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imagen1Layout = new javax.swing.GroupLayout(imagen1);
        imagen1.setLayout(imagen1Layout);
        imagen1Layout.setHorizontalGroup(
            imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        imagen1Layout.setVerticalGroup(
            imagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addGap(21, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rojo)
                    .addComponent(verde)
                    .addComponent(todos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ai)
                            .addComponent(azul)
                            .addComponent(Bd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bi)
                            .addComponent(Ad))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(todos)
                        .addGap(13, 13, 13)
                        .addComponent(verde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rojo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(azul)
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ai)
                            .addComponent(Ad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bi)
                            .addComponent(Bd)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void azulItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_azulItemStateChanged
        // TODO add your handling code here:
        if(!rojo.isSelected() && !verde.isSelected()){
            azul.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                todos.setSelected(false);
            }
            imagen1.capas(rojo.isSelected(), verde.isSelected(), azul.isSelected());
        } 
    }//GEN-LAST:event_azulItemStateChanged

    private void todosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_todosItemStateChanged
        // TODO add your handling code here:
        int estado = evt.getStateChange();
        if (estado == ItemEvent.SELECTED) {
            rojo.setSelected(true);
            verde.setSelected(true);
            azul.setSelected(true);
        }
    }//GEN-LAST:event_todosItemStateChanged

    private void rojoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rojoItemStateChanged
        // TODO add your handling code here:
          if(!verde.isSelected() && !azul.isSelected()){
            rojo.setSelected(true);
        } else {
            int estado = evt.getStateChange();
            if (estado != ItemEvent.SELECTED) {
                todos.setSelected(false);
            }
            imagen1.capas(rojo.isSelected(), verde.isSelected(), azul.isSelected());
        } 
    }//GEN-LAST:event_rojoItemStateChanged

    private void verdeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_verdeItemStateChanged
        // TODO add your handling code here:
         if(!rojo.isSelected() && !azul.isSelected()){
            verde.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                todos.setSelected(false);
            }
            imagen1.capas(rojo.isSelected(), verde.isSelected(), azul.isSelected());
        }       
    }//GEN-LAST:event_verdeItemStateChanged

    private void BiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiActionPerformed
        // TODO add your handling code here:
        imagen1.setCordenadas(335,330);
    }//GEN-LAST:event_BiActionPerformed

    private void AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdActionPerformed
        // TODO add your handling code here:
                imagen1.setCordenadas(350,0);
    }//GEN-LAST:event_AdActionPerformed

    private void BdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdActionPerformed
        // TODO add your handling code here:
                imagen1.setCordenadas(0,330);
    }//GEN-LAST:event_BdActionPerformed

    private void AiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AiActionPerformed
        // TODO add your handling code here:
                imagen1.setCordenadas(0,0);
    }//GEN-LAST:event_AiActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizadorImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizadorImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizadorImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizadorImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizadorImagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ad;
    private javax.swing.JRadioButton Ai;
    private javax.swing.JRadioButton Bd;
    private javax.swing.JRadioButton Bi;
    private javax.swing.JCheckBox azul;
    private com.mycompany.diu_visualizadorimagen.imagen imagen1;
    private javax.swing.JCheckBox rojo;
    private javax.swing.JCheckBox todos;
    private javax.swing.JCheckBox verde;
    // End of variables declaration//GEN-END:variables
}
