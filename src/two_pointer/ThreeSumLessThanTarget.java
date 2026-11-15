package two_pointer;

import java.util.Arrays;

public class ThreeSumLessThanTarget {

    public static void main(String[] args) {
        int sum = 2;
        int[] arr = {-2, 0, 1, 3};

        ThreeSumLessThanTarget obj = new ThreeSumLessThanTarget();
        System.out.println(obj.countTriplets(sum, arr));
    }

    public int countTriplets(int sum, int[] arr) {
        // code here
        int res = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int pStart = i + 1, pEnd = arr.length - 1;
            while (pStart < pEnd) {
                int p1 = arr[pStart], p2 = arr[pEnd];
                if (p1 + p2 + arr[i] < sum) {
                    res = res + pEnd - pStart;
                    pStart++;
                } else {
                    pEnd--;
                }
            }
        }
        return res;
    }
}