package abstraction.abstraction1;

public class John extends SelfLearner{

    public John(String name, int age) {
        super(name, age);
    }

    public int attend(){
        System.out.println("John attends");
        return 1;
    }

    public void eat(){
        System.out.println("John likes Steak");
    }

    public void hike(){
        System.out.println("John like to hike");
    }

}
