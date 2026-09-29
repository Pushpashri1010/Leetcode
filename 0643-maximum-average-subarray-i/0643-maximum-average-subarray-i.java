class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            avg=sum/k;
        }
        int j=0;
        double max_avg=avg;
        for(int t=k;t<nums.length;t++){
            
            sum=sum-nums[j];
            sum=sum+nums[t];
            avg=sum/k;
            max_avg=Math.max(avg,max_avg);
            j+=1;
        }
        return max_avg;
    }
}