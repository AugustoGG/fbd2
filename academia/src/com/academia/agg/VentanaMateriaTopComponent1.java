/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.agg;

import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.academia.agg//VentanaAlumno//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "VentanaAlumnoTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.academia.agg.VentanaAlumnoTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_VentanaAlumnoAction",
        preferredID = "VentanaAlumnoTopComponent"
)
@Messages({
    "CTL_VentanaAlumnoAction=VentanaAlumno",
    "CTL_VentanaAlumnoTopComponent=VentanaAlumno Window",
    "HINT_VentanaAlumnoTopComponent=This is a VentanaAlumno window"
})
public final class VentanaMateriaTopComponent1 extends TopComponent {

    public VentanaMateriaTopComponent1() {
        initComponents();
        setName(Bundle.CTL_VentanaAlumnoTopComponent());
        setToolTipText(Bundle.HINT_VentanaAlumnoTopComponent());
        putClientProperty(TopComponent.PROP_CLOSING_DISABLED, Boolean.TRUE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        textonombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoemail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID DE ALUMNO", "NOMBRE DEL ALUMNO", "EMAIL DEL ALUMNO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(227, 227, 227))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

        textonombre.setText(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.textonombre.text")); // NOI18N
        textonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textonombreActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jLabel3.text")); // NOI18N

        textoemail.setText(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.textoemail.text")); // NOI18N
        textoemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoemailActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resultado, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.resultado.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textonombre, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(textoemail)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(resultado)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jLabel4.text")); // NOI18N

        textoID.setText(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.textoID.text")); // NOI18N
        textoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIDActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton3, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID DEL ALUMNO", "NOMBRE DE ALUMNO", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jPanel5.TabConstraints.tabTitle"), jPanel5); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(VentanaMateriaTopComponent1.class, "VentanaMateriaTopComponent1.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textonombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textonombreActionPerformed

    private void textoemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoemailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
            // TODO add your handling code here:
 try {
           
            //desde aqui
        Connection con=Conexion.conectarse();
     CallableStatement callate=con.prepareCall("{call insertar_alumno(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,textonombre.getText());
        callate.setString(3,textoemail.getText());
      
        callate.execute();
        int pk=callate.getInt(1);
        //asta aca es codigo de base-datos source packages com.jc.model testProcedimiento
            resultado.setText("Se ha guardado el alumno con id:" +pk);
        } catch (Exception ex) {
            resultado.setText(ex.getMessage());
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        //Paso 1: nos conectamos
        Connection con=Conexion.conectarse();
        //Paso 2: Crear una sentencia SQL
        Statement st= con.createStatement();
        //PAso 3: CREAR UN QUERY (CONSULTA)
        ResultSet res = st.executeQuery("select * from alumno");
        int filas=0; 
        //Vamos a barrer todas las filas de la tabla
        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        //Vamos a llenar nuestro arraylist de alumnos conlos datos 
        //que llegan del oracle a traves de result que se llama res.
        while(res.next()){
            Alumno a=new Alumno(res.getInt(1),res.getString(2),res.getString(3));
            alumnos.add(a);
          filas++;
          
        }
        //Paso 4: copiamos la tabla
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [filas][3],
            new String [] { 
                "ID DE ALUMNO", "NOMBRE DEL ALUMNO", "EMAIL DEL ALUMNO"
            }
        ));
        //Paso 5: ya teniendo la informacion llenamos la tabla JAVA (jTablet)
            int fila=0;
        for(Alumno a:alumnos){
            jTable1.setValueAt(a.getId(), fila, 0);
            jTable1.setValueAt(a.getNombre(), fila, 1);
            jTable1.setValueAt(a.getEmail(), fila, 2);
            fila++;
        }
            }catch(Exception e){
                System.out.println("Esto salio mal"+e.getMessage());
                    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // TODO add your handling code here:
        try{
        //Paso 1: nos conectamos
        Connection con=Conexion.conectarse();
        //Paso 2: Crear una sentencia SQL
        Statement st= con.createStatement();
        //PAso 3: CREAR UN QUERY (CONSULTA)
        //Pedimos al texfilt su texto y lo transormamos a entero
        int id=Integer.parseInt(textoID.getText());
        ResultSet res = st.executeQuery("select * from alumno where id_alumno="+id);
        int filas; 
        //Vamos a barrer todas las filas de la tabla
        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        //Vamos a llenar nuestro arraylist de alumnos conlos datos 
        //que llegan del oracle a traves de result que se llama res.
        while(res.next()){
            Alumno a=new Alumno(res.getInt(1),res.getString(2),res.getString(3));
            alumnos.add(a);
        
          
        }
        //Paso 4: copiamos la tabla
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [alumnos.size()][3],
            new String [] { 
                "ID DE ALUMNO", "NOMBRE DEL ALUMNO", "EMAIL DEL ALUMNO"
            }
        ));
        //Paso 5: ya teniendo la informacion llenamos la tabla JAVA (jTablet)
            int fila=0;
        for(Alumno a:alumnos){
            jTable3.setValueAt(a.getId(), fila, 0);
            jTable3.setValueAt(a.getNombre(), fila, 1);
            jTable3.setValueAt(a.getEmail(), fila, 2);
        }
            }catch(Exception e){
                 System.out.println("Esto salio mal"+e.getMessage());
                    }
      
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField textoID;
    private javax.swing.JTextField textoemail;
    private javax.swing.JTextField textonombre;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
