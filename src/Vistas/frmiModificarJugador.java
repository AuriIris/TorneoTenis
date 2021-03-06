/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.JugadorData;
import Data.PatrocinioData;
import Data.SponsorData;
import Modelo.Conexion;
import Modelo.Jugador;
import Modelo.Patrocinio;
import Modelo.Sponsor;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romi
 */
public class frmiModificarJugador extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiModificarJugador
     */
    public frmiModificarJugador() {
        initComponents();
        cargarCbo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbDer = new javax.swing.JRadioButton();
        rbIzq = new javax.swing.JRadioButton();
        cbActivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cboEstilo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfDni = new javax.swing.JTextField();
        tfAltura = new javax.swing.JTextField();
        tfPeso = new javax.swing.JTextField();
        cboJugador = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setResizable(true);
        setTitle("Modificar Jugador");

        jLabel7.setText("Altura");

        jLabel8.setText("Peso");

        jLabel9.setText("Estilo");

        jLabel10.setText("Mano Habil");

        rbDer.setText("Der");

        rbIzq.setText("Izq");

        jLabel1.setText("Nombre");

        jLabel2.setText("Dni");

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        jLabel3.setText("Fecha de Nacimiento");

        cboEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agresivo", "Voleadores", "Jugadores" }));

        jLabel14.setText("Activo");

        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });
        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDniKeyTyped(evt);
            }
        });

        tfAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAlturaKeyTyped(evt);
            }
        });

        tfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPesoKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbActivo)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(btnModificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnLimpiar))))
                        .addComponent(jLabel14)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(rbDer)
                                    .addGap(28, 28, 28)
                                    .addComponent(rbIzq))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfDni)
                                        .addComponent(tfNombre)
                                        .addComponent(tfAltura)
                                        .addComponent(tfPeso)
                                        .addComponent(cboEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(cboJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(tfPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbDer)
                    .addComponent(rbIzq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cargarCbo(){
        try {
            Conexion con = new Conexion();
            JugadorData jugador=new JugadorData(con);
             List<Jugador> juga= jugador.buscarTodosJugadores();
            for (int i = 0; i < juga.size(); i++) {
                cboJugador.addItem(juga.get(i)); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar cbo" +ex);
        }}
    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        tfAltura.setText("");
        tfNombre.setText("");
        tfDni.setText("");
        tfPeso.setText("");
        tfNombre.setText("");
        cbActivo.setSelected(false);
        cboEstilo.setSelectedIndex(0);
        rbDer.setSelected(false);
        rbIzq.setSelected(false);
         jDateChooser1.setDate(null);
         cboJugador.setSelectedIndex(0);
         
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        Jugador j= new Jugador();
        j= (Jugador) cboJugador.getSelectedItem();
        tfNombre.setText(j.getNombre());
        tfDni.setText(j.getDni()+"");
        Date fecFin=java.sql.Date.valueOf(j.getFechaNac());
        jDateChooser1.setDate(fecFin);
        tfAltura.setText(j.getAltura()+"");
        tfPeso.setText(j.getPeso()+"");
        cboEstilo.setSelectedItem(j.getEstilo().toString());
        if( j.getManoHabil().equals("Derecha"))
           rbDer.setSelected(true);
        if(j.getManoHabil().equals("Izquierda"))
            rbIzq.setSelected(true);
       cbActivo.setSelected(j.isActivo());
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
      try {
          boolean a;
            Conexion con = new Conexion();
            Jugador j=new Jugador();
            j=(Jugador)cboJugador.getSelectedItem();
            j.setNombre(tfNombre.getText());
            j.setDni(Integer.parseInt(tfDni.getText()));
            java.util.Date fecini=(java.util.Date) jDateChooser1.getDate();
            LocalDate ld=fecini.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            j.setFechaNac(ld);
            j.setAltura(Double.parseDouble(tfAltura.getText()));
            j.setPeso(Double.parseDouble(tfPeso.getText()));
            j.setEstilo(cboEstilo.getSelectedItem().toString());
            j.setActivo(cbActivo.isSelected());
            JugadorData jd=new JugadorData(con);
            a=jd.actualizarJugador(j);
            if(a) {
               JOptionPane.showMessageDialog(null,"El encuentro se modifico con exito"); 
            } else {
                JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos:" );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiAgregarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
        cboJugador.removeAllItems(); 
        cargarCbo();
    }//GEN-LAST:event_btnModificarMouseClicked

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniActionPerformed

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
       char c=evt.getKeyChar();
     if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_tfDniKeyTyped

    private void tfAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAlturaKeyTyped
       char c=evt.getKeyChar();
     if(c<'0'||c>'9'||c=='.')evt.consume();
    }//GEN-LAST:event_tfAlturaKeyTyped

    private void tfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesoKeyTyped
         char c=evt.getKeyChar();
     if(c<'0'||c>'9'||c=='.')evt.consume();
    }//GEN-LAST:event_tfPesoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JComboBox<String> cboEstilo;
    private javax.swing.JComboBox<Jugador> cboJugador;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbDer;
    private javax.swing.JRadioButton rbIzq;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPeso;
    // End of variables declaration//GEN-END:variables
}
