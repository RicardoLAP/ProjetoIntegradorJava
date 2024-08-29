
package Login;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import Fornecedor.CadastroFornecedor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LoginDao implements Dao {
    public Login l = new Login();
    

    @Override
    public void insert(Object o) {
        l = (Login) o ;
        String sql = "insert into Login(login, senha, status) values ( ?,?,?)";
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ps.setString(3, l.getStatus());
            int atual = ps.executeUpdate();
            
            if(atual >0){
                JOptionPane.showMessageDialog(null,"Deu certo");
            }else {
                JOptionPane.showMessageDialog(null, "Deu ruim");
            }
           
            
        }catch(SQLException e ){
                JOptionPane.showMessageDialog(null, "ERRO LoginDAO");
    }
    }

    @Override
    public void update(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void Desativar(int cod){

    }

public void Logar (Login user) {
    l = user;
    String sql = "select usuario, senha from login where usuario=? and senha=?";
    try{
        PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
        ps.setString(1, l.getUsuario()) ;
        ps.setString(2, l.getSenha()) ;
        
        ResultSet rs = ps.executeQuery() ;
        
        if(rs.next()){
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
            }) ;
        }else {
            JOptionPane.showMessageDialog(null, "Senha ou usuário inválido...") ;
        }
           
    
    }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"erro: 455") ;
        }
}  
}

