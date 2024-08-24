class Solution {
    public int findPeakElement(int[] nums) {
        int max=0;
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
               max=nums[i+1];
               index=i+1;
            }
        }
        return index;
    }
}