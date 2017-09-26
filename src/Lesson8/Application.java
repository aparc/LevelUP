package Lesson8;

public class Application {

    public static void main(String[] args) {

        String s = "dad";

        System.out.println(palindrome(s));
    }

    public static String palindrome(String s){
        char[] array = s.toLowerCase().toCharArray();
        String str = "";
        for(int i = array.length - 1; i >= 0; i--){
           str += array[i];
        }

        return str.equals(s) ? "The string is a palindrome." : "The string is not a palindrome.";

    }
}
