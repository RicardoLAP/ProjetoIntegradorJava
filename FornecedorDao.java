package Fornecedor;
import ClassesEspeciais.Conexao;
import ClassesEspeciais.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedorDao implements Dao {
    
    
    @Override
    public void insert(Object o) {
        Fornecedor f = (Fornecedor) o; // conversão direta do Object para Fornecedor                           
 
        
        String sql = "INSERT INTO fornecedores (cnpj, contato, email, endereco, entrega, nome, pagamento, produto_servico, telefone) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{ 
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setFloat(1, f.getCnpj());
            ps.setString(2, f.getNomeConta());
            ps.setString(3, f.getEmail());
            ps.setString(4, f.getEndereco());
            ps.setString(5, f.getPrazo());
            ps.setString(6, f.getNome());
            ps.setString(7, f.getCond());
            ps.setString(8, f.getTipo());
            ps.setString(9, f.getTelefone());

            int atual = ps.executeUpdate();
            if (atual > 0) {
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Houve gravação!!");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: FornecedorDao01");
        }
    }
    @Override
    public void update(Object o) {
        Fornecedor f = (Fornecedor) o;
        //JOptionPane.showMessageDialog(null,f.getCod());
        String sql = "UPDATE fornecedores set cnpj=?, contato=?, email=?, endereco=?, entrega=?, nome=?, pagamento=?, produto_servico=?, telefone=? where cod=?";
        try{
          PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
           
            ps.setFloat(1, f.getCnpj());
            ps.setString(2, f.getNomeConta());
            ps.setString(3, f.getEmail());
            ps.setString(4, f.getEndereco());
            ps.setString(5, f.getPrazo());
            ps.setString(6, f.getNome());
            ps.setString(7, f.getCond());
            ps.setString(8, f.getTipo());
            ps.setString(9, f.getTelefone());
            ps.setInt(10, f.getCod());

            
           int atual = ps.executeUpdate();
           if(atual>0){
              JOptionPane.showMessageDialog(null,"Atualizado com sucesso!!!!:)!!");   
           }else{
                JOptionPane.showMessageDialog(null,"Não houve atualização!"); 
           }
           ps.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error: 02");
        }
    }

    @Override
    public void delete(int cod) {
        String sql = "delete from fornecedores where cod=?";
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
        ArrayList<Object> Arrayf = new ArrayList<>();
        String sql = "select * from fornecedores";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Fornecedor f = new Fornecedor();
                f.setCod(rs.getInt("cod"));
                f.setCnpj(rs.getFloat("cnpj"));
                f.setNomeConta(rs.getString("contato"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setPrazo(rs.getString("entrega"));
                f.setNome(rs.getString("nome"));
                f.setCond(rs.getString("pagamento"));
                f.setTipo(rs.getString("produto_servico"));
                f.setTelefone(rs.getString("telefone"));
                
               Arrayf.add(f); 
                    }
            
           } catch(SQLException e ) {
               JOptionPane.showMessageDialog(null, "Error: 04");
           }
        
        return Arrayf;
    }
    
    public void deleteCnpj(long cnpj) {
       
    }
    
}
