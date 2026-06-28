import java.util.*;

class NextGreaterElement1 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nextGreater = new int[10001]; // assuming values are <= 10000
        Arrays.fill(nextGreater, -1); // default -1

        Stack<Integer> stack = new Stack<>();

        // Step 1: build next greater for nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextGreater[nums2[i]] = -1;
            } else {
                nextGreater[nums2[i]] = stack.peek();
            }

            stack.push(nums2[i]);
        }

        // Step 2: build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater[nums1[i]];
        }

        return ans;
    }

    // Main method for VS Code testing
    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result)); // [-1, 3, -1]
    }
}