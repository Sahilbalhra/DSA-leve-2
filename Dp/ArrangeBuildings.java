// Arrange Buildings

// 1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
// 2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
// 3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.

// Sample Input
// 6
// Sample Output
// 441

import java.util.*;

public class ArrangeBuildings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        long n = scn.nextInt();
        long ocBuilding = 1;
        long ocSpace = 1;

        for (long i = 2; i <= n; i++) {
            long ncBuilding = ocSpace;
            long ncSpace = ocSpace + ocBuilding;

            ocBuilding = ncBuilding;
            ocSpace = ncSpace;
        }
        long ans = ocBuilding + ocSpace;
        System.out.println(ans * ans);
        scn.close();
    }

}
