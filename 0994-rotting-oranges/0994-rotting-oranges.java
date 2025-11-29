class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int min=-1;
        while(!q.isEmpty()){
            int size=q.size();
            min++;
            while(size-- >0){
                int[] cur=q.poll();
                int r=cur[0],c=cur[1];
                if(r>0 && grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    q.add(new int[]{r-1,c});
                    fresh--;
                }
                if(r<rows-1 && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    q.add(new int[]{r+1,c});
                    fresh--;
                }
                if(c>0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    q.add(new int[]{r,c-1});
                    fresh--;
                }
                if(c<cols-1 && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    q.add(new int[]{r,c+1});
                    fresh--;
                }
            }
        }
        return fresh==0 ? min :-1;
    }
}