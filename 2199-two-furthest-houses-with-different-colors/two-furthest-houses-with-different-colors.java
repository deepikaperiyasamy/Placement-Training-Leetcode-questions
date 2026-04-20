class Solution {
    public int maxDistance(int[] colors) {
        
        int max = 0;
        int n = colors.length; 

        for(int i=n-1;i>=0;i--){
            if(colors[0]!=colors[i]){
                max = Math.max(max,i);
                break;
            }
        }

        for(int i=0;i<n-1;i++){
            if(colors[n-1]!=colors[i]){
                max = Math.max(max,n-i-1);
                break;
            }
        }
        return max;
    }
}