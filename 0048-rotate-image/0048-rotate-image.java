class Solution {
    public void rotate(int[][] matrix) {
        int arr[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            int k=0;
            for(int j=matrix[0].length-1;j>=0;j--){
               matrix[i][k]=arr[i][j];
               k=k+1;
            }
            
        }
    }
}