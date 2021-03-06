package feijuca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao {
    private Connection connection;
    public ProdutoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Produto produto) {
        String sql = "insert into produto (nome, valor, quant) "
                + "values (?,?,?)";
        try (
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setString(1,produto.getNome());
            stmt.setFloat(2,produto.getValor());
            stmt.setInt(3,produto.getQuant());
            // executa
            stmt.execute();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*
    public void cadastrarLeitor(){
        Leitor leitor=new Leitor();
        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();
        
        endereco.setRua(tfRua.getText());
        endereco.setNumero(Integer.parseInt(tfNumero.getText()));
        endereco.setComplemento(tfComplemento.getText());
        endereco.setBairro(tfBairro.getText());
        endereco.setCidade(tfCidade.getText());
        endereco.setEstado(tfEstado.getText());
        endereco.setCep(tfCEP.getText());
        
        telefone.setTelCelular(tfCelular.getText());
        telefone.setTelResidencial(tfResidencial.getText());
        telefone.setTelComercial(tfComercial.getText());
        
        leitor.setCodigoLeitor(codigoProximoLeitor);
        leitor.setNomeLeitor(tfNomeLeitor.getText());
        leitor.setCPFLeitor(tfCEP.getText());
        leitor.setEmailLeitor(tfEmailLeitor.getText());
        leitor.setInteresseLeitor(tfInteresseLeitor.getText());
        leitor.setEnderecoLeitor(endereco);
        leitor.setTelefoneLeitor(telefone);
        
        // grave nessa conexão!!!
        LeitorDao dao = new LeitorDao();
        // método elegante
        dao.adiciona(leitor);
        
        EnderecoDao dao1 = new EnderecoDao();
        dao1.adiciona(endereco);
        
        TelefoneDao dao2 = new TelefoneDao();
        dao2.adiciona(telefone);
        
        leitores.add(leitor);
        enderecos.add(endereco);
        telefones.add(telefone);
        
        JOptionPane.showMessageDialog(rootPane,"Leitor Gravado!");
        limpar();
    }
    
    */
}