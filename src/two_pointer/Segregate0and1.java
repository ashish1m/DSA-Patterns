package two_pointer;

import java.util.Arrays;

public class Segregate0and1 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        Segregate0and1 obj = new Segregate0and1();
        obj.segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }

    void segregate0and1(int[] arr) {
        // code here
        if (arr.length < 2) return;

        int p1 = 0;
        int p2 = 1;

        while (p2 < arr.length) {
            if (arr[p1] == 0) {
                p1++;
                p2++;
            } else if (arr[p1] > arr[p2]) {
                swap(arr, p1, p2);
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
    }

    void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
