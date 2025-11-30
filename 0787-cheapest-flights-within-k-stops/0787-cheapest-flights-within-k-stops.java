class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] price=new int[n];
        Arrays.fill(price,Integer.MAX_VALUE);
        price[src]=0;

        for(int i=0;i<=k;i++){
            int [] temp=Arrays.copyOf(price,n);
            for(int[] curr:flights){
                int s=curr[0];
                int d=curr[1];
                int w=curr[2];
                if(price[s]!=Integer.MAX_VALUE && price[s]+w<temp[d]){
                    temp[d]=price[s]+w;
                }
            }
            price=temp;
        }
        return price[dst]==Integer.MAX_VALUE?-1:price[dst];
    }
}