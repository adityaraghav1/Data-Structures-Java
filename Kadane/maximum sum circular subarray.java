// TC O(n)
// SC O(1)
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int best = nums[0]; 
        int maxSum = nums[0];
        for(int i = 1; i<nums.length;i++){
            int v1 = best + nums[i];
            int v2 = nums[i];
            best = Math.max(v1,v2);
            maxSum = Math.max(maxSum,best);
        }
        int end = nums[0]; 
        int minSum = nums[0];
        for(int i = 1; i<nums.length;i++){
            int v1 = end + nums[i];
            int v2 = nums[i];
            end = Math.min(v1,v2);
            minSum = Math.min(minSum,end);
        }
        int totalSum = 0;
        for(int i = 0; i<nums.length;i++){
            totalSum = totalSum + nums[i];
        }
        if(maxSum<0) return maxSum; //edge case
        int part = totalSum - minSum;
        return Math.max(maxSum,part);
    }
}
