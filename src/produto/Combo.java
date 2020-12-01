package produto;

import java.util.*;

public class Combo {
    List<Produto> produtos = new ArrayList<>();
    
    public void addItem(Produto item){
        produtos.add(item);
    }
    
    public void imprimeCombo(){
        
       for(Produto p:produtos){
         System.out.println("O kit possui " + p.getNome() + " por " + p.getValor()); 
       }
    }
}
