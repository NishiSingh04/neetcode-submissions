class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[nums.length];
        arr = nums;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(arr[i]>arr[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}