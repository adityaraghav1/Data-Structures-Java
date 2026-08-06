class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        List<Integer> ls = new ArrayList<>();
        while (i < n1 && j < n2){
            if (nums1[i] < nums2[j]){
                if (ls.isEmpty() || ls.get(ls.size() - 1) != nums1[i]){
                    ls.add(nums1[i]);
                }
                i++;
            } else if (nums2[j] < nums1[i]){
                if (ls.isEmpty() || ls.get(ls.size() - 1) != nums2[j]){
                    ls.add(nums2[j]);
                }
                j++;
            } else{
                if (ls.isEmpty() || ls.get(ls.size() - 1) != nums1[i]){
                    ls.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        while (j < n2){
            if (ls.isEmpty() || ls.get(ls.size() - 1) != nums2[j]){
                ls.add(nums2[j]);
            }
            j++;
        }

        while (i < n1){
            if (ls.isEmpty() || ls.get(ls.size() - 1) != nums1[i]){
                ls.add(nums1[i]);
            }
            i++;
        }
      
        int[] ans = new int[ls.size()];
        for (int k = 0; k < ls.size(); k++){
            ans[k] = ls.get(k);
        }
        return ans;
    }
}
