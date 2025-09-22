class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
        }
        if(sum%2!=0) return false;
        else{
            int target=sum/2;
            boolean dp[]=new boolean[target+1];
            dp[0]=true;
            for(int j=0;j<nums.length;j++){
            for(int i=target;i>=nums[j];i--){
                int t=i-nums[j];
                if(dp[t]==true){
                    dp[i]=true;
                  
                }
            }
            }
            
            if(dp[target]==true) return true;
             else return false;
        
        }
    }
}