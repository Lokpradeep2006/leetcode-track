class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k == 0) return new int[0];

        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] output = new int[n - k + 1];
        int l = 0, idx = 0;

        for (int r = 0; r < n; r++) {

            if (!dq.isEmpty() && dq.peekFirst() < l) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) {
                dq.pollLast();
            }

            dq.offerLast(r);

            if (r + 1 >= k) {
                output[idx++] = nums[dq.peekFirst()];
                l++;
            }
        }

        return output;
    }
}
