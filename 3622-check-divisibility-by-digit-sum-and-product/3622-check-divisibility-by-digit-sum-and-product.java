class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int product=1;
        int sum=0;
        while(num!=0){
            int r=num%10;
            sum+=r;
            product*=r;
            num=num/10;
        }
        int tot=sum+product;
        if(n%tot==0){
            return true;
        }
        else{
            return false;
        }
    }
}