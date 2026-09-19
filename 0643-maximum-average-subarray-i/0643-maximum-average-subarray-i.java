class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }

        avg=sum/k;
        double maxavg=avg;
        double maxsum=sum;

        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i];
            sum=sum-nums[i-k];
            avg=sum/k;
            maxavg=Math.max(avg,maxavg);

        }

        return maxavg;


    }
}