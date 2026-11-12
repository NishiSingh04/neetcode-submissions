class Solution {
    public int[] sortArray(int[] nums) {
        int[] arr = new int[nums.length];
        arr = nums;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}