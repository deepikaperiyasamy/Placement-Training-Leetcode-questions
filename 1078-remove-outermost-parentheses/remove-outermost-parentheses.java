class Solution {
    public String removeOuterParentheses(String s) {
        
        String str = "";
        int bal = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(bal>0) str+='(';
                bal++;
            }
            else{
                bal--;
                if(bal>0) str+=')';
            }
        }

        return str;
    }
}