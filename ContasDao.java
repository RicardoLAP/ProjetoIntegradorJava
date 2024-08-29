
package Contas;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ContasDao implements Dao {

    @Override
    public void insert(Object o) {
        Contas C = (Contas) o;                      
 
        
        String sql = "INSERT INTO CadastroContas (cpf, data_nascimento, email, endereco, estado_civil, genero, nome, profissao, telefone values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, C.getCate());
            ps.setString(2, C.getCate());
            ps.setString(3, C.getDataPa());
            ps.setString(4, C.getDataVe());
            ps.setString(5, C.getObs());
            ps.setString(6, C.getValor());
            ps.setString(7, C.getDataVe());
            ps.setString(8, C.getDesconta());
            ps.setString(9, C.getMetodo());

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
    
}
