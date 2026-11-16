class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int fre1[]=new int[26];
       int fre2[]=new int[26];
       for(int i=0;i<s1.length();i++){
         fre1[s1.charAt(i)-'a']+=1;
       }
       if(s1.length()>s2.length()){
        return false;
       }
       int k=s1.length();
       for(int i=0;i<k;i++){
         fre2[s2.charAt(i)-'a']+=1;
       }
       if(Arrays.equals(fre1,fre2)){
        return true;
       }
       for(int i=0;i<s2.length()-k;i++){
        fre2[s2.charAt(i)-'a']-=1;
        fre2[s2.charAt(i+k)-'a']+=1;
        if(Arrays.equals(fre1,fre2)){
            return true;
        }
       }
       return false;

    }
}