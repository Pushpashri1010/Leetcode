class Solution {
    public String longestCommonPrefix(String[] str) {
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            int j=0;
            while(j<str[i].length() && j<prefix.length() && prefix.charAt(j)==str[i].charAt(j)){
                j++;
                
            
            }
            prefix=prefix.substring(0,j);
            if(prefix.isEmpty()){
                   break;
            }
        }
        return prefix;
    }
}