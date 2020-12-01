package notifica;

public class Notifica implements Observador{
   @Override
   public void notifica(){
   
     System.out.println("Notificação de compra realizada com sucesso");
   
   }
}
