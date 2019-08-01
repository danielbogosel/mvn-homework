package ro.itschool.mvnbase.tema17.recursion;

public class ReverseString {
    public String reverse(String reverseString) {
        if (reverseString.equals("")) {
            return reverseString;
        }
        return reverse(reverseString.substring(1)) + reverseString.charAt(0);
    }
}
