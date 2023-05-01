package abstraction.abstraction2;

public class Bird extends CanRun implements CanFly {

  public  void fly(){

        System.out.println("Bird is flying");
    }


    public void landing(){
        System.out.println("Bird is landing");
    }

    public void run(){
        System.out.println("Bird is running");
    }
}
