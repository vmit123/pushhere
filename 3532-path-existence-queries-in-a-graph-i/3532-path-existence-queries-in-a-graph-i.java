class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] com = new int[nums.length];
        int comp = 0;
        com[0] = comp;
        for(int i = 1;i<n;i++) {
            if(nums[i] - nums[i-1] > maxDiff) {
                comp++;
            }
            com[i] = comp;
        }

        boolean[] ans = new boolean[queries.length];
        int i =0;
        for(int[] num:queries) {
            if(com[num[0]] == com[num[1]]) {
                ans[i] = true;
            }
            else {
                ans[i] = false;
            }
            i++;
        }
        return ans;
    }
}