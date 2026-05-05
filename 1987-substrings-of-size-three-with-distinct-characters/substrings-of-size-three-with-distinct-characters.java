class Solution {
    public int countGoodSubstrings(String s) {
        
        int c = 0;
        for(int i=0;i<=s.length()-3;i++){
            
            String str = s.substring(i,i+3);
            HashSet<Character> set = new HashSet<>();
            for(char ch : str.toCharArray()) set.add(ch);
            if(str.length() == set.size()) c++;
        }

        return c;
    }
}