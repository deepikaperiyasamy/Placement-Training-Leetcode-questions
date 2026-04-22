class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int[] arr = new int[grid[0].length];
        // System.out.println(grid.length);

        for(int j=0;j<grid[0].length;j++){
            int max = 0;
            for(int i=0;i<grid.length;i++){
                String s = Integer.toString(grid[i][j]);
                max = Math.max(max,s.length());
            }
            arr[j] = max;
        }

        return arr;
    }
}