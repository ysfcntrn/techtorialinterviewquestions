package interviewquestions;

import java.util.Arrays;

public class SortArray {
    // Create a function to sort the array in asc order without a sort method
    // int [] arr = {2,4,3,1}
    // output should be {1,2,3,4}

    public static int[] sortArray(int[] numbers){
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            } }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(
                new int[]{2,4,3,1,-1,10,5,7,6}
        )));
    }





}
