class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            have.put(ch,have.getOrDefault(ch,0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for(Map.Entry<Character, Integer> entry: need.entrySet()){
            char ch = entry.getKey();
            int available = have.getOrDefault(ch,0);
            int required = need.get(ch);
            int possible = available / required;
            ans = Math.min(ans,possible);
        }
        return ans;
    }
}
