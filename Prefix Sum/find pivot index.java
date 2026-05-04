// TC O(n)
// SC O(1)
class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        int Sum = 0;
        for(int i = 0; i<nums.length;i++){
            Sum = Sum + nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            right = Sum - nums[i] - left;
            if(left == right){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
