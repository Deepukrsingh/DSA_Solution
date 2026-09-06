class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
         if(nums.length==1){
        return nums[0];
        }
        int n=nums.length-1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>n/2){
                    return nums[i];
                }
            }
            else{
                count=1;
            }
        }
        return -1;
       

    }
}