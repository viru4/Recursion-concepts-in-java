import java.util.Scanner;
public class Pallindrome {
    //to check if a string is a palindrome using recursion
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {

            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        boolean result = isPalindrome(str, 0, str.length() - 1);
        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

}
