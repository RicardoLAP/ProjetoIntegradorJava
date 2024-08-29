
package Livro;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LivroDao implements Dao {

    @Override
    public void insert(Object o) {
         Livro L = (Livro) o;                      
 
        
        String sql = "INSERT INTO CadastroLivros ( titulo, autor, editora, genero, idioma, local_biblioteca, ano_publicacao, ano_compra, num_paginas values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, L.getTitulo());
            ps.setString(2, L.getAutor());
            ps.setString(3, L.getEditora());
            ps.setString(4, L.getGenero());
            ps.setString(5, L.getIdioma());
            ps.setString(6, L.getLocalBi());
            ps.setString(7, L.getAno());
            ps.setString(8, L.getIsbn());
            ps.setString(9, L.getNumPag());

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
        Livro L = (Livro) o; // conversão direta do Object para Fornecedor                           
 
        
        String sql = "UPDATE CadastroLivros (titulo=?, autor=?, editora=?, genero=?, idioma=?, local_biblioteca=?, ano_publicacao=?, ano_compra=?, num_paginas=?, where cod=?";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, L.getTitulo());
            ps.setString(2, L.getAutor());
            ps.setString(3, L.getEditora());
            ps.setString(4, L.getGenero());
            ps.setString(5, L.getIdioma());
            ps.setString(6, L.getLocalBi());
            ps.setString(7, L.getAno());
            ps.setString(8, L.getIsbn());
            ps.setString(9, L.getNumPag());

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
        String sql = "delete from CadastroLivros where cod=?";
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
