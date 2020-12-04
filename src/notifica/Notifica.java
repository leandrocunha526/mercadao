package notifica;

public class Notifica implements Observador{
   @Override
   public void notifica(){
   
     System.out.println("Notificação de confirmação: compra realizada com sucesso");
   
   }
}
