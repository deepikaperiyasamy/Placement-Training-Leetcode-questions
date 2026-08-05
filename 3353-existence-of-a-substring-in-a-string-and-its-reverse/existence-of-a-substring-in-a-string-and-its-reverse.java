class Solution {
    public boolean isSubstringPresent(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        String str = sb.reverse().toString();
        for(int i=0;i<s.length()-1;i++){
                if(str.contains(s.substring(i,i+2))) return true;
        }
        return false;
    }
}