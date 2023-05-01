package wrapperPractice;
public class Practice1 {
    public static void main(String[] args) {

        byte b = 3;

        Byte bt1 = new Byte( b);
        System.out.println( bt1);

        short sh = 5;
        Short sh1 = new Short(sh);

        Integer i = new Integer(45);

        Character ch = new Character('t');

        Boolean bl = new Boolean(true);
        System.out.println(bl);

        Boolean bl2 = new Boolean("TRU");
        System.out.println(bl2);

        String str = "Test";
        String str1 = new String("Morning");

        Integer number  = 4; // AutoBoxing --> when java converts primitive to wrapper class object

        System.out.println( number + 10 * 2 -1);

        int i1 = number; // UnBoxing --> when java converts wrapper class object to primitive type






    }
}
