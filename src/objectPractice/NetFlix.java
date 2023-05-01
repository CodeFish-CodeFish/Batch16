package objectPractice;

public class NetFlix {

    static  int  data = 200;

   public static int watch(){
       data = data - 2;
       System.out.println("Streaming ... left over data " + data);
     return data;
    }

    public static void main(String[] args) {
        NetFlix.watch();

        NetFlix n1 = new NetFlix();
        n1.watch();
        NetFlix n2 = new NetFlix();

        n2.watch();
    }









}
