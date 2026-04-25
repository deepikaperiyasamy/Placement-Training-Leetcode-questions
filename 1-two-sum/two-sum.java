class Solution {
      public int[] twoSum(int[] arr, int target)
     {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){

            int req = target - arr[i];
            if(map.containsKey(req)) return new int[]{map.get(req),i};
            map.put(arr[i],i);
        }

        return new int[]{};
    //     int r[]=new int[2];
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]+arr[j]==target){
    //                 r[0]=i;
    //                 r[1]=j;
    //                 break;
    //             }
    //         }
    //     }
    //     return r;     
     }  
}



