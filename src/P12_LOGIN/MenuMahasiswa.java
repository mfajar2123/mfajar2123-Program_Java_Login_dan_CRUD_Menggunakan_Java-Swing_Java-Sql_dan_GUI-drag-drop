/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P12_LOGIN;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class MenuMahasiswa extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuMahasiswa
     */
    public MenuMahasiswa() {
        initComponents();
        tampil_table();
        
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
        tabel_mahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama_tbh = new javax.swing.JTextField();
        asalkota_tbh = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nim_tbh = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Menu Mahasiswa");

        tabel_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "NIM", "Nama", "Asal_Kota"
            }
        ));
        tabel_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_mahasiswa);

        jLabel1.setText("Nama");

        jLabel2.setText("Asal_Kota");

        asalkota_tbh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Bandung", "Sukabumi", "Pangandaran", "Bogor", "Cimahi" }));

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("NIM");

        jButton2.setText("Bersih");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ubah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(asalkota_tbh, javax.swing.GroupLayout.Alignment.LEADING, 0, 99, Short.MAX_VALUE)
                            .addComponent(nama_tbh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nim_tbh, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nim_tbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama_tbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asalkota_tbh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String NIM = nim_tbh.getText();
        String Nm = nama_tbh.getText();
        String askot = (String) asalkota_tbh.getSelectedItem();
        if(NIM.equals("") || Nm.equals("") ){
        JOptionPane.showMessageDialog(null, "isi data terlebih dahulu");
    } else if (NIM.equals("") || Nm.equals("") || askot.equals("pilih")){
        JOptionPane.showMessageDialog(null, "Mohon Pilih Kota");}
    else {
        try {
            String Q = "INSERT INTO mahasiswa (NIM, Nama, Asal_Kota) VALUES ('"+NIM+"','"+Nm+"','"+askot+"')";
            java.sql.Connection koneksisql_tbh = (Connection)sql_connection.configDB();
            java.sql.PreparedStatement s = koneksisql_tbh.prepareStatement(Q);
            s.execute();
            JOptionPane.showMessageDialog(null, "Tambah Data Sudah Berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tambah Data Gagal");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_table();
        bersih(); 
    } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        bersih(); 
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabel_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_mahasiswaMouseClicked
        // TODO add your handling code here:
        int baris = tabel_mahasiswa.rowAtPoint(evt.getPoint());
         
        String id = tabel_mahasiswa.getValueAt(baris, 1).toString();
        nim_tbh. setText(id);
        //int kolom = table_karyawan.columnAtPoint(evt.getPoint());
        String nm = tabel_mahasiswa.getValueAt(baris, 2).toString();
        nama_tbh. setText(nm);
        
        String almt = tabel_mahasiswa.getValueAt(baris, 3).toString();
        asalkota_tbh. setSelectedItem(almt);
        
    }//GEN-LAST:event_tabel_mahasiswaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String NIM = nim_tbh.getText();
        String Nm = nama_tbh.getText();
        String askot = (String) asalkota_tbh.getSelectedItem();
        if(NIM.equals("") || Nm.equals("") ){
        JOptionPane.showMessageDialog(null, "isi data terlebih dahulu");
    } else if (NIM.equals("") || Nm.equals("") || askot.equals("pilih")){
        JOptionPane.showMessageDialog(null, "Mohon Pilih Kota");}
    else {
        try {
            String Q = " UPDATE mahasiswa SET NIM='"+NIM+"', Nama='"+Nm+"', Asal_Kota='"+askot+"' WHERE NIM='"+NIM+"' ";
            java.sql.Connection koneksisql_tbh = (Connection)sql_connection.configDB();
            java.sql.PreparedStatement s = koneksisql_tbh.prepareStatement(Q);
            s.execute();
            JOptionPane.showMessageDialog(null, "Ubah Data Sudah Berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ubah Data Gagal");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_table();
        bersih(); 
    } 

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String NIM = nim_tbh.getText();
        String Nm = nama_tbh.getText();
        String askot = (String) asalkota_tbh.getSelectedItem();
        if(NIM.equals("") || Nm.equals("") ){
        JOptionPane.showMessageDialog(null, "isi data terlebih dahulu");
    } else if (NIM.equals("") || Nm.equals("") || askot.equals("pilih")){
        JOptionPane.showMessageDialog(null, "Mohon Pilih Kota");}
    else {
        try {
            String Q = " DELETE FROM mahasiswa WHERE NIM='"+NIM+"' ";
            java.sql.Connection koneksisql_tbh = (Connection)sql_connection.configDB();
            java.sql.PreparedStatement s = koneksisql_tbh.prepareStatement(Q);
            s.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Sudah Berhasil");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Hapus Data Gagal");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_table();
        bersih(); 
    } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tampil_table()
    {
        //membuat objek model pada tabel
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("No");
        tb.addColumn("NIM");
        tb.addColumn("Nama");
        tb.addColumn("Asal_Kota");
        
        try {
            int counter =1;
            //1. Query
            String query = " SELECT * FROM mahasiswa";
            //2. Fungsi koneksi
            java.sql.Connection koneksisql = (Connection)sql_connection.configDB();            
            //3. Kirim parameter fungsi java ke sql
            java.sql.Statement terhubung = koneksisql.createStatement();
            //4. Eksekusi Query
            java.sql.ResultSet r = terhubung.executeQuery(query);
            //5. Looping
            while (r.next()) {
                tb.addRow(new Object[]{
                counter++,r.getString(1),r.getString(2),r.getString(3)
                });
                
            }
            tabel_mahasiswa.setModel(tb);
            
        } catch (Exception e) {
        }
        
    }
    private void bersih(){
        nim_tbh.setText("");
        nama_tbh.setText("");
        asalkota_tbh.setSelectedIndex(0);
        
    }
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asalkota_tbh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_tbh;
    private javax.swing.JTextField nim_tbh;
    private javax.swing.JTable tabel_mahasiswa;
    // End of variables declaration//GEN-END:variables
}
