class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   res=Math.max(res, dfs(i,j,grid));
                }
            }
        }
        return res;
    }
    public int dfs(int i,int j,int[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || (grid[i][j]==0)){
            return 0;
        }
        int max=grid[i][j];
        grid[i][j]=0;
        max+=dfs(i-1,j,grid);
        max+=dfs(i+1,j,grid);
        max+=dfs(i,j-1,grid);
        max+=dfs(i,j+1,grid);
        return max;

    }
}