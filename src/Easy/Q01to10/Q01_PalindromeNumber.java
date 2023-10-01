// Date: 24 February 2023
// Q1: Given an integer x, return true if x is a palindrome, and false otherwise.

package Easy.Q01to10;
public class Q01_PalindromeNumber {

    // My solution - 9ms
    public boolean isPalindrome(int x) {
        int original, reversed=0, rem;
        original = x;
        if (x < 0){
            return false;  //For negative numbers because palindrome of -121 is 121- (which is a string)
        }
        while (x != 0) {   //Reversing the given number
            rem = x % 10;
            reversed = reversed*10 + rem;
            x /= 10;
        }
        return reversed == original;
    }

    // Better solution - 4ms
    public boolean isPalindrome4ms(int x) {
        if (x < 0) return false;

        int reversed = 0;
        int val = x;
        while (val > 0) {
            reversed = reversed * 10 + (val % 10);
            val /= 10;
        }

        return reversed == x;
    }

    public static void main(String[] args) {
        Q01_PalindromeNumber obj1 = new Q01_PalindromeNumber();
        System.out.println(obj1.isPalindrome(1234554321));
    }
}
