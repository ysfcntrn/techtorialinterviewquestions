package interviewquestions;

public class SwapNumbers {
   // # How do you swap two numbers without using a third variable in Java?

    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 6;
        n2 = n2 + n1; // now n2 is sum of both the numbers
        n1 = n2 - n1; // n2 - n1 = (n2 + n1) - n1 = n2 (n1 is swapped)
        n2 = n2 - n1; // (n2 + n1) - n2 = n1 (n2 is swapped)

        System.out.println("n2 is "+ n2);
        System.out.println("n1 is "+ n1);







    }
}
