class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        ArrayList<List<Integer>> lst = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);

        ArrayList<Integer> lst1 = new ArrayList<>();
        for(int num : set1){
            if(!set2.contains(num)) lst1.add(num);
        }
        lst.add(lst1);

        ArrayList<Integer> lst2 = new ArrayList<>();
        for(int num : set2){
            if(!set1.contains(num)) lst2.add(num);
        }
        lst.add(lst2);

        return lst;

    }
}