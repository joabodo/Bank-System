/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import DBConnection.DBConnect;
import DBConnection.StudentDBOperations;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jbodo
 */
public class SelectOperation extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SelectOperation() {
        initComponents();
    }
public void close(){
WindowEvent closewindow=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("banksystem?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bankerQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Banker b");
        bankerList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bankerQuery.getResultList();
        bankerQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Banker b");
        bankerList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bankerQuery1.getResultList();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        Banker_num_txt = new javax.swing.JTextField();
        select_button = new java.awt.Button();
        back_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Selectallrecords_txt = new javax.swing.JButton();
        clear_records_txt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        panel1.setBackground(new java.awt.Color(0, 255, 0));

        label1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Bank Management System");

        jLabel1.setText("BANKER IDENTITY NUMBER");

        Banker_num_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Banker_num_txtActionPerformed(evt);
            }
        });

        select_button.setActionCommand("Select One Record");
        select_button.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        select_button.setLabel("Select");
        select_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_buttonActionPerformed(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BankerName", "BankerID", "AccountBalance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Selectallrecords_txt.setText("Show All Records");
        Selectallrecords_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectallrecords_txtActionPerformed(evt);
            }
        });

        clear_records_txt.setText("Clear Table");
        clear_records_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_records_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Banker_num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(select_button, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Selectallrecords_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear_records_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Banker_num_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(select_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Selectallrecords_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear_records_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );

        label1.getAccessibleContext().setAccessibleName("My AWT Label");
        select_button.getAccessibleContext().setAccessibleName("Select One Record");
        Selectallrecords_txt.getAccessibleContext().setAccessibleName("Show all records");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Banker_num_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Banker_num_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Banker_num_txtActionPerformed

    private void select_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_buttonActionPerformed
        // TODO add your handling code here:
        String Banker_id=Banker_num_txt.getText();
        DBConnect dbc =new StudentDBOperations();
        dbc.selectOperation(Banker_id);
        JOptionPane.showMessageDialog(this, "Selected  a record " );
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "suplexcity1.");
        
        Statement st=con.createStatement();
        
        String sql="SELECT * FROM banker WHERE Banker_Num = "+Banker_id+";";
        ResultSet rs= st.executeQuery(sql);
        
        while(rs.next()){
            String BankerName=rs.getString("Banker_Name");
            String BankerID=String.valueOf(rs.getInt("Banker_Num"));
            String AccountBalance=String.valueOf(rs.getInt("Account_Balance"));
            
            String tbData[]={BankerName,BankerID,AccountBalance};
            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
            
            tblModel.addRow(tbData);
        }
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_select_buttonActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        dispose();
         OperationMenu operationMenu=new OperationMenu();
        operationMenu.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void Selectallrecords_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectallrecords_txtActionPerformed
        // TODO add your handling code here:
        String Banker_id=Banker_num_txt.getText();
        DBConnect dbc =new StudentDBOperations();
        dbc.selectOperation(Banker_id);
        JOptionPane.showMessageDialog(this, "Show  all records " );
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "suplexcity1.");
        
        Statement st=con.createStatement();
        
        String sql="SELECT * FROM banker;";
        ResultSet rs= st.executeQuery(sql);
        
        while(rs.next()){
            String BankerName=rs.getString("Banker_Name");
            String BankerID=String.valueOf(rs.getInt("Banker_Num"));
            String AccountBalance=String.valueOf(rs.getInt("Account_Balance"));
            
            String tbData[]={BankerName,BankerID,AccountBalance};
            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
            
            tblModel.addRow(tbData);
        }
        con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Selectallrecords_txtActionPerformed

    private void clear_records_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_records_txtActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
while(dm.getRowCount() > 0)
{
    dm.removeRow(0);
}
    }//GEN-LAST:event_clear_records_txtActionPerformed

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
            java.util.logging.Logger.getLogger(SelectOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectOperation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Banker_num_txt;
    private javax.swing.JButton Selectallrecords_txt;
    private javax.swing.JButton back_btn;
    private java.util.List<GUI.Banker> bankerList;
    private java.util.List<GUI.Banker> bankerList1;
    private javax.persistence.Query bankerQuery;
    private javax.persistence.Query bankerQuery1;
    private javax.swing.JButton clear_records_txt;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private java.awt.Button select_button;
    // End of variables declaration//GEN-END:variables
}