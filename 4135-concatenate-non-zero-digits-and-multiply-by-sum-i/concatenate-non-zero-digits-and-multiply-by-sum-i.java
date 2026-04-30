class Solution {
    public long sumAndMultiply(int n) {
        
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        while(n!=0){
            sum+=n%10;
            if(n%10 !=0) sb.append(n%10);
            n/=10;
        }
        sb.reverse();

        long x = sb.length()>0 ? Integer.parseInt(sb.toString()) : 0;

        long res = x * sum;

        return res;
    }
}