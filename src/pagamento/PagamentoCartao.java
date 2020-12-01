package pagamento;

public class PagamentoCartao implements FormaPagamento{
    
    @Override
    public String getFormaPagamento() {
        return "Cartão";
    } 
}
