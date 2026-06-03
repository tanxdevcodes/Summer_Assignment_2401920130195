
import java.util.*;

public class ContainerwithMostWater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        for(int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int ans = 0;

        while(left < right) {

            int width = right - left;
            int h = Math.min(height[left], height[right]);

            int maxArea = width * h;

            ans = Math.max(ans, maxArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(ans);
    }
}
