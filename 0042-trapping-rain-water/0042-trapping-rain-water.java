class Solution {
    public int trap(int[] height) {
        int leftarr[]=new int[height.length];
        int rightarr[]=new int[height.length];
        leftarr[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftarr[i]=Math.max(height[i],leftarr[i-1]);
        }
        rightarr[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightarr[i]=Math.max(height[i],rightarr[i+1]);
        }
        int totalsum=0;
        for(int i=0;i<height.length;i++){
            int sum=Math.min(leftarr[i],rightarr[i])-height[i];
            totalsum=sum+totalsum;

        }
        return totalsum;


        
    }
}