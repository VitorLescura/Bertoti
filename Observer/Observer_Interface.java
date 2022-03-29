public class Observer implements Observer{
  private int valor;
  private objeto objetoComum;
  
  public Observer (objeto objetoComum){
    this.objetoComum = objetoComum;
    objeto comum.registerObserver(this);
  }
  
  public void update(int valor){
    this.valor = valor;
    display();
  }
  public void display(){
    System.out.println("Valor: " + valor);
  }
}
