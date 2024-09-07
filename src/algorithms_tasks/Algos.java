package algorithms_tasks;

import java.util.Arrays;

public class Algos {
    public static void main(String[] args) {
        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6, 8, 10};
        int[] result = merge(first, second);
        System.out.println(Arrays.toString(result));  // [1, 2, 3, 4, 5, 6]
    }


    static int[] merge(int[] first, int[] second) {
        int l = 0;
        int r = 0;
        int[] sortedArray = new int[first.length + second.length];
        int temp = 0;

        while (l < first.length && r < second.length) {
            if (first[l] < second[r]) {
                sortedArray[temp] = first[l];
                temp++;
                l++;
            } else {
                sortedArray[temp] = second[r];
                temp++;
                r++;
            }
        }

        while (l < first.length) {
            sortedArray[temp] = first[l];
            l++;
            temp++;
        }

        while (r < second.length) {
            sortedArray[temp] = second[r];
            r++;
            temp++;
        }
        return sortedArray;
    }


    static void selectionSort(int[] nums) {
        for (int round = 0; round < nums.length; round++) {
            int smallest = round;
            for (int i = round + 1; i < nums.length; i++) {
                if (nums[i] < nums[smallest]) {
                    smallest = i;
                }
            }
            if (smallest != round) {
                int temp = nums[smallest];
                nums[smallest] = nums[round];
                nums[round] = temp;
            }
        }
    }

    // O (n2)
    static void bubbleSort(int[] nums) {
        for (int round = 0; round < nums.length; round++) {
            boolean isSorted = true;
            for (int i = 0; i < nums.length - 1 - round; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }
    }
}







