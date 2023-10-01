
package mapa.Dao;


import mapa.enty.usuarioenty;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mapa.conexao.ConexaoJDBC;



public class usuarioDao {
    
    public void inserir (usuarioenty usuario) throws SQLException{
        
        String sql = "INSERT INTO USUARIO( NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
        
        PreparedStatement ps; 
                
                
              try {  
               ps = ConexaoJDBC.getConexao().prepareStatement(sql);
               ps.setString(1, usuario.getNome());
               ps.setString(2, usuario.getLogin());
               ps.setString(3, usuario.getSenha());
               ps.setString(4, usuario.getEmail());
               
               ps.execute();


              }catch(SQLException e){
                  
                  e.printStackTrace();
    }
        
        
        
     
    
    
    }

    
}
//System.out.println("aqui vai cadastrar o banco de dados");
        
       // System.out.println("usuario a ser cadastrado" + usuario.getNome());
