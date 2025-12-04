class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,merged,0,nums1.length);
        System.arraycopy(nums2,0,merged,nums1.length,nums2.length);
        Arrays.sort(merged);
        int t=nums1.length+nums2.length;
        if(t%2==0){
            
            return (merged[t/2]+merged[(t/2)-1])/2.0;
        }
        else{
            return merged[t/2];
        }
    }
}