
package mapa.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoJDBC {
    private static final String url ="jdbc:mysql://localhost:3306/mapa";
    private static final String user = "root";
    private static final String password = "97383365";
    
    public static Connection conn;
    
   
    public static Connection getConexao() throws SQLException {
    
    try{
        if(conn == null){
            conn = DriverManager.getConnection(url, user, password);
    }return conn;
    }catch(SQLException e){
            e.printStackTrace();
           JOptionPane.showMessageDialog(null,"houve um erro ao tentar conectar ao mconectar no bancode dados");
            }
        return null;
        
    
    
     
    }
}