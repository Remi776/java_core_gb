package ru.gb.java_core.homework2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 7, 0, 1, 3, 0, 0, 1, 7, 2, 0};
        int[] b = {2, 1, 2, 3, 4};
        int[] c = {0, 0, 0};
        int[] d = {1, 3, 5};

        System.out.println(findAdjacentElements(a));
        System.out.println(findAdjacentElements(b));
        System.out.println(findAdjacentElements(c));
        System.out.println(findAdjacentElements(d));
        System.out.println();
        System.out.println(countEvens(a));
        System.out.println(countEvens(b));
        System.out.println(countEvens(c));
        System.out.println(countEvens(d));
        System.out.println();
        System.out.println(subtractMaxFromMin(a));
        System.out.println(subtractMaxFromMin(b));
        System.out.println(subtractMaxFromMin(c));
        System.out.println(subtractMaxFromMin(d));


    }

    public static boolean findAdjacentElements(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && nums[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
        return count;
    }

    public static int subtractMaxFromMin(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        return max - min;
    }
}
