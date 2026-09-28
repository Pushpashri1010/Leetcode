class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<String> arr=new ArrayList<>();
        int max=0;
        int left_pointer=0;
        int right_pointer=0;
        
        while(left_pointer<=right_pointer && right_pointer<s.length()){
            if(arr.contains(String.valueOf(s.charAt(right_pointer)))){
                arr.remove(0);
                left_pointer+=1;
               
            }
            else{
                arr.add(String.valueOf(s.charAt(right_pointer)));
                right_pointer+=1;
            }
            max=Math.max(max,arr.size());
        }
        return max;
    }
}