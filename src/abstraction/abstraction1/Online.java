package abstraction.abstraction1;

public class Online extends  Student{

    public Online(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Online student is eating at home");
    }

    @Override
    public int attend() {
        System.out.println("Online is attending via zoom");
        return 0;
    }

    public void havePJ(){
        System.out.println("Online can have PJ at home");
    }
}
