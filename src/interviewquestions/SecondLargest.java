package interviewquestions;

import java.util.Arrays;

public class SecondLargest {

    //Create a function to find the second largest number in an array in Java

   public static int secondLargest(int[] numbers){
       int highest = Integer.MIN_VALUE;
       int secondHighest = Integer.MIN_VALUE;
       for (int number :numbers
            ) {
           if(number>highest){
               secondHighest = highest;
               highest = number;

           }else if(number>secondHighest){
               secondHighest = number;
           }
       }
       return secondHighest;
   }

    public static void main(String[] args) {
    int [] numbers = new int[]{1,99,100,110,200,34,99,199};
        System.out.println(secondLargest(numbers));
    }




}
