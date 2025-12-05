class Solution {
    public boolean f(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
        
    }
    public String longestPalindrome(String s) {
        String str="";
        String st="";
        int k=0;
        for(int j=0;j<s.length();j++){
        for(int i=k;i<s.length();i++){

              str=s.substring(j,i+1);
              boolean res=f(str,0,str.length()-1);
              if(res){
                if(str.length()>st.length()){
                    st=str;
                }
              }
        }
            k+=1;
            str="";  
        }
        return st;
    }
}