package first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    // Write a function that takes in one argument:
    // it takes in an array of sorted, positive numbers in non-decreasing order.
    // This function should remove the duplicates in-place, so that each unique
    // element appears no more than twice. The relative order of the elements should
    // be kept the same. The numbers that are the duplicates (when there are more than 2)
    // should go to the end of the array and be replaced with -1.
    //     Input:  numbers = [0,0,1,2,2,2,3,3,4,5,5,5,5]
    //     Output: numbers = [0,0,1,2,2,3,3,4,5,5,-1,-1,-1]

    // I should find the count of the elements in the array
    // If I see the elements more than 2 times I should place that
    // element and put it at the end of the new array.

    public static int[] replaceDuplicates(int [] nums){
        Map<Integer,Integer> counts = new HashMap();
        int[] removed = new int[nums.length];
        int index =0;
        // Index for minus 1 should start from end of the new array and go
        // to the beginning. (It should get smaller each time we put -1)
        int indexForMinus1 = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if (!counts.containsKey(nums[i])){
                counts.put(nums[i],1 );
                removed[index++] = nums[i];
            }else if(counts.containsKey(nums[i])){
                counts.put(nums[i],counts.get(nums[i])+1);
                // if I am encountering this element second time i
                // should add straight to the new array.
                // if i am encountering more than twice i should add it at the
                // end of the new array and make it -1
                if(counts.get(nums[i])==2){
                    removed[index++] = nums[i];
                }else if (counts.get(nums[i])>2){
                    nums[i] = -1;
                    removed[indexForMinus1--] = nums[i];
                }


            }

        }
        return removed;
    }

    public static void main(String[] args) {
        int[] numbers = {0,0,1,2,2,2,3,3,4,5,5,5,5};
        System.out.println(Arrays.toString(replaceDuplicates(numbers)));
        // expected result is [0,0,1,2,2,3,3,4,5,5,-1,-1,-1]

    }
}
