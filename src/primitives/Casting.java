package primitives;

public class Casting {
    public static void main(String[] args) {

        long employeeId = 56;

      //  int number = employeeId; // compile time error. you cannot store larger data type into a smaller data type
                                    // unless you do casting

        int number1 =   (int) employeeId; // explicit casting

        byte num1 = 2, num2 = 8;
        byte result = (byte)(num1 + num2);

        double rate = 5.6;

        float rate1 = (float) rate; // explicit casting

        double lastRate = rate1; // implicit casting


        double percent = 78.5;

        long percentLong = (long) percent; //  explicit casting

        System.out.println( percent  );
        System.out.println(percentLong);

        long l = (int)percent;

        int count = 9;
        long countL = (byte)count;

        int num5 = 129;
        byte itemNumber = (byte)num5;

        System.out.println( itemNumber );

        System.out.println("+===============+");
        System.out.println(Byte.MAX_VALUE      );
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
