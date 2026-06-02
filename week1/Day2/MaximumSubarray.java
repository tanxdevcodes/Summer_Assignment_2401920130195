
import java.util.*;

public class MaximumSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            max = Math.max(sum, max);

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);

    }
}