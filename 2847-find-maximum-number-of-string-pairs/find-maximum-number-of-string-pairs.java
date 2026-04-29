class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        HashSet<String> set = new HashSet<>();
        int c = 0;
        for(String str : words){

            StringBuilder sb = new StringBuilder(str);
            String rev = sb.reverse().toString();
            if(set.contains(rev)){
                c++;
                set.remove(rev);
            }
            else set.add(str);
        }

        return c;
    }
}