class Solution {
    public int trailingZeroes(int n) {
        // long fact=1;
        // int c=0;
        // for(long i=1;i<=n;i++)
        //     fact*=i;
        // System.out.print(fact);    
        // if(fact%10!=0)
        //     return 0;
        // else
        // {
        //     while(fact%10==0)
        //     {
        //         c++;
        //         fact/=10;
        //     }
        //     return c;
        // }      
        int s=0;
        while(n>0)
        {
            n/=5;
            s+=n;
        }
        return s;

    }
}