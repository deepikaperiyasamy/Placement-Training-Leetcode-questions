class Solution {
    public int firstUniqueFreq(int[] nums) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer,Integer> freqcount = new HashMap<>();

        for(int num : nums) freq.put(num,freq.getOrDefault(num,0)+1);
        for(int num : freq.values()) freqcount.put(num,freqcount.getOrDefault(num,0)+1);

        for(int num : nums){
            if(freqcount.get(freq.get(num)) == 1) return num;
        }
        return -1;
    }
}