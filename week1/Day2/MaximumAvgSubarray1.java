import java.util.*;

public class MaximumAvgSubarray1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int left = 0;
        int right = k;
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxsum = sum;

        while(right < nums.length) {

            sum -= nums[left];
            sum += nums[right];

            left++;
            right++;

            maxsum = Math.max(sum, maxsum);
        }

        double ans = (double) maxsum / k;

        System.out.println(ans);

    }
}