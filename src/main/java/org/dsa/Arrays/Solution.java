package org.dsa.Arrays;

import java.util.Arrays;

public class Solution {
        // 3074 Apple redistribution into boxes
        public static int minimumBoxes(int[] apple, int[] capacity) {
            int sum = 0;
            int total = 0;
            int ans = 0;
            for (int x : apple) {
                sum += x;
            }
            Arrays.sort(capacity);

            for (int i = capacity.length - 1; i >= 0 && total < sum; i--) {
                ans++;
                total += capacity[i];
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] apple = {2, 5, 3, 6};
        int[] capacity = {10, 5, 3, 7, 1, 6};
        System.out.println(minimumBoxes(apple,capacity));
    }
}
