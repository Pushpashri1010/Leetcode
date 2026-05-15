class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int fre1[]=new int[1000];
        int fre2[]=new int[1000];
        int arr[]=new int[2];
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            fre1[nums1[i]]+=1;
        }
        for(int i=0;i<nums2.length;i++){
            fre2[nums2[i]]+=1;
        }
        for(int i=0;i<nums1.length;i++){
            if(fre2[nums1[i]]>0){
                ans+=1;
            }
        }
        arr[0]=ans;
        ans=0;
        for(int i=0;i<nums2.length;i++){
             if(fre1[nums2[i]]>0){
                ans+=1;
             }
        }
        arr[1]=ans;
        return arr;
    }
}