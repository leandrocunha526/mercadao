package main;

import cliente.*;
import notifica.*;
import produto.*;
import pagamento.*;

public class main {

    public static void main(String[] args) {
        
        //Cliente - builder
        Cliente cliente = new ClienteConstrutor().cliente().nome("Gabriel").cidade("Patos de Minas").construtor();
        
        //Produto - composite
        Produto arroz = new ProdutoSimples("arroz ", 8.60);
        Produto feijao = new ProdutoSimples("feijao", 7.60);
        Produto kit = new ProdutoComposto(arroz, feijao, 16.20);
        
        //Combo - composite
        Combo combo = new Combo();
        combo.addItem(kit);
        combo.imprimeCombo();
        
        //Pagamento - strategy
        FormaPagamento dinheiro = new PagamentoDinheiro();
        
        Pagamento pagamento = new Pagamento(cliente, dinheiro);
        pagamento.Pagamento();
        
        //Notifica - observer
        Compra compra = new Compra();
        compra.adicionarObservador(new Notifica());
        compra.setCompra(1);
    } 
}
