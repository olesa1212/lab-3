import java.util.Arrays;
import java.util.Scanner;

 class MajorityElement {
    public static int findMajority(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }

        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        int occurrences = 0;
        for (int num : nums) {
            if (num == candidate) {
                occurrences++;
            }
        }

        if (occurrences > nums.length / 2) {
            return candidate;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,1,2,3,4,2,1,2,2};

        System.out.println("Мажоритарное число: " + findMajority(a));

    }
}
