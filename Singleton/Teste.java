public class teste{
  public static void main(String args[]){
    mySingletonClass instance1 = MySingletonClass.getInstance();
    System.out.println("instance1 --> " + Instance1);
    
    mySingletonClass instance2 = MySingletonClass.getInstance();
    System.out.println("instance2 --> " + Instance2);
    
    mySingletonClass instance3 = MySingletonClass.getInstance();
    System.out.println("instance3 --> " + Instance3);
  }
}
