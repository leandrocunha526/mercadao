package pagamento;

public class PagamentoDinheiro implements FormaPagamento {
    
    @Override
    public String getFormaPagamento() {
        return "Dinheiro";
    }
}
