class Solution {
    public String greatestLetter(String s) {
        
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) set.add(ch);

        char max = '@';
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch) && set.contains(Character.toLowerCase(ch))){
                if(ch > max) max = ch;
            }
        }
        if(max == '@') return "";
        else return Character.toString(max);

    }
}