package Fornecedor;


public class Fornecedor {
    
    private float Cnpj;
    private String Nome;                              //Nome da empresa
    private String Endereco; 
    private String Telefone;
    private String Email;
    private String NomeConta;                       //Nome Contato
    private String Tipo;                                   //Tipo de Produto/Serviço
    private String Cond;                                 // Condições de Pagamento
    private String Prazo;                                //Prazo de entrega
    private int cod;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNomeConta() {
        return NomeConta;
    }

    public void setNomeConta(String NomeConta) {
        this.NomeConta = NomeConta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCond() {
        return Cond;
    }

    public void setCond(String Cond) {
        this.Cond = Cond;
    }

    public String getPrazo() {
        return Prazo;
    }

    public void setPrazo(String Prazo) {
        this.Prazo = Prazo;
    }
            

    public float getCnpj() {
        return Cnpj;
    }

    public void setCnpj(float Cnpj) {
        this.Cnpj = Cnpj;
    }

    void insert(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
