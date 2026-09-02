class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int count = 0;
        while(i<nums.length) {
        for(int j = 0;j<nums.length;j++) {
            if(nums[i] > nums[j]) {
                count++;
            }
        }
        arr[i] = count;
        count = 0;
        i++;
        }
        return arr;  
    }
}