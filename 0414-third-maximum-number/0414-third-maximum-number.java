class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        arr.sort(Collections.reverseOrder());
        if(arr.size()<3){
            return arr.get(0);
        }
        return arr.get(2);
    }
}