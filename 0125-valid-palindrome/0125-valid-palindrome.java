class Solution {
    public boolean isPalindrome(String s) {
        String th=s.toLowerCase();
       // String str=th.replaceAll("[ ,:./@!#$%^&*(_)'\{}[]""]","");
       //String str=th.replaceAll("\\p{Punct}","");
       String str = th.replaceAll("[^a-zA-Z0-9]", "");

       System.out.println(str);
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}