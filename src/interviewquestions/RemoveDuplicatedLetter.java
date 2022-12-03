package interviewquestions;

public class RemoveDuplicatedLetter {
//    Create a function to remove duplicated letters from string
//    without removing the spaces
    // For example
    // "I am happy" -> I am hpy
    // "techtorial academy" -> techorial dmy
   public static String removeDuplicatedLetters(String str){
       String withoutDuplicate = "";
       for (int i = 0; i <str.length() ; i++) {
           String letter = str.charAt(i)+"";
           if(letter.equals(" ")){
               withoutDuplicate += letter;
               continue;
           }
           if(!withoutDuplicate.contains(letter)){
               withoutDuplicate+= letter;
           }
       }
       return withoutDuplicate;
   }

    public static void main(String[] args) {
        System.out.println(removeDuplicatedLetters("I am happy"));
    }

}
