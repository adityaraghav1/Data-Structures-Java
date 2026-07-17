class Solution {
    boolean fun(int[] books, int n, long limit, int stud){
        int k = 1;
        long page = 0;
        for(int i = 0;i < n; i++){
            if(page+books[i] <= limit){
                page = page + books[i];
            } else{
                k++;
                page = books[i];
            }
            if(k>stud) return false;
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if(n<k) return -1;
        long low = 0;
        long high = 0;
        for(int i = 0; i<n;i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        long res = -1;
        while(low<=high){
            long guess = low + (high - low)/2;
            if(fun(arr,n,guess,k)){
                res = guess;
                high = guess - 1;
            } else{
                low = guess + 1;
            }
        }
        return (int)res;
    }
}
