class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            String reverse=new StringBuilder(s).reverse().toString();
            int size=reverse.length();
            int rev=Integer.parseInt(reverse);
            while(size>0){
                int rem=rev%10;
                l.add(rem);
                rev=rev/10;
                size-=1;
            }
           /* int c=0;
            if(reverse.startsWith("0")){
                for(int j=0;j<reverse.length();j++){
                    if(reverse.charAt(j)=='0'){
                        c+=1;
                    }
                }
            
            while(c>0){
                l.add(0);
                c=c-1;
            }
            }*/
        }
        int arr[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}