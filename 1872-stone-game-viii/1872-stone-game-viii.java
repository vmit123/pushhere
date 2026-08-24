class Solution {

    public int stoneGameVIII(int[] stones) {

        int[] prefix = new int[stones.length];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int store = 0;

        prefix[0] = stones[0];

        for(int i = 1; i < stones.length; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

        max = prefix[stones.length - 1];

        for(int i = stones.length - 2; i >= 1; i--) {

            store = prefix[i] - max;

            max = Math.max(max, store);

            min = Math.min(min, store);
        }

        return max;
    }
}