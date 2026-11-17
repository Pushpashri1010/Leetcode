class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=1;
        int max=0;
        int total=0;
        if(nums.length==1 && nums[0]==1){
            return 1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==1 && nums[i+1]==0 || nums[i]==0 && nums[i+1]==1){
                max=Math.max(max,sum);
            }
            if(nums[i]==1 && nums[i+1]==1){
                sum+=1;
                max=Math.max(sum,max);
            }
            else{
                sum=1;
            }
            total+=nums[i];
        }
        total+=nums[nums.length-1];
        if(total==1){
            return 1;
        }
        
        return max;
    }
}