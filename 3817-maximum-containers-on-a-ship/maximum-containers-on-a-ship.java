class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        
        // int total=0;
        // int i=1;
        // for(i=1;i<n*n;i++){
        //     total+=w;
        //     if(total>maxWeight) {
        //         break;
        //     }
        // }
        // return i;
        return Math.min(n*n,maxWeight/w);
    }
}