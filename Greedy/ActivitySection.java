import java.util.ArrayList;

public class ActivitySection {
    public static void main(String[] args) {
        int start[] = { 10, 12, 20 };

        int end[] = { 20, 25, 30 };

        int maxAct = 0;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxAct);
        System.out.println(ans);

    }

}
