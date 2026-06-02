import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 1; i < n; i++) {

            if(arr[i] == arr[i - 1]) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}

