// TC O(n)
// SC O(1)
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int best = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = best + nums[i];
            int v2 = nums[i];
            best = Math.max(v1,v2);
            maxSum = Math.max(maxSum,best);
        }
        int end = nums[0];
        int minSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = end + nums[i];
            int v2 = nums[i];
            end = Math.min(v1,v2);
            minSum = Math.min(minSum,end);
        }
        return Math.max(maxSum, Math.abs(minSum));        
    }
}
