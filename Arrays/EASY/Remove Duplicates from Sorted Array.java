class Solution {
    public int removeDuplicates(int[] nums) {
        int read = 1;
        int write = 0;
        int n = nums.length;
        if(nums.length == 0){ // edge case
            return 0;
        }
        while(read < n){
            if(nums[read] == nums[write]){
                read++;
            } else{
                write ++;
                nums[write] = nums[read];
                read++;
            }
        }
        return write + 1;
    }
}
