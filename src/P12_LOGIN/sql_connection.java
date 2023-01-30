package P12_LOGIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class sql_connection {
    public static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/db_kampus"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        //    JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Gagal Koneksi");
           //System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        
        return mysqlconfig;
    }
   
    /*
   public static void main(String args[]) throws SQLException {
   
       java.sql.Connection Vconn = (Connection)sql_connection.configDB(); //memanggil fungsi koneksi dikelas lainnya
   }
    */
}