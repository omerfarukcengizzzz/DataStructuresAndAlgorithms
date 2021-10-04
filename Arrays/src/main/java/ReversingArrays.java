import java.util.Arrays;

public class ReversingArrays {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 4, -1, 5, 7, -6};

        System.out.println(Arrays.toString(reverseArray(arr)));

    }

    public static int[] reverseArray(int[] arr) {

        for (int i = 0; i <= (arr.length / 2) - 1; i++) {

            int j = (arr.length - 1) - i;

            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }

        return arr;
    }

}
