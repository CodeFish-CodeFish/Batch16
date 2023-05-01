package abstraction.abstraction3;

public interface Child extends Parent {

    void run();


    default void jump(){

        System.out.println("Child is so exited to jump");
    }


}
