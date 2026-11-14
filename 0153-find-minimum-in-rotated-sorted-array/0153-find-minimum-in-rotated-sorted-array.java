class Solution {
    public int findMin(int[] nums) {
        int last = nums[nums.length - 1];
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > last) left = mid + 1;
            else right = mid;
        }

        return nums[left];
    }
}