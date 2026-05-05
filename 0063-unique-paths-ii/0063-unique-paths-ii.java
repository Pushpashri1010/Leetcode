class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length,c=obstacleGrid[0].length;
        int dp[][]=new int[r][c];
        if(obstacleGrid[0][0]==1 && obstacleGrid[r-1][c-1]==1 ) return 0;
        for(int i=0;i<c;i++){
            if(obstacleGrid[0][i]==1) break;
            dp[0][i]=1;
        }
        for(int j=0;j<r;j++){
            if(obstacleGrid[j][0]==1) break;
            dp[j][0]=1;
        }
        
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                
               
                    if(obstacleGrid[i][j]==0){
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                
            }
        }
        return dp[r-1][c-1];
        
    }
}