class Solution {
    public String longestCommonPrefix(String[] str) {
       String res="";
       int count=0,min=str[0].length();
       if(str.equals("")){
        return res;
       }
       for(int i=1;i<str.length;i++){
           min=Math.min(str[i].length(),min);
       }
       for(int i=0;i<min;i++){
        for(int j=1;j<str.length;j++){
             if(str[0].charAt(i)==str[j].charAt(i)){
                count+=1;
             }
        }
        if(count==str.length-1){
            res=res+(str[0].charAt(i));
        }
        else{
            return res;
        }
        count=0;
       }
       return res;
    }
}