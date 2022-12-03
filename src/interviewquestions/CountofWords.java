package interviewquestions;

public class CountofWords {
    // Find how many word does the given string contain?
    // "Techtorial Academy" ->
    // "Java is a coding language" ->5

    public static int countOfWords(String str){
        String[] words = str.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countOfWords("Java is a coding language"));
    }
}
