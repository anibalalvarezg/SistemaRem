/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rem;

import DAO.PersonaDAO;
import VO.Persona;

import DAO.ciudadDAO;
import VO.Ciudad;

import DAO.AfpDAO;
import VO.Afp;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Drebin01
 */
public class RemIFMEditar extends javax.swing.JInternalFrame {

    /**
     * Creates new form RemIFMEditar
     */
    public RemIFMEditar() {
        initComponents();
        AfpDAO afp = new AfpDAO();
        ArrayList<Afp> listaAfp = afp.listaDeAfp();
        
        for(Afp a: listaAfp){
           comboAfp.addItem(a.getNombre());
        }
        
        ciudadDAO ciudad = new ciudadDAO();
        ArrayList<Ciudad> listaCiudad = ciudad.listaCiudad();

        for(Ciudad c: listaCiudad) {
            comboCiudad.addItem(c.getNombre());
        }
        mostrarListaPersonasInTable();
    }

    public void mostrarListaPersonasInTable(){
        PersonaDAO daoPersona = new PersonaDAO();
        DefaultTableModel model = (DefaultTableModel)jTableMostrar.getModel();
        Object[] row = new Object[12];
        ArrayList<Persona> listaPersonas = daoPersona.getListaPersonas();
        for(Persona p: listaPersonas){
            row[0]  = p.getRut();
            row[1]  = p.getNombre();
            row[2]  = p.getApellidoPat();
            row[3]  = p.getApellidoMat();
            row[4]  = p.getFechaNacimiento();
            row[5]  = p.getDireccion();
            row[6]  = p.getIdCiudad();
            row[7]  = p.getSueldoBase();
            row[8]  = p.getBonoColacion();
            row[9] = p.getBonoMovilizacion();
            row[10] = p.getIdAfp();
            row[11]  = p.getDv();
            model.addRow(row);
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

        fieldNombre = new javax.swing.JTextField();
        fieldApellidoM = new javax.swing.JTextField();
        fieldApellidoP = new javax.swing.JTextField();
        fieldNacimiento = new javax.swing.JTextField();
        fieldDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldSueldoBase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldBonoColacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldBonoMovilizacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboAfp = new javax.swing.JComboBox<>();
        comboCiudad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        fieldDV = new javax.swing.JTextField();
        fieldRut = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Editar Persona");

        fieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNombreKeyTyped(evt);
            }
        });

        fieldApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldApellidoMKeyTyped(evt);
            }
        });

        fieldApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldApellidoPKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Materno");

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Dirección");

        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setText("Ciudad");

        jLabel7.setText("Sueldo Base");

        fieldSueldoBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldSueldoBaseKeyTyped(evt);
            }
        });

        jLabel8.setText("Bono Colación");

        fieldBonoColacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldBonoColacionKeyTyped(evt);
            }
        });

        jLabel9.setText("Bono Movilización");

        fieldBonoMovilizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldBonoMovilizacionKeyTyped(evt);
            }
        });

        jLabel10.setText("AFP");

        comboAfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAfpActionPerformed(evt);
            }
        });

        comboCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCiudadActionPerformed(evt);
            }
        });

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Apellido Paterno", "Apellido Materno", "Fecha de Nacimiento", "Dirección", "Ciudad", "Sueldo Base", "Bono Colación", "Bono Movilización", "Afp", "dv"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMostrar);
        if (jTableMostrar.getColumnModel().getColumnCount() > 0) {
            jTableMostrar.getColumnModel().getColumn(4).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(4).setMaxWidth(0);
            jTableMostrar.getColumnModel().getColumn(5).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(5).setMaxWidth(0);
            jTableMostrar.getColumnModel().getColumn(6).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(6).setMaxWidth(0);
            jTableMostrar.getColumnModel().getColumn(7).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(7).setMaxWidth(0);
            jTableMostrar.getColumnModel().getColumn(8).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(8).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(8).setMaxWidth(0);
            jTableMostrar.getColumnModel().getColumn(9).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(9).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(9).setMaxWidth(0);
            jTableMostrar.getColumnModel().getColumn(10).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(10).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(10).setMaxWidth(0);
            jTableMostrar.getColumnModel().getColumn(11).setMinWidth(0);
            jTableMostrar.getColumnModel().getColumn(11).setPreferredWidth(0);
            jTableMostrar.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Rut");

        fieldDV.setEditable(false);
        fieldDV.setBackground(new java.awt.Color(204, 204, 204));
        fieldDV.setForeground(new java.awt.Color(153, 153, 153));

        fieldRut.setEditable(false);
        fieldRut.setBackground(new java.awt.Color(204, 204, 204));
        fieldRut.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(fieldSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(fieldBonoColacion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(fieldBonoMovilizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboAfp, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(fieldApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(fieldNombre)
                                    .addComponent(fieldNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(fieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(comboCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldDV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(fieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBonoColacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBonoMovilizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(comboAfp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostrarMouseClicked
        // TODO add your handling code here:
        int i = jTableMostrar.getSelectedRow();
        TableModel model = jTableMostrar.getModel();
        fieldRut.setText(model.getValueAt(i,0).toString());
        fieldDV.setText(model.getValueAt(i,11).toString());
        fieldNombre.setText(model.getValueAt(i,1).toString());
        fieldApellidoP.setText(model.getValueAt(i,2).toString());
        fieldApellidoM.setText(model.getValueAt(i,3).toString());
        fieldNacimiento.setText(model.getValueAt(i,4).toString());
        fieldDireccion.setText(model.getValueAt(i,5).toString());
        comboCiudad.setSelectedIndex((int) model.getValueAt(i,6)-1);
        fieldSueldoBase.setText(model.getValueAt(i,7).toString());
        fieldBonoColacion.setText(model.getValueAt(i,8).toString());
        fieldBonoMovilizacion.setText(model.getValueAt(i,9).toString());
        comboAfp.setSelectedIndex((int)model.getValueAt(i,10)-1);
    }//GEN-LAST:event_jTableMostrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rut                 = Integer.valueOf(fieldRut.getText());
        int dv                  = Integer.valueOf(fieldDV.getText());
        String nombre           = fieldNombre.getText();
        String apellidoP        = fieldApellidoP.getText();
        String apellidoM        = fieldApellidoM.getText();
        String fechaNacimiento  = fieldNacimiento.getText();
        String direccion        = fieldDireccion.getText();
        //Object idCiudad =  comboCiudad.getSelectedItem();
        
        int idCiudad            =  comboCiudad.getSelectedIndex()+1;
        int sueldoBase          = Integer.valueOf(fieldSueldoBase.getText());
        int bonoColacion        = Integer.valueOf(fieldBonoColacion.getText());
        int bonoMovilizacion    = Integer.valueOf(fieldBonoMovilizacion.getText());
        //Object idAfp = comboAfp.getSelectedItem();
        //int idAfp               = comboAfp.getSelectedIndex()+1;
        int idAfp               = comboAfp.getSelectedIndex()+1;
        
        Persona editarPersona = new Persona(nombre,apellidoP,apellidoM,direccion,fechaNacimiento,rut,dv,idCiudad,sueldoBase,bonoColacion,bonoMovilizacion,idAfp);
        
        PersonaDAO daoPersona = new PersonaDAO();
        daoPersona.editarPersona(editarPersona);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCiudadActionPerformed

    private void comboAfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAfpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAfpActionPerformed

    private void fieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        } 
    }//GEN-LAST:event_fieldNombreKeyTyped

    private void fieldApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldApellidoPKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }         
    }//GEN-LAST:event_fieldApellidoPKeyTyped

    private void fieldApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldApellidoMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }         
    }//GEN-LAST:event_fieldApellidoMKeyTyped

    private void fieldSueldoBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSueldoBaseKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        
        if(Character.isLetter(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }        
    }//GEN-LAST:event_fieldSueldoBaseKeyTyped

    private void fieldBonoColacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBonoColacionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        
        if(Character.isLetter(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
    }//GEN-LAST:event_fieldBonoColacionKeyTyped

    private void fieldBonoMovilizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBonoMovilizacionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        
        if(Character.isLetter(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
    }//GEN-LAST:event_fieldBonoMovilizacionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAfp;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JTextField fieldApellidoM;
    private javax.swing.JTextField fieldApellidoP;
    private javax.swing.JTextField fieldBonoColacion;
    private javax.swing.JTextField fieldBonoMovilizacion;
    private javax.swing.JTextField fieldDV;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNacimiento;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldRut;
    private javax.swing.JTextField fieldSueldoBase;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMostrar;
    // End of variables declaration//GEN-END:variables
}
