class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 70000;
        int max=-1;
        
        int ans = -1;
        for(int i = 0;i<nums.length;i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int start = 1;
        int end = max;
        while(start <= end) {
            int mid = start + (end - start)/2;
            int sum = 0;
            for(int i = 0;i<nums.length;i++) {
                sum += (double)Math.ceil((double)nums[i] /(double) mid);
            }
            if(sum > threshold) {
                start = mid+1;
            }
            else {    
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
}