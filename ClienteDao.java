
package Cliente;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClienteDao implements Dao {

    @Override
    public void insert(Object o) {
        Cliente C = (Cliente) o;                      
 
        
        String sql = "INSERT INTO CadastroClientes (cpf, data_nascimento, email, endereco, estado_civil, genero, nome, profissao, telefone values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, C.getCpf());
            ps.setString(2, C.getData());
            ps.setString(3, C.getData());
            ps.setString(4, C.getEndereco());
            ps.setString(5, C.getGenero());
            ps.setString(6, C.getNome());
            ps.setString(7, C.getProfissao());
            ps.setString(8, C.getTelefone());
            ps.setString(9, C.getEstadoCiv());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Houve gravação!!");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Dao01");
        }
    }

    @Override
    public void update(Object o) {
        Cliente C = (Cliente) o;                      
 
        
        String sql = "INSERT INTO CadastroClientes (cpf=?, data_nascimento=?, email=?, endereco=?, estado_civil=?, genero=?, nome=?, profissao=?, telefone=?, where cod=?" ; 
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, C.getCpf());
            ps.setString(2, C.getData());
            ps.setString(3, C.getData());
            ps.setString(4, C.getEndereco());
            ps.setString(5, C.getGenero());
            ps.setString(6, C.getNome());
            ps.setString(7, C.getProfissao());
            ps.setString(8, C.getTelefone());
            ps.setString(9, C.getEstadoCiv());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Houve gravação!!");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Dao01");
        }
    }

    @Override
    public void delete(int cod) {
         String sql = "delete from CadastroClientes where cod=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
           int atual = ps.executeUpdate();
           if(atual >0){
              JOptionPane.showMessageDialog(null,"Exlusão com sucesso!");  
           }else{
                JOptionPane.showMessageDialog(null,"Não houve a Exlusão");
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"error: 03");
       } 
    }

    @Override
    public ArrayList<Object> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
