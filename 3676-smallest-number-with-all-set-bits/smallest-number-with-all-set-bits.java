class Solution {
    public int smallestNumber(int n) {
        
        while(true){
            String str = Integer.toBinaryString(n);
            if(isSetBit(str)) return Integer.parseInt(str,2);
            n++;
        }
    }
    public boolean isSetBit(String s){
        for(char ch : s.toCharArray()){
            if(ch!='1') return false;
        }
        return true;
    }
}