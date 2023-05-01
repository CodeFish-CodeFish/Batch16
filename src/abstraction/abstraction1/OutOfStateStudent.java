package abstraction.abstraction1;

public abstract class OutOfStateStudent extends Online{

    public OutOfStateStudent(String name, int age) {
        super(name, age);
    }

    // static method
    public static void callOffice(){
        System.out.println("Calling office");
    }

    // private method
    private void dance(){
        System.out.println("Dancing");
    }

    //final method
    final public void stop(){
        System.out.println("Stop at red lights");
    }


}
