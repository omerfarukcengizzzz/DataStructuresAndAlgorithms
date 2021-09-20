import java.util.Arrays;

public class ReversingArrays {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 4};

        System.out.println(Arrays.toString(reverseArray(arr)));


    }

    public static int[] reverseArray(int[] arr) {

        if (arr.length % 2 == 1) {

            for (int i = 0; i <= (arr.length / 2) - 1; i++) {

                if (i == 0) {
                        int temp = 0;

                        temp = arr[i] + arr[arr.length-1];
                        arr[arr.length-1] = temp - arr[arr.length-1];
                        arr[i] = temp - arr[arr.length-1];

                } else if (i == 1) {

                        int temp = 0;

                        temp = arr[i] + arr[arr.length-2];
                        arr[arr.length-2] = temp - arr[arr.length-2];
                        arr[i] = temp - arr[arr.length-2];

                }

            }

        }

        return arr;
    }
}
