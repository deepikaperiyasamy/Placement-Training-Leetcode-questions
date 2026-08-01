class Solution {
    public int firstUniqChar(String s) {
        
        // for(char ch : s.toCharArray()){
        //     if(s.indexOf(ch) == s.lastIndexOf(ch)) return s.indexOf(ch);
        // }
        // return -1;

        int[] arr = new int[26];

        for(char ch : s.toCharArray()) arr[ch - 'a']++;
        for(char ch : s.toCharArray()) {
            if(arr[ch - 'a'] == 1) return s.indexOf(ch);
        }
        return -1;
    }
}