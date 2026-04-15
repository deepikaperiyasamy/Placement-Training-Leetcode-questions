class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
          int n = words.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int c = (i - startIndex + n) % n;
                int ac = (startIndex - i + n) % n;
                int distance = Math.min(c, ac);
                min = Math.min(min, distance);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}