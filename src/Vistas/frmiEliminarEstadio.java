/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.EstadioData;
import Modelo.Conexion;
import Modelo.Estadio;
import Modelo.Torneo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romi
 */
public class frmiEliminarEstadio extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiEliminarEstadio
     */
    public frmiEliminarEstadio() {
        initComponents();
        cargarCbo(); 
    }
  public void cargarCbo(){
        try {
            Conexion con = new Conexion();
            EstadioData jd=new EstadioData(con);
            
            List<Estadio> tor= jd.buscarTodosEstadio();
            for (int i = 0; i < tor.size(); i++) {
                if(tor.get(i).isActivo()==true)
                CboEliminarEstadio.addItem(tor.get(i)); 
            }
            for (int i = 0; i < tor.size(); i++) {
                if(tor.get(i).isActivo()==false)
                CboActivarEstadio.addItem(tor.get(i)); 
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiModificarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        CboEliminarEstadio = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        CboActivarEstadio = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);
        setTitle("Eliminar/Activar Estadio");

        jLabel35.setText("Eliminar");

        jLabel36.setText("Estadio");

        jLabel37.setText("Activar");

        jButton1.setText("Eliminar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnActivar.setText("Activar");
        btnActivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActivarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActivarMouseEntered(evt);
            }
        });

        jLabel34.setText("Estadio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel35)
                                .addGap(338, 338, 338))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(CboEliminarEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActivar)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(55, 55, 55)
                        .addComponent(CboActivarEstadio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel35)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(CboEliminarEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(CboActivarEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnActivar)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         try {
            Conexion con = new Conexion();
            Estadio p=new Estadio();
            EstadioData ed=new EstadioData(con);
            p=(Estadio)CboEliminarEstadio.getSelectedItem();
            ed.bajaEstadio(p.getIdEstadio());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiEliminarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
         CboActivarEstadio.removeAllItems();
         CboEliminarEstadio.removeAllItems(); 
        cargarCbo();
        
                   
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnActivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActivarMouseEntered

    private void btnActivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivarMouseClicked
   try {
            Conexion con = new Conexion();
            Estadio p=new Estadio();
            EstadioData ed=new EstadioData(con);
            p=(Estadio)CboActivarEstadio.getSelectedItem();
            ed.altaEstadio(p.getIdEstadio());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiEliminarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
         CboActivarEstadio.removeAllItems();
         CboEliminarEstadio.removeAllItems(); 
        cargarCbo();        // TODO add your handling code here:
    }//GEN-LAST:event_btnActivarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Estadio> CboActivarEstadio;
    private javax.swing.JComboBox<Estadio> CboEliminarEstadio;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    // End of variables declaration//GEN-END:variables
}
