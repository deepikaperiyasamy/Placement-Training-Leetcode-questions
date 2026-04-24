class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int ones = 0;
        for(char c : s.toCharArray()){
            if(c == '1') ones++;
        }
        int zero = s.length() - ones;
        String res = "";         
        
        for(int i=1;i<=ones - 1;i++) res+='1';
        for(int i=1;i<=zero;i++) res+='0';
        res+='1';

        return res;
    }
}