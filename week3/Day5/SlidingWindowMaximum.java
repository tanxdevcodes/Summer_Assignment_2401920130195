import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }

        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;

        // Store indices
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < a.length; i++) {

            // Remove indices out of current window
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }

            // Remove smaller elements
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }

            q.offer(i);

            // Window complete
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }

        return r;
    }
}

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = obj.maxSlidingWindow(arr, k);

        System.out.println(Arrays.toString(result));
    }
}