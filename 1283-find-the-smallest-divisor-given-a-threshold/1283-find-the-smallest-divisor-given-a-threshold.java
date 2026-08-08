class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low= 1;
        int high = Integer.MIN_VALUE;
        int ans = 0;
        int mid = 0;
        for(int i = 0;i<nums.length;i++) {
            low = Math.min(nums[i],low);
            high = Math.max(nums[i],high);
        }
        while(low<=high) {
            mid = (low + high)/2;
            int sum = 0;
            for(int i = 0;i<nums.length;i++) {
                sum += (double)Math.ceil((double)nums[i] /(double) mid);
            }
            if(sum > threshold){
                low = mid+1;
            }
            else {
                ans = mid;
                high = mid-1;
            }
            
        }
       
        return ans;
    }
}