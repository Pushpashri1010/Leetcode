class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        Arrays.fill(res,-1);
        int c=0;
        if(nums.length==1 && nums[0]==target){
            res[0]=0;
            res[1]=0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(c==0){
                res[0]=i;
                res[1]=i;
                c++;
                }
                else{
                    res[1]=i;
                }
            }
        }
        return res;
    }
}