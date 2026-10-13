class Solution {
    public String longestCommonPrefix(String[] strs) {
  
        Arrays.sort(strs);
        String s="";
        String start=strs[0];
        String end=strs[strs.length-1];
        int i=0;
        int j=0;
        while(i<start.length() && j<end.length()){
            char ch=start.charAt(i);
            char th=end.charAt(j);
            if(ch==th){
                 s=s+ch;
                i++;
                j++;

            }
            else{
                return s;
            }

           

        }
        return s;

    }
}