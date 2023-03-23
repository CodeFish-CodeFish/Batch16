package loops;
public class ContinuePractice {
    public static void main(String[] args) {

        LABEL1:
        for (int i = 0; i<= 20; i++){
          //  if (i > 5 && i < 8 || i == 11)continue;
            System.out.println("----i ---->"+i);

            LABEL2:
            for (int k= 0; k <=20 ; k++){
                if (k < 10)continue LABEL1;
                System.out.println("K - "+k);
            }

        }
    }
}
