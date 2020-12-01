package produto;

public class ProdutoSimples implements Produto {
    
    private String nome;
    private Double valor;
    
    public ProdutoSimples(String nome, Double valor){
        this.nome = nome;
        this.valor = valor;
    }
    @Override
    public String getNome(){
        return nome;
    }
    @Override
    public Double getValor(){
        return valor;
    }
}
