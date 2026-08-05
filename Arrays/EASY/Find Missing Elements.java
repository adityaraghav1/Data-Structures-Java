class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int num: nums){
            if(num > max){
                max = num;
            } 
            if(num < min){
                min = num;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        List<Integer> ls = new ArrayList<>();
        for(int i = min+1; i < max; i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}
