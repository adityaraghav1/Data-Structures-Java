class Solution {
    static long fun(int[] a, int n, int speed){
        long h = 0;
        for(int i = 0; i < n; i++){
            h = h + a[i] / speed;
            if(a[i] % speed != 0){
                h++;
            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = piles[0];
        for(int i = 1; i<n; i++){
            if(piles[i]>high){
                high = piles[i];
            }
        }
        int res = -1;
        while(low <= high){
            int guess = (low + high)/2;
            long hour = fun(piles,n,guess);
            if(hour>h){
                low = guess + 1;
            } else{
                res = guess;
                high = guess - 1;
            }
        }
        return res;
    }
}
