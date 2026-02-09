class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int l = 0;
        int r = n - 1;
        int k = n - 1; 
        
        while (l <= r) {
            int leftSq = nums[l] * nums[l];
            int rightSq = nums[r] * nums[r];

            if (leftSq > rightSq) {
                result[k--] = leftSq;
                l++;
            } else {
                result[k--] = rightSq;
                r--;
            }
        }
        return result;
    }
}
