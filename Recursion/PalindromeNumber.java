public class PalindromeNumber {
    static boolean checkPalindrome2(int num, int reverse, int copy){
        if(num==0){
            return reverse == copy;
        }
        int lastDigit = num % 10;
        reverse = reverse * 10 + lastDigit;
        return checkPalindrome2(num / 10, reverse, copy);
    }
    static void checkPalindrome(int num, int reverse, int copy){
        if(num==0){
            System.out.println(reverse == copy?"Palindrome ":"Not Palindrome");
            return;
        }
        int lastDigit = num % 10;
        reverse = reverse * 10 + lastDigit;
        checkPalindrome(num / 10, reverse, copy);
    }
    public static void main(String[] args) {
        int num = 321;
        int copy = num;
        boolean r = checkPalindrome2(num, 0, copy);
        System.out.println(r?"Palindrome ":"Not Palindrome");
    }
}
