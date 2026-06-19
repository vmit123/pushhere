class Solution {
    int[] dp;
    public int no(int[] nums,int i){
        int jumps = Integer.MAX_VALUE;
        if(i>=nums.length-1)return 0;
        if(nums[i] == 0)return Integer.MAX_VALUE;
        if(dp[i] !=-1)return dp[i];
        for(int jump=1;jump<=nums[i];jump++) {
            int ans = no(nums, i + jump);
            if(ans != Integer.MAX_VALUE){
                jumps = Math.min(jumps,1+ans);
            }
        }
        
        return dp[i] = jumps;
    }
    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return no(nums,0);
    }
}