package ch5;


public class PalindromeMethod {

    public boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for accurate comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        PalindromeMethod palindromeChecker = new PalindromeMethod();

        // Test cases
        String str1 = "racecar";
        String str2 = "hello";
        String str3 = "A man a plan a canal Panama";

        System.out.println("Is '" + str1 + "' a palindrome? " + palindromeChecker.isPalindrome(str1));
        System.out.println("Is '" + str2 + "' a palindrome? " + palindromeChecker.isPalindrome(str2));
        System.out.println("Is '" + str3 + "' a palindrome? " + palindromeChecker.isPalindrome(str3));
    }
}


