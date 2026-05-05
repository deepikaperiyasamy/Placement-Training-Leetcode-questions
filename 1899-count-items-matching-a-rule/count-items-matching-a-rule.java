class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int j = 0,c = 0;
        if(ruleKey.equals("type")) j = 0;
        else if(ruleKey.equals("color")) j = 1;
        else j =2;

        for(List<String> str : items){
            if(str.get(j).equals(ruleValue)) c++;
        }

        return c;
    }
}