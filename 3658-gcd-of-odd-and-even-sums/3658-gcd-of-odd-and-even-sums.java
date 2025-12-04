class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        int i=1;
        int j=2;
        while(n>0){
            odd+=i;
            even+=j;
            i+=2;
            j+=2;
            n=n-1;
        }
        return gcd(odd,even);
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}