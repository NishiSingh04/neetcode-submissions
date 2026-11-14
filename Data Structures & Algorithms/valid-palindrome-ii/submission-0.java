class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
            if(check(s)){
                return true;
            }
        else{
            for(int i=0; i<s.length(); i++){
                StringBuilder sb = new StringBuilder(s);
                String str = sb.deleteCharAt(i).toString();
                if(check(str)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean check(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}