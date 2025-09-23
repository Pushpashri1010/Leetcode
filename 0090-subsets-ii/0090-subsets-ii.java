class Solution {
    public static void sub(List<List<Integer>> result,List<Integer> temp,int []nums,int ind){
        if(ind==nums.length){
            if(!result.contains(temp)){
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(nums[ind]);
        sub(result,temp,nums,ind+1);
        temp.remove(temp.size()-1);
        sub(result,temp,nums,ind+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        sub(result,temp,nums,0);
        return result;
    }
}