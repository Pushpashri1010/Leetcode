class Solution {
    public char findTheDifference(String s, String t) {
        int fre1[]=new int[26];
        int fre2[]=new int[26];
        for(int i=0;i<s.length();i++){
            fre1[s.charAt(i)-'a']+=1;
        }
        
        for(int i=0;i<t.length();i++){
            fre2[t.charAt(i)-'a']+=1;
        }
        char c='a';
        for(int i=0;i<26;i++){
            if(fre1[i]!=fre2[i]){
                c = (char) (i + 97);

                return c;
            }
        }
        return c;
    }
}