class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }

    public static void reverse(char[] arr,int left,int right){

        if(left>=right) return;

        char temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;

        reverse(arr,left+1,right-1);
    }
}