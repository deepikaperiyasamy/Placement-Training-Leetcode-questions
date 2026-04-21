class Solution {
    public int longestConsecutive(int[] nums) {
        
        // HashSet<Integer> set = new HashSet<>();
        // int res = 0;
        // for(int num : nums) set.add(num);

        // for(int num : set){
        //     int c = 1;
        //     if(!set.contains(num-1)){
        //         int n = num;
        //         // int c = 0;
        //         while(set.contains(n+1)){
        //             c++;
        //             n++;
        //         }
        //     }
        //     res = c > res ? c : res;
        // }
        // return res;



        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int num : nums) set.add(num);

        for(int num: set){
            int c=1;
            if(!set.contains(num-1)){
                int n = num;

                while(set.contains(n+1)){
                    c++;
                    n++;
                }
            }

            max = Math.max(c,max);
        }
        return max;
    }
}