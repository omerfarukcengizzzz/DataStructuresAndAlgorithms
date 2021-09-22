import java.util.Arrays;

public class ReversingArrays {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 4, -1};

        System.out.println(Arrays.toString(reverseArray(arr)));


    }

    public static int[] reverseArray(int[] arr) {

        for (int i = 0; i <= (arr.length / 2) - 1; i++) {

            int temp = 0;

            temp = arr[i] + arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp - arr[(arr.length - 1) - i];
            arr[i] = temp - arr[(arr.length - 1) - i];

        }

        return arr;
    }

}
