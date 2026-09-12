class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        long second=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>second && nums[i]!=max){
                second=nums[i];
            }
        }
        long third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>third && nums[i]!=second && nums[i]!=max){
                third=nums[i];
            }
        }

        if(third==Long.MIN_VALUE){
            return (int) max;

        }
        return (int) third;
        
        
    }
}