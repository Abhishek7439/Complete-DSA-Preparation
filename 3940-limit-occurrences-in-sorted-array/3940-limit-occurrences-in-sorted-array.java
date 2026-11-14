
public class Solution {
    public static int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        int writeIndex = 0;  // position to write next valid element
        int count = 0;       // count occurrences of current number

        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                // new number starts
                count = 1;
                nums[writeIndex++] = nums[i];
            } else {
                // same as previous number
                if (count < k) {
                    nums[writeIndex++] = nums[i];
                    count++;
                }
            }
        }

        // return only the valid portion
        return Arrays.copyOfRange(nums, 0, writeIndex);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        System.out.println(Arrays.toString(limitOccurrences(nums1, k1))); 
        // Output: [1, 1, 2, 2, 3]

        int[] nums2 = {1,2,3};
        int k2 = 1;
        System.out.println(Arrays.toString(limitOccurrences(nums2, k2))); 
        // Output: [1, 2, 3]
    }
}
