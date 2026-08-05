class Solution {
    public boolean checkDistances(String s, int[] distance) {
        
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()) set.add(ch);

        for(char ch : set) {
            if(!(distance[ch - 'a'] == s.lastIndexOf(ch) - s.indexOf(ch) -1)) return false;
        }
        return true;
    }
}