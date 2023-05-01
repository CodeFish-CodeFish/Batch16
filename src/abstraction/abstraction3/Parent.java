package abstraction.abstraction3;

public interface Parent {


    void run();


    // default method
    default  void jump(){
        System.out.println("Jumping in interface");
    }

    private void goHome(){
        System.out.println("Trying to go home with no trouble");
    }


}
