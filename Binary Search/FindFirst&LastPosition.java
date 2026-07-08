class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        int last = -1;
        while(low <= high){ // first occurrence 
            int guess = (low + high)/2;
            if(nums[guess] < target){
                low = guess + 1;
            } else if(nums[guess] > target){
                high = guess - 1;
            } else{
                first = guess;
                high = guess - 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        while(low <= high){ // last occurrence
            int guess = (low + high)/2;
            if(nums[guess] < target){
                low = guess + 1;
            } else if(nums[guess] > target){
                high = guess - 1;
            } else{
                last = guess;
                low = guess + 1;
            }
        }
        return new int[]{first,last};
    }
}
