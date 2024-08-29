
package Veiculos;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class VeiculoDao implements Dao {

    @Override
    public void insert(Object o) {
        Veiculos V = (Veiculos) o;                      
 
        
        String sql = "INSERT INTO CadastroVeiculos (ano_fabricacao, chassi, combustivel, data_revisao, km, marca, modelo, nome_proprietario, placa, cor, values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, V.getAnoFabri());
            ps.setString(2, V.getChassi());
            ps.setString(3, V.getTipoComb());
            ps.setString(4, V.getDataRevis());
            ps.setString(5, V.getKm());
            ps.setString(6, V.getMarca());
            ps.setString(7, V.getModelo());
            ps.setString(8, V.getModelo());
            ps.setString(9, V.getCor());

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
