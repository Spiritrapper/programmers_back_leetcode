package 알고리즘예시;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int amount = 93;
        
        System.out.println("Minimum number of coins required: " + minCoins(coins, amount));
    }

    public static int minCoins(int[] coins, int amount) {
        int n = coins.length;

        ArrayList<Integer> result = new ArrayList<>();

        // Sort coins in decreasing order
        Arrays.sort(coins);
        for (int i = n -1; i >= 0; i--) {
            // Find coins that are less than or equal to remaining amount
            while (amount >= coins[i]) {
                amount -= coins[i];
                result.add(coins[i]);
            }
        }
        // Print coins used
        System.out.println("Coins used: ");
        for(int coin : result) {
            System.out.println(coin + " ");
        }
        System.out.println();
        // Return number of coins used
        return result.size();
    }
}
