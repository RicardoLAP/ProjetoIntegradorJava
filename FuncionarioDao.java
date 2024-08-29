
package Funcionario;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDao implements Dao {

    @Override
    public void insert(Object o) {
        Funcionario f = (Funcionario) o; // conversão direta do Object para Fornecedor                           
 
        
        String sql = "INSERT INTO CadastroFuncionarios (cargo, cpf, departamento, email, endereco, nome, salario, telefone, data_admissao values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getCargo());
            ps.setString(2, f.getCpf());
            ps.setString(3, f.getDeparta());
            ps.setString(4, f.getEmail());
            ps.setString(5, f.getEnedere());
            ps.setString(6, f.getNome());
            ps.setString(7, f.getSalario());
            ps.setString(8, f.getTelefo());
            ps.setString(9, f.getDataAdm());

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
        Funcionario f = (Funcionario) o; // conversão direta do Object para Fornecedor                           
 
        
        String sql = "UPDATE CadastroFuncionarios (cargo=?, cpf=?, departamento=?, email=?, endereco=?, nome=?, salario=?, telefone=?, where cod=?";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getCargo());
            ps.setString(2, f.getCpf());
            ps.setString(3, f.getDeparta());
            ps.setString(4, f.getEmail());
            ps.setString(5, f.getEnedere());
            ps.setString(6, f.getNome());
            ps.setString(7, f.getSalario());
            ps.setString(8, f.getTelefo());
            ps.setString(9, f.getDataAdm());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Houve gravação!!");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: 02");
        }
    }

    @Override
    public void delete(int cod) {
         String sql = "delete from CadastroFuncionario where cod=?";
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
