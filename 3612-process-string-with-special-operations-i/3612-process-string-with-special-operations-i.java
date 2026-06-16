class Solution {
    public String processStr(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            boolean islower=Character.isLowerCase(s.charAt(i));
            if(islower){
                result.append(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i)=='*'){
                if(result.length()>0){
                    result.deleteCharAt(result.length()-1);
                }
            }
            else if(s.charAt(i)=='#'){
                result.append(result);
            }
            else{
                result.reverse();
            }
        }
        String res=result.toString();
        return res;
    }
}