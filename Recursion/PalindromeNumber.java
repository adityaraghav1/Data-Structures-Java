class Solution {
    static boolean isPalindrome(int num, int reverse, int copy){
        if(num == 0){
            return reverse == copy;
        }
        int lastDigit = num % 10;
        reverse = reverse * 10 + lastDigit;
        return isPalindrome(num/10,reverse,copy);
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return isPalindrome(x,0,x);
    }
}
