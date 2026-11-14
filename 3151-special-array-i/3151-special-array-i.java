class Solution {
    public boolean isArraySpecial(int[] nums) {
        int previous=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            if(previous==nums[i]%2){
                return false;
            }
            previous=nums[i]%2;
        }
        
        return true;
    }
}