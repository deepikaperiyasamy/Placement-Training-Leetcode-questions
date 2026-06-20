class Solution {
    public String longestPalindrome(String s) {

    int n = s.length();
    if(n==0) return "";

    boolean dp[][] = new boolean[n][n];
    int start = 0 , maxlen = 1;

    for(int i=0;i<n;i++){
        dp[i][i] = true;
    }

    for(int i=0;i<n-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
            dp[i][i+1] = true;
            start = i;
            maxlen=2;
        }
    }

    for(int len = 3;len<=n;len++){
        for(int i=0;i<=n-len;i++){

            int j = i + len - 1;
            if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                dp[i][j]=true;

                if(len> maxlen){
                start = i;
                maxlen = len;
            }
            }
        }
    }
     
    return s.substring(start,start+maxlen);

    // if(s.length()==1) return s;
    // int res = 0;
    // String result = "";
    // for(int i=0;i<s.length();i++){
    //     for(int j=i+1;j<=s.length();j++){
    //         String str = s.substring(i,j);
    //         if(ispal(str)==true){
    //             if(str.length()>res){
    //                 result = str;
    //                 res = str.length();
    //             }
    //         }
    //     }
    // }
    // return result;
}

    // public static boolean ispal(String s){
    //     int left = 0,right = s.length()-1;
    //     while(left<=right){
    //         if(s.charAt(left)!=s.charAt(right)) return false;
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }


}