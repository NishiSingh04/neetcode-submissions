class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pro = 1;
        int[] l = new int[n];
        l[0] = pro;
        for(int i=1; i<n; i++){
            l[i] = l[i-1]*nums[i-1];
        }
        int[] r = new int[n];
        r[n-1] = pro;
        for(int i=n-2; i>=0; i--){
            r[i] = r[i+1]*nums[i+1];
        }
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            p[i] = l[i]*r[i];
        }
        return p;
    }
}  
