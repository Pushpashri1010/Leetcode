class Solution {
    public void comsum2(List<List<Integer>> result,List<Integer> temp,int c[],int index,int target,int sum){
        if(sum==target){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(index>=c.length) return;
        if(sum>target) return;
        temp.add(c[index]);
        sum+=c[index];
        comsum2(result,temp,c,index+1,target,sum);
        while(index<c.length-1 && c[index]==c[index+1]) index=index+1;
        sum-=c[index];
        temp.remove(temp.size()-1);
        comsum2(result,temp,c,index+1,target,sum);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        comsum2(result,temp,candidates,0,target,0);
        return result;
    }
}