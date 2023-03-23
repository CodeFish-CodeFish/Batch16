package primitives;
public class UnaryPractice1 {
    public static void main(String[] args) {

        int flower = 17;
        System.out.println( flower); // 17
        // ++ --
        // PRE POST
        ++flower;
        System.out.println( flower ); //18
        System.out.println(  ++flower  ); // 19

        --flower; // 18
        System.out.println(  flower ); //18
        System.out.println(   --flower ); // 17
        System.out.println(flower); // 17

        System.out.println("======POST========");

        flower++;
        System.out.println( flower ); // 18

        System.out.println(  flower++  ); // 18
        System.out.println(flower); // 19

        flower--;
        System.out.println( flower );// 18
        System.out.println( flower-- ); // shows 18 , flower is 17 behind the scene
        System.out.println(flower) ; // 17

        System.out.println("==================");

        System.out.println( flower-- - 7); // 10
        System.out.println(flower);

        flower = --flower + 4 + 1;
        System.out.println(flower); // 20

        flower = 9 + flower++;
        System.out.println(flower); // 29

        int vase = 9 + flower++;
        System.out.println( flower); //30
        System.out.println(vase); // 38



    }
}
