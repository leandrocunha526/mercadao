package cliente;

public class ClienteConstrutor {
    
    private Cliente cliente;
    
    public ClienteConstrutor cliente(){
      cliente = new Cliente();
      return this;
    }
    public ClienteConstrutor nome(String nome){
      cliente.setNome(nome);
      return this;
    }
    public ClienteConstrutor cidade(String cidade){
      cliente.setCidade(cidade);
      return this;
    }
    public Cliente construtor(){
      return this.cliente;
    }
}
