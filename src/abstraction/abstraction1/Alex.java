package abstraction.abstraction1;

public class Alex extends Campus {

    public Alex(String name, int age) {
        super(name, age);
    }

    public int attend(){
        System.out.println("Attending hybrid");
        return 5;
    }

    //public abstract void workout();
    public void tableTennis(){
        System.out.println("Ping pong");
    }
}
