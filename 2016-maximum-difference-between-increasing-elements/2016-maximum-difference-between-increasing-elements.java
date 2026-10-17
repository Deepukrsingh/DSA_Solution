class Solution {
    public int maximumDifference(int[] nums) {

       
        int max=-1;
        for(int i=0;i<nums.length-1;i++){
            int diff=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){

                    diff=nums[j]-nums[i];
                    max=Math.max(diff,max);


                }
            }
        }
        return max;
        
    }
}