class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        ArrayList<String> lst = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();

        for(int i=0;i<=s.length()-10;i++){
            String str = s.substring(i,i+10);
            if(!set.add(str)) set1.add(str);
        }

        return new ArrayList<>(set1);
    }
}