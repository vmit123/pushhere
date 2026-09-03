class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] count = new int[nums.length + 1];
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 0) {
                arr.add(i);
            }
        }

        return arr;
    }
}