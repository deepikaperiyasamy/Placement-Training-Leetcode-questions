class Solution {
    public int tribonacci(int n) {
        
        int t0 = 0 , t1 = 1, t2 =1;

        if(n==0) return t0;
        if(n == 1 || n==2) return t1;

        n-=3;
        
        while(n>=0){

            int temp = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = temp;
            n--;
        }
        return t2;
    }
}