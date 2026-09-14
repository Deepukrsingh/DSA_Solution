class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>second && nums[i]!=max){
                second=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>third && nums[i]!=max && nums[i]!=second){
                third=nums[i];
            }
        }
        if(third==Long.MIN_VALUE){
            return (int) max;
        }
        return (int) third;
        
        
    }
}