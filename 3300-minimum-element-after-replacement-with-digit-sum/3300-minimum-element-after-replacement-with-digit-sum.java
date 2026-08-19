class Solution {
    public int minElement(int[] nums) {
        int n=0,num=0,sum=0,min=nums[0];
        for(int i=0;i<nums.length;i++){
            num=nums[i];
            sum=0;
            if(nums[i]>=10 && nums[i]<100){
                     n=2;
            }
            else if(nums[i]>=100 && nums[i]<1000){
                n=3;
            }
            else if(nums[i]>=1000 && nums[i]<10000){
                n=4;
            }
            else{
                n=5;
            }
            while(n!=0){
                int rem=num%10;
                sum+=rem;
                num=num/10;
                n=n-1;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}