package interviewquestions;

public class IfPrime {
    //Create a function to find if a given number is prime
    // What is a prime number?
    // Prime number can only be divided by itself and one.

    public static boolean ifPrime(int number){

        // THis number should not be divisible by any number other than one or itself
        // I have to check each possible divisor and none of them should perfectly divide this number
        for (int d = 2 ; d<number/2 ; d++){
            if(number % d == 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ifPrime(41));
    }
}
