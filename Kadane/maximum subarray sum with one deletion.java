// TC O(n)
// SC O(1)
class Solution {
    public int maximumSum(int[] arr) {
       int noDelete = arr[0];
       int oneDelete = Integer.MIN_VALUE; 
       int res = arr[0];
       for(int i = 1;i<arr.length;i++){
        int prevnoDelete = noDelete;
        int prevoneDelete = oneDelete;
        noDelete= Math.max(noDelete + arr[i], arr[i]);
        int v2;
        if(prevoneDelete == Integer.MIN_VALUE){
            v2 = arr[i];
        } 
        else{
            v2 = prevoneDelete + arr[i];
        }
        oneDelete = Math.max(v2,prevnoDelete);
        res = Math.max(res,Math.max(oneDelete,noDelete));
       }
       return res;
    }
}
