package abstraction.abstraction1;

public abstract class SelfLearner extends Student{


    public SelfLearner(String name, int age) {
        super(name, age);
    }


    public int attend(){
        System.out.println("attending to youtube");
        return 2;
    }

   // public static abstract void read();
  // private  abstract void read();
  // public final abstract void read();


}
