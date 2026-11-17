class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = -1;
        int end = n-1;
        while(start<end){
            int mid = start + (end - start + 1)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid;
            }
        }
        return -1;
    }
}
