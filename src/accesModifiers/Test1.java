package accesModifiers;

public class Test1 {

    public void workout(){
        Animal animal = new Animal();
        animal.runDefault();

    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.color= "Pink";
        // since 'gender' is private you cannot
        // reach out to it from any other class
       // animal.gender = 'M';

        Test1 test = new Test1();
        test.workout();

    }
}
