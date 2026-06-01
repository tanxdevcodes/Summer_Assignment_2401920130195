
import java.util.*;
public class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int diff = target - arr[i];
            if(!map.containsKey(diff)){
                map.put(arr[i] , i);
            }else{
                System.out.println(map.get(diff)+ "," + i);
                return;
            }
        }
        System.out.println("-1,-1");
    }
}