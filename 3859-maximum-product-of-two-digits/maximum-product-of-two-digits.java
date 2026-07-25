class Solution {
    public int maxProduct(int n) {
        
        // int num = n;
        // int c = 0;

        // while(num!=0){
        //     num/=10;
        //     c++;
        // }

        // int[] arr = new int[c];
        // int ind = 0;
        // while(n!=0){
        //     arr[ind++] = n%10;
        //     n/=10;
        // }

        // if(arr.length == 2) return arr[0]*arr[1];
        // int maxProduct = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         int prod = arr[i];
        //         if(i!=j) {
        //             prod*=arr[j];
        //         System.out.println(arr[i] + " " + arr[j] + " " + prod);
        //         maxProduct = Math.max(maxProduct,prod);
        //         }
        //     }
        // }

        // return maxProduct;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while(n!=0){

            int num = n%10;
            if(num>max1){
                max2 = max1;
                max1 = num;
            }
            else if(num > max2){
                max2 = num;
            }
            n/=10;
        }

        return max1 * max2;
    }
}