class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int longest = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int count = 1;
                int curr = num;                
                
                while(set.contains(curr + 1)){
                    curr++;
                    count++;             
                }
                if(count > longest){
                    longest = count;
                }
            }
        }
        return longest;
    }
}
