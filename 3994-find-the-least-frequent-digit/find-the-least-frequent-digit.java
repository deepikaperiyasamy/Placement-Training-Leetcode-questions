class Solution {
    public int getLeastFrequentDigit(int n) {
        
        int[] freq = new int[10];
        int mincount = Integer.MAX_VALUE;
        int min = 0;

        while(n!=0){
            int num = n%10;
            freq[num]++;
            n/=10;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]<mincount && freq[i]>0) {
                min = i;
                mincount = freq[i];
            }
        }
        return min;
    }
}