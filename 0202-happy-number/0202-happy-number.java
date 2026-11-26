class Solution {
    public boolean isHappy(int n) {
        int sum=0,rem=0,num=0;
        HashSet<Integer> hs=new HashSet<>();
        if(n==1 || n==10){
            return true;
        }
        else{
            while(n!=1){
                num=n;
                sum=0;
                while(num!=0){
                    rem=num%10;
                    sum+=rem*rem;
                    num=num/10;
                    
                }
                if(sum==1){
                    return true;
                }
                else{
                   if(!hs.add(sum)){
                    return false;
                   }
                }
                n=sum;
            }
        }
        return false;
    }
}