import java.util.*;

// Indian Coins

// We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000].
// Find min no. of coins/notes to make change for a value V.
// v = 121
// ans 3 (100+20+1)

// V = 590
// ans 4 (500+50+20+20)

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int countOfCoins = 0;
        int amount = 590;
        Arrays.sort(coins, Comparator.reverseOrder());

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    amount -= coins[i];
                }
            }
        }

        System.out.println(countOfCoins);
    }

}
