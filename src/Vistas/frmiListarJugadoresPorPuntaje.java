/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.EstadioData;
import Data.JugadorData;
import Modelo.Conexion;
import Modelo.Estadio;
import Modelo.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romi
 */
public class frmiListarJugadoresPorPuntaje extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    /**
     * Creates new form frmiListar
     */
    public frmiListarJugadoresPorPuntaje() {
        initComponents();
        model =new DefaultTableModel();
//        cargarCbo();
        armarCabeceraTablaJugador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtListas = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Listas");

        jtListas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtListas);

        btnListar.setText("Ver Estadios");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
          cargarDatos();
    }//GEN-LAST:event_btnListarMouseClicked
public void armarCabeceraTablaJugador(){
        ArrayList<Object> column= new ArrayList<Object>();
        column.add("Id");
        column.add("Nombre");
        column.add("Puntaje");
        for(Object it:column){
            model.addColumn(it);
        }
        jtListas.setModel(model);
}
public void borrarFilas(){
        int a=model.getRowCount()-1;
        for (int i = a; i >=0; i--) {
            {
            model.removeRow(i);
            }
    }
}
//public void cargarCbo(){
//        try {
//            Conexion con = new Conexion();
//            JugadorData jugador=new JugadorData(con);
//             List<Jugador> juga= jugador.buscarTodosJugadores();
//            for (int i = 0; i < juga.size(); i++) {
//                cboListar.addItem(juga.get(i)); 
//            }
//        } catch (ClassNotFoundException ex) {
//            System.out.println("Error al cargar cbo" +ex);
//        }}
public void cargarDatos(){
        try {
            List<Jugador> lista=null;
            borrarFilas();
            Conexion con =new Conexion();
            JugadorData jd= new JugadorData(con);
//            Jugador a= (Jugador)cboListar.getSelectedItem();
            lista= (List) jd.listarPuntajeDeJugadores();
            for(Jugador i:lista ){
                //if(a.getIdAlumno()==i.getAlumno().getIdAlumno())
                 model.addRow(new Object[]{i.getIdJugador(),i.getNombre(),i.getPuntaje()});
            }   } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiListarJugadoresPorPuntaje.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtListas;
    // End of variables declaration//GEN-END:variables
}
