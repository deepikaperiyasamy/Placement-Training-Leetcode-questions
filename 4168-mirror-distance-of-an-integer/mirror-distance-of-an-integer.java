class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(reverse(n)-n);
    }
    public int reverse(int num){
        int rev = 0;
        while(num!=0){
            rev=(rev*10)+num%10;
            num/=10;
        }
        System.out.println(rev);
        return rev;
    }
}