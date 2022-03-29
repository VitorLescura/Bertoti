public class objetoSimples implements Objeto{
  private List<Observer> observers;
  private int valor = 0;
  
  public objetoSimples(){
    observers = new ArrayList<Observer>();
    }
  public void registerObserver(Observer o){
    observers.add(o);
  }
  public void removeObserver(Observer o){
    int i = observers.indexOf(o);
    if (i >= 0){
      observers.remove(i);
    }
  }
  public void notifyObservers(){
    for (Observer observer: observers){
      observer.update(valor);
    }
  }
  public void setValor(int valor){
    this.valor = valor;
    notifyObservers();
  }
}
