/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rem;

import DAO.PersonaDAO;
import VO.Persona;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Drebin01
 */
public class RemIFMPagoMultiple extends javax.swing.JInternalFrame {

    /**
     * Creates new form RemIFMPagoMultiple
     */
    public RemIFMPagoMultiple() {
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStack = new javax.swing.JTable();
        jButtonLimpiarLista = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldFechaPago = new javax.swing.JTextField();
        jButtonEliminarDeLista = new javax.swing.JButton();
        jButtonSeleccionarTodo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Pagos Multiples");

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jTableStack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableStack);

        jButtonLimpiarLista.setText("Limpiar lista");
        jButtonLimpiarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarListaActionPerformed(evt);
            }
        });

        jButton3.setText("Pagar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de Pago:");

        fieldFechaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFechaPagoActionPerformed(evt);
            }
        });

        jButtonEliminarDeLista.setText("Eliminar de la lista");
        jButtonEliminarDeLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarDeListaActionPerformed(evt);
            }
        });

        jButtonSeleccionarTodo.setText("Seleccionar todo");
        jButtonSeleccionarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSeleccionarTodo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonLimpiarLista)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminarDeLista))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSeleccionarTodo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiarLista)
                    .addComponent(jButtonEliminarDeLista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1)
                    .addComponent(fieldFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarListaActionPerformed
        // TODO add your handling code here:
        
        //DefaultTableModel model = (DefaultTableModel)jTableMostrar.getModel();
        //model.setRowCount(0);
        //mostrarListaPersonasInTable();
    }//GEN-LAST:event_jButtonLimpiarListaActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelStack = (DefaultTableModel)jTableStack.getModel();
        String fechaPago   =   fieldFechaPago.getText();
        //Object[] row = new Object[100];
        for(int i = 0; i < modelStack.getRowCount(); i++){
            //row[0] = modelStack.getValueAt(count, 1).toString()
            System.out.println (modelStack.getValueAt(i, 1).toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fieldFechaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFechaPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFechaPagoActionPerformed

    private void jTableMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostrarMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelStack = (DefaultTableModel)jTableStack.getModel();
        int i = jTableMostrar.getSelectedRow();
        TableModel model = jTableMostrar.getModel();
        Object[] row = new Object[4];
        row[0]  = model.getValueAt(i,0).toString();
        row[1]  = model.getValueAt(i,1).toString();
        row[2]  = model.getValueAt(i,2).toString();
        row[3]  = model.getValueAt(i,3).toString();
        modelStack.addRow(row);
        ((DefaultTableModel)jTableMostrar.getModel()).removeRow(i);
        //modelStack.addTableModelListener(jTableMostrar.getModel());
        //jTableStack.setModel(model);
    }//GEN-LAST:event_jTableMostrarMouseClicked

    private void jButtonSeleccionarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarTodoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTableMostrar.getModel();
        jTableStack.setModel(model);
        //model.setRowCount(0);
    }//GEN-LAST:event_jButtonSeleccionarTodoActionPerformed

    private void jButtonEliminarDeListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarDeListaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelMostrar = (DefaultTableModel)jTableMostrar.getModel();
        int i = jTableStack.getSelectedRow();
        TableModel model = jTableStack.getModel();
        Object[] row = new Object[4];
        row[0]  = model.getValueAt(i,0).toString();
        row[1]  = model.getValueAt(i,1).toString();
        row[2]  = model.getValueAt(i,2).toString();
        row[3]  = model.getValueAt(i,3).toString();
        modelMostrar.addRow(row);
        ((DefaultTableModel)jTableStack.getModel()).removeRow(i);
    }//GEN-LAST:event_jButtonEliminarDeListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldFechaPago;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEliminarDeLista;
    private javax.swing.JButton jButtonLimpiarLista;
    private javax.swing.JButton jButtonSeleccionarTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMostrar;
    private javax.swing.JTable jTableStack;
    // End of variables declaration//GEN-END:variables
}
