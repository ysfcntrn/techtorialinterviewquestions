package interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class IfOdd {

//  Create a function to check if a list of integers contains only odd numbers in Java

    public static boolean onlyOdd(List<Integer> nums){

        for (Integer number:nums
             ) {
            if(number % 2 == 0 ){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5); numbers.add(6); numbers.add(31);
        System.out.println(onlyOdd(numbers));



        List<Integer> integers = new ArrayList<>();
        integers.add(5); integers.add(11);  integers.add(13); integers.add(41);
        System.out.println(onlyOdd(integers));





    }

}
