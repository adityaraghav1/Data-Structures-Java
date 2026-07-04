class Solution {
    static final long MOD = 1000000007;
    static long power(long base, long exp){
        if(exp == 0){
            return 1;
        }
        long half = power(base,exp/2);
        long result = (half*half) % MOD;
        if(exp%2 == 1){
            result = (result*base) % MOD;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long evenPos = (n+1)/2;
        long oddPos = n/2;
        long even = power(5, evenPos);
        long odd = power(4, oddPos);
        return (int)((even * odd) % MOD);
    }
}
