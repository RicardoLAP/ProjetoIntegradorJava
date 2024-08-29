package Produto;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import Produto.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDao implements Dao {

    @Override
    public void insert(Object o) {
        Produto P = (Produto) o;                      
 
        
        String sql = "INSERT INTO CadastroClientes (categoria, codigo_produto, data, descricao, local_estoque, nome, preco, quantidade_estoque, values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, P.getCatego());
            ps.setString(2, P.getCodProd());
            ps.setString(3, P.getDataVa());
            ps.setString(4, P.getDescr());
            ps.setString(5, P.getLocalEsto());
            ps.setString(6, P.getNomeProd());
            ps.setString(7, P.getPreco());
            ps.setString(8, P.getQuantEsto());
            ps.setString(9, P.getCodProd());

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
