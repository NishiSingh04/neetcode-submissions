class Solution {
    public boolean isPalindrome(String s) {
       String sb = s.toLowerCase().replaceAll("[^a-z0-9]","");
       int start=0;
       int end=sb.length()-1;
        while(start<end){
            if(sb.charAt(start)!=sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
