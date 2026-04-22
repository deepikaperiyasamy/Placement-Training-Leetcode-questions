class Solution {
    public boolean checkValid(int[][] matrix) {
        
        int n = matrix.length;

        for(int i=0;i<n;i++){
            // HashSet<Integer> set = new HashSet<>();
            boolean[] arr = new boolean[n+1];
            for(int j=0;j<n;j++){
                int num = matrix[i][j];
                if(num<1 || num>n || arr[num]) return false;
                // set.add(num); 
                arr[num] = true;
            }
        }

        for(int j=0;j<n;j++){
            // HashSet<Integer> set = new HashSet<>();
            boolean[] arr = new boolean[n+1];
            for(int i=0;i<n;i++){
                int num = matrix[i][j];
                if(num<1 || num>n || arr[num]) return false;
                // set.add(num);
                arr[num] = true;
            }
        }

        return true;
    }
}