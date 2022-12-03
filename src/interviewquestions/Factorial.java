package interviewquestions;

public class Factorial {
 //   Create a function to calculate factorial for given number
//    factorial, in mathematics, the product of all positive integers less than or equal to a given positive integer
//    Factorial seven is written 7!, meaning 1 × 2 × 3 × 4 × 5 × 6 × 7. Factorial zero is defined as equal to 1.

   public static int factorial(int n ){
       if(n ==0){
           return  1;
       }else {
           return n * factorial(n-1);
       }
   }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
