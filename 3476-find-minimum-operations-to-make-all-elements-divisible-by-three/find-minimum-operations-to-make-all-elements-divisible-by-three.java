class Solution {
    public int minimumOperations(int[] nums) {
        
        int c = 0;
        for(int num : nums){
            if(num%3!=0){
                if((num+1)%3==0 || (num-1)%3==0) c++;
            }
        }
        return c;
    }
}