package MentoringWithKutman;

import java.util.Arrays;

public class Mentoring5 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5,6,7,8};
        int[] nums2={1,45,2,9,6};
        System.out.print("The common numbers are: ");
        for (int i:nums1){
            for (int j:nums2){
                if (i==j){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("+++++++++++++++++++++");

        int[] nums3={1,2,3,4,5,6,7,8};
        int specifiedNumber=10;

        for(int i=0;i<nums3.length;i++){
            for(int j=i+1;j<nums3.length;j++){
                if(nums3[i]+nums3[j]==specifiedNumber){
                    System.out.println(nums3[i]+" "+nums3[j]);
                }
            }
        }
        System.out.println("++++++++++++++++++++++++");

        int[] nums4={1,2,3,4,5,6,7,8};
        int min=nums4[0];//1/2/3/4/5
        int max=nums4[0];//1/1/1/1/1/1

        for (int i:nums4){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("The largest number is: "+max);
        System.out.println("The lowest number is: "+min);
        System.out.println("Difference is equal to: "+(max-min));

        System.out.println("++++++++++++++++");


        int[] nums5={1,2,3,4,5};
        int startIndex=0;
        int endIndex=nums5.length-1;

        while(startIndex<endIndex){
            int temp=nums5[startIndex];
            nums5[startIndex]=nums5[endIndex];
            nums5[endIndex]=temp;

            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(nums5));

    }
}
