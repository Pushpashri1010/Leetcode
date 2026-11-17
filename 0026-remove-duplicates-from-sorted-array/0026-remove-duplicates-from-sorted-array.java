class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
               if(nums[i]!=nums[i+1]){
                        count++;
                        arr.add(nums[i]);
               }
        }
        if(arr.size()>0){
        if(arr.get(arr.size()-1)!=nums[nums.length-1]){
            arr.add(nums[nums.length-1]);
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        }
        else{
            nums=new int[0];
        }
        return count;
    }
}