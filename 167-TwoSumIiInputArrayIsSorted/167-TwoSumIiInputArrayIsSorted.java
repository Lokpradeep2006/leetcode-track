// Last updated: 2/5/2026, 1:06:12 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r = numbers.length - 1;
        int l = 0;
        int sum = 0;
        while (l < r) {
            sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[] { l+1, r+1 };
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{};
    }
}