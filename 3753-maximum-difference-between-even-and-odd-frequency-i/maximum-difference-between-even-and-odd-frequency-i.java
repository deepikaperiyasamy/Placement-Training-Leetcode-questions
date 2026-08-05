class Solution {
    public int maxDifference(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);

        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for(int num : map.values()){

            if(num%2 == 0) even = Math.min(num,even);
            else odd = Math.max(num,odd);
        }

        return odd - even;
        
    }
}