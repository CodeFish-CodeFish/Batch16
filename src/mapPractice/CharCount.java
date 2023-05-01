package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String str="bkhjbhkdbh";
        // C=1, o=1, d=1, e=1, F=1, i=1, s=1, h=1
        //str="bkhjbhkdbh";
        //b=3, k=2, h=3, j=1, d=1;
        Map<Character,Integer> map=new HashMap<>();
        for (char c:str.toCharArray()){

            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);


        //String str="a1b2B3c6";-->input
        //abbBBBcccccc--> output

        String str2="a1b2B3c6";

        Map<String,String> map1=new LinkedHashMap<>();

        for (int i=0;i<str2.length();i+=2){
            map1.put(str2.charAt(i)+"",str2.charAt(i+1)+"");
        }
        System.out.println(map1);
        String result="";
        for (Map.Entry<String,String> pair:map1.entrySet()){
            for (int i=0;i<Integer.parseInt(pair.getValue());i++){
                result+=pair.getKey();
            }
        }
        System.out.println(result);


        //"This sentences belongs to CodeFish and CodeFish belongs to Tima"
        //This=1, sentences=1, belongs=2, to=2, CodeFish=2, and=1, Tima=1
        String sentence="This sentences belongs to This CodeFish and CodeFish belongs to Tima";
        String[] words=sentence.split(" ");

        Map<String,Integer> map2=new LinkedHashMap<>();
        for (String i:words){//{}-->i="This"
            if(!map2.containsKey(i)){
                map2.put(i,1);//{This=1,belongs=1}
            }
            else {
               map2.put(i, map2.get(i)+1);//{belongs=2
            }
        }
        System.out.println(map2);







    }
}
