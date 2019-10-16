import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {


    public static class Solution {
        public int maxProfit(int prices[]) {
            int minprice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minprice)
                    minprice = prices[i];
                else if (prices[i] - minprice > maxprofit)
                    maxprofit = prices[i] - minprice;
            }
            return maxprofit;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

//        // stock prices on consecutive days
//        ArrayList<Integer> price = new ArrayList<Integer>();
//
//        price.add(100);
//        price.add(180);
//        price.add(260);
//        price.add(310);
//        price.add(40);
//        price.add(535);
//        Collections.sort(price);
//        int a = price.get(0);
//        Collections.reverse(price);
//        int b = price.get(0);
//        System.out.println("Buy"+ Integer.MAX_VALUE + "Sell" + b);


            int[] price = {100, 180, 260, 310, 40, 535, 695};
            int n = price.length;

            // fucntion call
            System.out.println(solution.maxProfit(price));
        }
    }
}
