class Solution {
    static boolean checkPow(int num){
        if(num == 1){
            return true;
        }
        if(num<= 0 || num % 2 != 0){
            return false;
        }      
        return checkPow(num/2);
    }
    public boolean isPowerOfTwo(int n) {
        return checkPow(n);
    }
}
