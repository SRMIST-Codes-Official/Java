class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = lowerBound(nums, lower - nums[i], i + 1);
            int right = upperBound(nums, upper - nums[i], i + 1);
            count += (right - left);
        }
        return count;
    }
    int lowerBound(int[] nums, int target, int start) {
        int left = start;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
    int upperBound(int[] nums, int target, int start) {
        int left = start;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}