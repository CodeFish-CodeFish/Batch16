package accesModifiers;

public class Animal {

    public String name;
    protected String color;
    int age = 9;
    private char gender;

    {
        age = 11;
        if (age > 5) {
            System.out.println(name);
        }
    }

    public void runPublic() {

        System.out.println("running public");
    }

    void runDefault() {

        System.out.println("running default");
    }

    protected void runProtected() {

        System.out.println("running Protected");
    }

    private void runPrivate() {

        System.out.println("running private");
    }

}
