class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int prev=1;
        int prev2=1;
        for(int i=1;i<s.length();i++){
           int cur=0;
           if(s.charAt(i)!='0'){
            cur+=prev;
           }
           int twodigit=(s.charAt(i-1)-'0')*10+(s.charAt(i)-'0');
           if(twodigit>=10 && twodigit<=26){
             cur+=prev2;
           }
           prev2=prev;
           prev=cur;
        }
        return prev;
    }
}