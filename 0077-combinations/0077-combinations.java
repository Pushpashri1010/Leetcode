class Solution {
    public void com(List<List<Integer>> result,List<Integer> temp,int index,int n,int k){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return ;
        }
        if(index==n+1) return;
        temp.add(index);
        com(result,temp,index+1,n,k);
        temp.remove(temp.size()-1);
        com(result,temp,index+1,n,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        com(result,temp,1,n,k);
        return result;
    }
}