class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        return -1;
        // List<Integer> lst = new ArrayList<>();
        // int min = Integer.MAX_VALUE;

        // for(int num : nums2) lst.add(num);

        // for(int num : nums1){
        //     if(lst.contains(num)){
        //         min = Math.min(min,num);
        //     }
        // }
        // return min==Integer.MIN_VALUE ? -1 : min;
    }
}