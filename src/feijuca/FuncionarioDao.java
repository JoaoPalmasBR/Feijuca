package feijuca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDao {
    private Connection connection;
    public FuncionarioDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Funcionario funcionario) {
        String sql = "insert into funcionario (codigo, nome, cpf, rg, "
                + "telefone, celular, email, endereco, funcao) "
                + "values (?,?,?,?,?,?,?,?,?)";
        try (
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,funcionario.getCodigo());
            stmt.setString(2,funcionario.getNome());
            stmt.setString(3,funcionario.getCpf());
            stmt.setString(4,funcionario.getRg());
            stmt.setString(5,funcionario.getTelefone());
            stmt.setString(6,funcionario.getCelular());
            stmt.setString(7,funcionario.getEmail());
            stmt.setString(8,funcionario.getEndereco());
            stmt.setString(8,funcionario.getFuncao());
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