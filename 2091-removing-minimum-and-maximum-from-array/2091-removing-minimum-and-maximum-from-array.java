class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        
        int maxIndex = -1;

        for(int i = 0;i<nums.length;i++) {
            if(nums[i] < min) {
                minIndex = i;
                min = nums[i];
            }
        }
        for(int i = 0;i<nums.length;i++) {
            if(nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }

        int ans1 = Math.min(minIndex+1, (nums.length - minIndex+1));
        int ans2 = Math.min(maxIndex+1, (nums.length - maxIndex+1));
        int separate = ans1 + ans2;
        int bothLeft = Math.max(minIndex, maxIndex) + 1;

        int bothRight = nums.length - Math.min(minIndex, maxIndex);

        int opposite;

        if (minIndex < maxIndex) {
            opposite = (minIndex + 1) + (nums.length - maxIndex);
        } else {
            opposite = (maxIndex + 1) + (nums.length - minIndex);
        }

        return Math.min(
            Math.min(separate, bothLeft),
            Math.min(bothRight, opposite)
        );

    }
}