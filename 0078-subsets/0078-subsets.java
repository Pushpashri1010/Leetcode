class Solution {
    public static void sub(List<List<Integer>>result,List<Integer> temp,int[] nums,int index){
        if(index==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        sub(result,temp,nums,index+1);
        temp.remove(temp.size()-1);
        sub(result,temp,nums,index+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>(); 
        sub(result,temp,nums,0);
        return result;
    }
}