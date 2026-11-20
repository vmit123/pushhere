class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int ans = 0;
        int total= n+m;
        int[] mer = new int[total];
        int k = 0,i=0,j=0;
        while(i<n && j<m ) {
            if(nums1[i] <= nums2[j]) {
                mer[k++] = nums1[i++];
            }
            else {
                mer[k++] = nums2[j++];
            }
        }
        while(i<n){
            mer[k++] = nums1[i++];
        }
        while(j<m){
            mer[k++] = nums2[j++];
        }
        if(total % 2==1) {
            return mer[(total)/2];
        }
        else {
            return (mer[total/2-1] + mer[total/2]) / 2.0;
        }
        
    }
}