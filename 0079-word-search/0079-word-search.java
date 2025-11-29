class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i,j,word,board,0,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(int i,int j,String word,char[][] board,int ind,boolean visited[][]){
        if(ind==word.length())
          return true;
        if(i<0 || j<0 || i>=board.length || j>= board[0].length || visited[i][j] || board[i][j]!=word.charAt(ind)){
            return false;
        }
        visited[i][j]=true;
        if(dfs(i-1,j,word,board,ind+1,visited) ||dfs(i+1,j,word,board,ind+1,visited) 
        || dfs(i,j-1,word,board,ind+1,visited) 
        || dfs(i,j+1,word,board,ind+1,visited) ){
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}