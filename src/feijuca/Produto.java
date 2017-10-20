package feijuca;

public class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private int quant;

    public Produto() {
    }

    public Produto(int codigo, String nome, float valor, int quant) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quant = quant;
    }

    public Produto(String nome, float valor, int quant) {
        this.nome = nome;
        this.valor = valor;
        this.quant = quant;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", quant=" + quant + '}';
    }
    
    
    
}