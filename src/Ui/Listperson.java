/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import person.Person;
import person.Persondirectory;

/**
 *
 * @author Ram
 */
public class Listperson extends javax.swing.JPanel {

    /**
     * Creates new form 
     */
    private JPanel Right;
    private Persondirectory person;
    public Listperson(JPanel Right, Persondirectory person ) {
        initComponents();
        this.Right= Right;
        this.person= person;
        poputlatePersonDetails();

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
        jTable1 = new javax.swing.JTable();
        Btnback = new javax.swing.JButton();
        Btnview = new javax.swing.JButton();
        Btndelete = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home Zip ", "Work City", "Work Zip"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        Btnback.setBackground(new java.awt.Color(255, 153, 153));
        Btnback.setText("<<Back");
        Btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbackActionPerformed(evt);
            }
        });

        Btnview.setText("View");
        Btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnviewActionPerformed(evt);
            }
        });

        Btndelete.setBackground(new java.awt.Color(255, 102, 102));
        Btndelete.setText("Delete");
        Btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(489, 489, 489))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Btnback)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbackActionPerformed
        // TODO add your handling code here:
        Right.remove(this);
        CardLayout layout = (CardLayout) Right.getLayout();
        layout.previous(Right);
    }//GEN-LAST:event_BtnbackActionPerformed

    private void BtnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnviewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=jTable1.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(null,"Please select row", "Warning", JOptionPane.WARNING_MESSAGE);            
        }
        else{
            Person Persondirectory= (Person) jTable1.getValueAt(selectedRowIndex, 0);
            viewpanel pan= new viewpanel(Right, Persondirectory);
            Right.add("viewpanel",pan);
            CardLayout layout = (CardLayout) Right.getLayout();
            layout.next(Right);
        
            
        }
    }//GEN-LAST:event_BtnviewActionPerformed

    private void BtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndeleteActionPerformed
        int selectedRowIndex=jTable1.getSelectedRow();
        if (selectedRowIndex>=0){
            int DialogB=  JOptionPane.YES_NO_OPTION;
            int dialogResult= JOptionPane.showConfirmDialog(null, "Do you like to delete the details?","Warning",DialogB);
            if (dialogResult== JOptionPane.YES_OPTION){
        Person Persondirectory= (Person) jTable1.getValueAt(selectedRowIndex, 0);
        
        person.deletePerson(Persondirectory);
        
        poputlatePersonDetails();}
        }else{
            JOptionPane.showMessageDialog(null,"Please select row", "Warning", JOptionPane.WARNING_MESSAGE);
          

        }
    }//GEN-LAST:event_BtndeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnback;
    private javax.swing.JButton Btndelete;
    private javax.swing.JButton Btnview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void poputlatePersonDetails() {

        DefaultTableModel model=  (DefaultTableModel) jTable1.getModel();
         model.setRowCount(0);
         
         for (Person Persondirectory : person.getPersonlist()){
             Object[] row= new Object[6];
             row[0]=Persondirectory;
             row[1]=Persondirectory.getLastName();
             row[2]=Persondirectory.getHomeaddress().getCity();
             row[3]=Persondirectory.getHomeaddress().getZipcode();
             row[4]=Persondirectory.getWorkaddress().getCity();
             row[5]=Persondirectory.getWorkaddress().getZipcode();
             
             model.addRow(row);  

    }
    }
    
    
}