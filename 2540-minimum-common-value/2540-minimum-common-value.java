class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums1.length;i++){
        if(map.containsKey(nums1[i])){
            map.put(nums1[i],map.get(nums1[i]+1));
        }
        else{
            map.put(nums1[i],1);
        }
       }
       for(int i=0;i<nums2.length;i++){
        if(map.containsKey(nums2[i])){
            return nums2[i];
          
        }
       }
       return -1;

        
    }
}