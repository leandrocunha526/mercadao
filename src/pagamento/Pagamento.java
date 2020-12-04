package pagamento;

import cliente.*;

public class Pagamento {
    
    private FormaPagamento formaPagamento;
    
    private Cliente cliente;
    
    public Pagamento(Cliente cliente, FormaPagamento formaPagamento)
    {
        this.cliente = cliente;
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

    public Cliente getClient(){
    
        return cliente;
    
    }
    
    public void setCliente(Cliente cliente){
    
        this.cliente = cliente;
    
    }
    
    public void Pagamento()
    {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Forma de pagamento: " + formaPagamento.getFormaPagamento());
    }
}
