class Solution {
    public int countSubstrings(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        int count=0,i=0,j=0;
        for(i=s.length()-1;i>=0;i--){
            for(j=i;j<s.length();j++){
                if(i==j) dp[i][j]=true;
                else if(j==i+1){
                    dp[i][j]=(s.charAt(i)==s.charAt(j));
                }
                else{
                    
                    dp[i][j]=(s.charAt(i)==s.charAt(j)) && dp[i+1][j-1];
                }
                if(dp[i][j]){
                
                count=count+1;
                }
                }
        }
        
        return count;
    }
}