
package Aluno;


import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AlunoDao implements Dao {

    @Override
    public void insert(Object o) {
        Aluno A = (Aluno) o;                      
 
        
        String sql = "INSERT INTO CadastroAluno (cpf, data, email, endereco, nome, serie, telefone, escola, responsavel values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, A.getCpf());
            ps.setString(2, A.getData());
            ps.setString(3, A.getEmail());
            ps.setString(4, A.getEndereco());
            ps.setString(5, A.getNome());
            ps.setString(6, A.getSerieAno());
            ps.setString(7, A.getTelefone());
            ps.setString(8, A.getEscola());
            ps.setString(9, A.getNomeResp());

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
        Aluno A = (Aluno) o; 
        String sql = "INSERT INTO CadastroAluno (cpf=?, data=?, email=?, endereco=?, nome=?, serie=?, telefone=?, escola=?, responsavel=?, where cod=?" ;
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, A.getCpf());
            ps.setString(2, A.getData());
            ps.setString(3, A.getEmail());
            ps.setString(4, A.getEndereco());
            ps.setString(5, A.getNome());
            ps.setString(6, A.getSerieAno());
            ps.setString(7, A.getTelefone());
            ps.setString(8, A.getEscola());
            ps.setString(9, A.getNomeResp());

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
        String sql = "delete from CadastroAluno where cod=?";
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
