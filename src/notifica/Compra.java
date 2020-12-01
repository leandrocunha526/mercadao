package notifica;

import java.util.*;

public class Compra {
    
    private int codigo;
    
    private List<Observador> observador = new ArrayList<>();
    
    private void notifica(){
    
    for(Observador observador: observador){
    
        observador.notifica();
   
    }
    
    }
    
    public void setCompra(int codigo){
    
        this.codigo = codigo;
        
        notifica();
    
    }
    
    public void adicionarObservador(Observador observador){
    this.observador.add(observador);
    }
    
}
