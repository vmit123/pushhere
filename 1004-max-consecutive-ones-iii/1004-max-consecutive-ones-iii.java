class Solution {
    public int longestOnes(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        int r = k;

        while (j < nums.length) {

            if (nums[j] == 0) {
                r--;
            }
            while (r < 0) {
                if (nums[i] == 0) {
                    r++;
                }

                i++;
            }

            count = j - i + 1;
            max = Math.max(max, count);

            j++;
        }

        return max;
    }
}