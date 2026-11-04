class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s1[i], map.getOrDefault(s1[i], 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            if(!map.containsKey(t1[i]) || map.get(t1[i])==0){
                return false;
            }
            map.put(t1[i], map.get(t1[i])-1);
        }
        return true;
    }
}
