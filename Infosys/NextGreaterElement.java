// Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.

// Example 1:

// Input: N = 6
// arr = {1, 2, 3, 6, 5, 4}
// Output: {1, 2, 4, 3, 5, 6}
// Explaination: The next permutation of the 
// given array is {1, 2, 4, 3, 5, 6}.
// Example 2:

// Input: N = 3
// arr = {3, 2, 1}
// Output: {1, 2, 3}
// Explaination: As arr[] is the last 
// permutation. So, the next permutation 
// is the lowest one.

import java.util.*;

public class NextGreaterElement {
    class Solution {

        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        static List<Integer> nextPermutation(int n, int arr[]) {
            // finding the 1st smaller number
            ArrayList<Integer> list = new ArrayList<>();

            int i = n - 1;
            while (i > 0) {
                if (arr[i - 1] >= arr[i]) {
                    i--;
                } else {
                    break;
                }
            }
            // System.out.println(i);
            // already final form

            if (i == 0) {
                for (int k = n - 1; k >= 0; k--) {
                    list.add(arr[k]);
                }
                return list;
            }

            // finding the 1st greater idx

            int j = n - 1;
            while (j > i - 1) {
                if (arr[j] > arr[i - 1]) {
                    break;
                }
                j--;
            }
            swap(arr, j, i - 1);
            // System.out.println(j);

            int left = i;
            int right = n - 1;

            while (right >= left) {
                swap(arr, left, right);
                left++;
                right--;
            }

            for (int k = 0; k < n; k++) {
                list.add(arr[k]);
            }
            return list;

        }
    }

}
