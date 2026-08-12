class Solution {
    public int numDifferentIntegers(String word) {
        
        String[] arr = word.split("[a-z]+");
        System.out.println(Arrays.toString(arr));

        HashSet<String> set = new HashSet<>();

        for(String str : arr){

            if(!str.isEmpty()) {
                str = str.replaceFirst("^0+","");
                if(str.isEmpty()) str = "0";
            }
           
            if(!str.isEmpty()) set.add(str);
        }

        return  set.size();
    }
}