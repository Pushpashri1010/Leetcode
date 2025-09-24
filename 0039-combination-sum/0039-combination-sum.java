class Solution {
    public  void comsum(List<List<Integer>> result,List<Integer> temp,int index,int []c,int target,int sum){
        if(index>=c.length) return;
        if(sum==target){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target) return;
       
        if(sum<target){
            temp.add(c[index]);
            sum+=c[index];
            comsum(result,temp,index,c,target,sum);
        }
        sum-=c[index];
        temp.remove(temp.size()-1);
        comsum(result,temp,index+1,c,target,sum);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        comsum(result,temp,0,candidates,target,0);
        return result;
    }
}