class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int e=nums[0];
        int vote=0;
        for(int i=0; i<n; i++){
            if(nums[i]==e){
                vote++;
            }
            else{
                vote--;
            }
            if(vote==0){
                e = nums[i];
                vote = 1;
            }
        }
        return e;
    }
}