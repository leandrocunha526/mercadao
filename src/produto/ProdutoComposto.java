package produto;

public class ProdutoComposto implements Produto{
    private Produto produto1;
    private Produto produto2;
    private Double valor;
    
    public ProdutoComposto(Produto produto1, Produto produto2, Double valor){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.valor = valor;
    }
    @Override
    public String getNome(){
        return produto1.getNome() + "e " + produto2.getNome();
    }
    @Override
    public Double getValor(){
        return this.valor;
    }
}
