package abstraction.abstraction1;

public abstract class  Student {

    final int x = 9;
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void study(){
        System.out.println("Study hard");
    }

    public abstract  int attend();

    public abstract  void eat();



}
