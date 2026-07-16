class Solution {
    static boolean fun(int[] stalls, int n, int k, int guess){
        int cow = 1;
        int pos = stalls[0];
        for(int i = 1; i<n;i++){
            int dist = stalls[i] - pos;
            if(dist<guess)
            continue;
            cow++;
            pos = stalls[i];
        }
        if(cow >= k) return true;
        else return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int low = 1; int high = arr[n - 1] - arr[0];
        int res = -1;
        while(low<=high){
            int guess = (low+high)/2;
            if(fun(arr,n,k,guess)){
                res = guess;
                low = guess + 1;
            } else{
                high = guess - 1;
            }
        }
        return res;
    }
}
