/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.EncuentroData;
import Data.EstadioData;
import Data.JugadorData;
import Data.TorneoData;
import Modelo.Conexion;
import Modelo.Encuentro;
import Modelo.Estadio;
import Modelo.Jugador;
import Modelo.Torneo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romi
 */
public class frmiModificarEncuentro extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiModificarEncuentro1
     */
    public frmiModificarEncuentro() {
        initComponents();
          limpiar();
        tfResultado.setVisible(false);
        cboJugadorGanador.setVisible(false);
         jLabel4.setVisible(false);
        jLabel5.setVisible(false); 
    }
public void cargarCbo(){
        cboEstadio.removeAllItems();
        cboJugador1.removeAllItems();
        cboJugador2.removeAllItems();
        cboJugadorGanador.removeAllItems();
        cboEncuentro.removeAllItems();
        cboTorneo.removeAllItems();
        try {
            Conexion con = new Conexion();
            JugadorData jugador=new JugadorData(con);
             List<Jugador> juga= jugador.buscarTodosJugadores();
            for (int i = 0; i < juga.size(); i++) {
                cboJugador1.addItem(juga.get(i).toString()); 
            }
            List<Jugador> juga2= jugador.buscarTodosJugadores();
            for (int i = 0; i < juga2.size(); i++) {
                cboJugador2.addItem(juga2.get(i).toString()); 
            }
            EstadioData jd=new EstadioData(con);
            List<Estadio> tor= jd.buscarTodosEstadio();
            for (int i = 0; i < tor.size(); i++) {
                cboEstadio.addItem(tor.get(i).toString()); 
            }
            TorneoData orneo=new TorneoData(con);
            List<Torneo> tor1= orneo.devolverTodosTorneos();
            for (int i = 0; i < tor1.size(); i++) {
                cboTorneo.addItem(tor1.get(i).toString()); 
            }
             EncuentroData e= new EncuentroData(con);
              List<Encuentro> tor2= e.devolverTodosEncuentros();
            for (int i = 0; i < tor2.size(); i++) {
                cboEncuentro.addItem(tor2.get(i)); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar cbo" +ex);
        }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboEncuentro = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboEstadio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbActivo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdFec = new com.toedter.calendar.JDateChooser();
        cboTorneo = new javax.swing.JComboBox<>();
        cboJugador1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboJugador2 = new javax.swing.JComboBox<>();
        tfResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cboJugadorGanador = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setResizable(true);

        cboEncuentro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEncuentroItemStateChanged(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        jLabel4.setText("Resultado");

        jLabel5.setText("Jugador Ganador");

        cbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActivoActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado");

        jLabel7.setText("Activo");

        jdFec.setDateFormatString("yyyy/MM/dd");

        cboJugador1.setToolTipText("");
        cboJugador1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboJugador1ItemStateChanged(evt);
            }
        });
        cboJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJugador1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Torneo");

        tfResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfResultadoKeyTyped(evt);
            }
        });

        jLabel1.setText("Jugador1");

        jLabel2.setText("Jugador 2");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programado", "En Juego", "Finalizado" }));
        cboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEstadoItemStateChanged(evt);
            }
        });

        jLabel3.setText("Fecha de Encuentro");

        jLabel11.setText("Estadio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(279, Short.MAX_VALUE)
                        .addComponent(btnModificar)
                        .addGap(59, 59, 59)
                        .addComponent(btnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(cboEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbActivo)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(50, 50, 50)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfResultado)
                                        .addComponent(cboJugadorGanador, 0, 206, Short.MAX_VALUE)
                                        .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cboTorneo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(92, 92, 92)
                                .addComponent(cboEstadio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(jdFec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboJugador1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboJugador2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cboEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdFec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboJugadorGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbActivo)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboEncuentroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEncuentroItemStateChanged
        
    }//GEN-LAST:event_cboEncuentroItemStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        try {
            Conexion con = new Conexion();
            Encuentro j=new Encuentro();
            EncuentroData jd=new EncuentroData(con);
            JugadorData jugador=new JugadorData(con);
            EstadioData ed= new EstadioData(con);
            TorneoData td= new TorneoData(con);
            Torneo t= new Torneo();
            Estadio e= new Estadio();
            Jugador j1= new Jugador();
            List<Jugador> juga= jugador.buscarTodosJugadores();
                for (int i = 0; i < juga.size(); i++) {
                    if(juga.get(i).toString().equals(cboJugador1.getSelectedItem().toString())){
                        j1=(Jugador)juga.get(i);
                   }}
            j.setJugador1(j1);
            List<Jugador> juga1= jugador.buscarTodosJugadores();
                for (int i = 0; i < juga1.size(); i++) {
                    if(juga.get(i).toString().equals(cboJugador2.getSelectedItem().toString())){
                        j1=(Jugador)juga1.get(i);
                   }}
            j.setJugador2(j1);
            Date fecini=(Date) jdFec.getDate();
            LocalDate ld=fecini.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            j.setFechaEncuentro(ld);
             List<Estadio> est= ed.buscarTodosEstadio();
                for (int i = 0; i < est.size(); i++) {
                    if(est.get(i).toString().equals(cboJugador1.getSelectedItem().toString())){
                        e=(Estadio)est.get(i);
                   }}
            j.setEstadio(e);
            j.setResultado(tfResultado.getText());
            Jugador j11=new Jugador();
            if (cboEstado.getSelectedItem().equals("Programado")||cboEstado.getSelectedItem().equals("En Juego"))
                    {j.setJugadorGanador(j11);
                   }
            else{
                System.out.println("o acaestre ");
                List<Jugador> jugaG= jugador.buscarTodosJugadores();
                for (int i = 0; i < jugaG.size(); i++) {
                    if(jugaG.get(i).toString().equals(cboJugadorGanador.getSelectedItem().toString())){
                        j1=(Jugador)jugaG.get(i);
                   }}
            j.setJugadorGanador(j1);}
            j.setActivo(cbActivo.isSelected());
            j.setEstado(cboEstado.getSelectedItem().toString());
            List<Torneo> torneo= td.devolverTodosTorneos();
                for (int i = 0; i < torneo.size(); i++) {
                    if(torneo.get(i).toString().equals(cboTorneo.getSelectedItem().toString())){
                        t=(Torneo)torneo.get(i);
                }}
            j.setTorneo(t);
            boolean a = jd.modificarEncuentro(j);
            if(a) {
               JOptionPane.showMessageDialog(null,"El encuentro se modifico con exito"); 
            } else {
                JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos:" );
            }
            jd.calcularRankingPuntaje();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiAgregarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarCbo();
       
    }//GEN-LAST:event_btnModificarMouseClicked
    public void limpiar(){
        cargarCbo();
         tfResultado.setText("");
        cbActivo.setSelected(false);
        cboEstadio.setSelectedItem(null);
        cboEstado.setSelectedIndex(0);
        cboJugador1.setSelectedItem(null);
        cboJugador2.setSelectedItem(null);
        cboJugadorGanador.setSelectedItem(null);
        cboEncuentro.setSelectedItem(null);
        cboTorneo.setSelectedItem(null);
    
    
    }
    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
       
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void cbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActivoActionPerformed

    private void cboJugador1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboJugador1ItemStateChanged
        if(evt.getSource()==cboJugador1){
            cboJugador2.removeItem(cboJugador1.getSelectedItem());}
    }//GEN-LAST:event_cboJugador1ItemStateChanged

    private void cboJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJugador1ActionPerformed

    }//GEN-LAST:event_cboJugador1ActionPerformed

    private void tfResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfResultadoKeyTyped
//        char c=evt.getKeyChar();
//        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_tfResultadoKeyTyped

    private void cboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEstadoItemStateChanged
        if(evt.getSource()==cboEstado){
            if(cboEstado.getSelectedItem().toString()=="Finalizado")
            {
                tfResultado.setVisible(true);
                cboJugadorGanador.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                cboJugadorGanador.removeAllItems();
                cboJugadorGanador.addItem(cboJugador1.getSelectedItem().toString());
                cboJugadorGanador.addItem(cboJugador2.getSelectedItem().toString());
            }
            else{
                tfResultado.setVisible(false);
                cboJugadorGanador.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
            }
        }
    }//GEN-LAST:event_cboEstadoItemStateChanged

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
      
            try {
                Conexion con = new Conexion();
                Encuentro j=new Encuentro();
                j=(Encuentro)cboEncuentro.getSelectedItem();
                System.out.println(j.toString());
                cboJugador1.setSelectedItem(j.getJugador1().toString());
                cboJugador2.setSelectedItem(j.getJugador2().toString());
                jdFec.setDate(java.sql.Date.valueOf(j.getFechaEncuentro()));
                if(j.getEstado().equals("Finalizado")){
                tfResultado.setText(j.getResultado());
                cboJugadorGanador.setSelectedItem(j.getJugadorGanador().toString()); 
                }
                 
                cboEstadio.setSelectedItem(j.getEstadio().toString());
                cboEstado.setSelectedItem(j.getEstado());
                cbActivo.setSelected(j.isActivo());     
                cboTorneo.setSelectedItem(j.getTorneo().toString().toString());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmiAgregarSponsor.class.getName()).log(Level.SEVERE, null, ex);
                }

            
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JComboBox<Encuentro> cboEncuentro;
    private javax.swing.JComboBox<String> cboEstadio;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboJugador1;
    private javax.swing.JComboBox<String> cboJugador2;
    private javax.swing.JComboBox<String> cboJugadorGanador;
    private javax.swing.JComboBox<String> cboTorneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser jdFec;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}
