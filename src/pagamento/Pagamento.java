package pagamento;

public class Pagamento {
    
    private FormaPagamento formaPagamento;
    
    public Pagamento(FormaPagamento formaPagamento)
    {
        this.formaPagamento = formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento)
    {
        this.formaPagamento = formaPagamento;
    }

    public FormaPagamento getFormaPagamento()
    {
        return this.formaPagamento;
    }

    public void Pagamento()
    {
        System.out.println("Forma de pagamento: " + formaPagamento.getFormaPagamento());
    }
}
