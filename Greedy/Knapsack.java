import java.util.*;

// given the wieghts and value of N items ,put these items in Knapsack[bag] of capacity W to get maximum total value in the knapsack

// value=[60,100,120]
// weiqhts=[10,20,30]
// W=50
// ans=240
// explanation=> 30+10+10 ==> 120+60+60=>240

public class Knapsack {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int wieghts[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) wieghts[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int cap = W;
        int profit = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (cap >= wieghts[idx]) {
                profit += value[idx];
                cap -= wieghts[idx];
            } else {
                profit += (ratio[i][i] * cap);
                cap = 0;
                break;
            }

        }
        System.out.println("Profit" + profit);

    }

}
