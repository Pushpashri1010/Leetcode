class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int n=hm.get(nums[i]);
                int abs=Math.abs(n-i);
                if(abs<=k){
                    return true;
                }
                else{
                    hm.remove(nums[i]);
                    hm.put(nums[i],i);
                }
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}