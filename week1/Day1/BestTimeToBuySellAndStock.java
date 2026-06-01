
import java.util.*;

public class BestTimeToBuySellAndStock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] prices = new int[n];

        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < n; i++) {

            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            int profit = prices[i] - buyPrice;

            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println(maxProfit);
    }
}
