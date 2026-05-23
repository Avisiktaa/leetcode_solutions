class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if (n <= 2) return true;

        int pivot = findMinIndex(nums);

        int idx = pivot;
        for (int i = 0; i < n - 1; i++) {
            if (nums[idx] > nums[(idx + 1) % n]) {
                return false;
            }
            idx = (idx + 1) % n;
        }
        return true;
    }

    private int findMinIndex(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        // choose the correct occurrence of min
        for (int i = 0; i < n; i++) {
            if (nums[i] == min) {
                // check if starting here yields sorted order
                if (isValidStart(nums, i)) {
                    return i;
                }
            }
        }
        return 0; // fallback
    }

    private boolean isValidStart(int[] nums, int start) {
        int n = nums.length;
        int idx = start;
        for (int i = 0; i < n - 1; i++) {
            if (nums[idx] > nums[(idx + 1) % n]) {
                return false;
            }
            idx = (idx + 1) % n;
        }
        return true;
    }
}
