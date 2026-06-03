
import java.util.*;
public class MoveZeroes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
          nums[i] = sc.nextInt();
        }
        int left = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                nums[left] = nums[i];
                left++;
            }
        }
        while(left < n){
            nums[left] = 0;
            left++;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println(nums[i] + " ");
        }
    }
}
