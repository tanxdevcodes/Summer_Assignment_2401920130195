
import java.util.*;
public class RemoveDuplicatesfromSortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        for(; j<n ; j++){
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i+1);
    }
}
