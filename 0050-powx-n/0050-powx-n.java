class Solution {
    public double myPow(double x, int n) {
        double res=0;
        if(n==0)
          res=1;
        if(x==0) res=0;
        if(n<0){
            x=1/x;
            n=Math.abs(n);
        }
        
        res=pow(x,n);
        return res;
    }
     
    public double pow(double x,int n){
        if(n==0)  return 1;
        double res=pow(x,n/2);
        if(n%2==0){
            return res*res;
        }
        else{
            return res*res*x;
        }
    }
}