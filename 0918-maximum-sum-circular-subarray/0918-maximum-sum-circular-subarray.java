class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_cur_sum=nums[0];
        int max_sub_array=nums[0];
        int total=nums[0];
        int min_cur_sum=nums[0];
        int min_sub_array=nums[0];
        for(int i=1;i<nums.length;i++){
            max_cur_sum=Math.max(max_cur_sum+nums[i],nums[i]);
            max_sub_array=Math.max(max_cur_sum,max_sub_array);
            min_cur_sum=Math.min(min_cur_sum+nums[i],nums[i]);
            min_sub_array=Math.min(min_cur_sum,min_sub_array);
            total+=nums[i];
        }
        if(max_sub_array<0){
            return max_sub_array;
        }
        else{
            return Math.max(max_sub_array,(total-min_sub_array));
        }
    }
}