import java.util.*;
// greedy and disjoint question
// N activities with start and end. Find max number of activities

public class ActivitySection {
    public static void main(String[] args) {
        int start[] = { 10, 12, 20 };
        int end[] = { 20, 25, 30 };

        int maxAct = 0;

        // if not sorted

        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sorting
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<Integer>();

        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println(maxAct);
        System.out.println(ans);

    }

}
