class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(map.containsKey(text.charAt(i))){
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            }
            else{
                map.put(text.charAt(i),1);
            }
        }
        String s="balloon";
        int count=0;
        int i=0;
        while(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>0){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    i++;
                    if(i==s.length()){
                        count++;
                        i=0;
                    }
        }
        return count;
    }
}