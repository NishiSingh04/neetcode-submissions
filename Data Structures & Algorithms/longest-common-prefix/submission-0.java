class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n1 = strs.length;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n1-1];
        int n = first.length();
        int m = last.length();
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<n && i<m){
            if(first.charAt(i)!=last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
            i++;
        }
        return sb.toString();
    }
}