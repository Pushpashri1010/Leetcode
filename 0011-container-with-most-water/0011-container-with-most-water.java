class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int res=0;
        while(l<r){
            int minH=Math.min(height[l],height[r]);
            int wid=r-l;
            int volume=minH*wid;
            res=Math.max(res,volume);
            if(height[l]<height[r])
            l++;
            else r--;
        }
        return res;
    }
}