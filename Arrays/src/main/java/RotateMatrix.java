public class RotateMatrix {

    public static void main(String[] args) {

        // This main passes an array of 2D matrix to rotate MatrixRight method which rotates
        // matrix 90 degrees clockwise
        int n = 5;
        int[][] matrix = new int[n][n];
        int valueOfCell = 1;

        for (int i = 0; i < n; i++)
            for (int y = 0; y < n; y++)
                matrix[i][y] = valueOfCell++;

        printMatrix(rotateMatrixRight(matrix));

    }

    public static int[][] rotateMatrixRight(int[][] matrix) {

        if (!(matrix.length == 0 || matrix.length != matrix[0].length)) {
            int n = matrix.length;

            for (int layer = 0; layer < n / 2; layer++) {

                int first = layer;
                int last = n - 1 - layer;

                System.out.println("Initial Matrix at Layer : " + layer);
                printMatrix(matrix);

                for (int i = first; i < last; i++) {

                    int offset = i - first;
                    int temp = matrix[first][i]; // save top to Temp

                    // left -> top
                    matrix[first][i] = matrix[last - offset][first];
                    // bottom -> left
                    matrix[last - offset][first] = matrix[last][last - offset];
                    // right -> bottom
                    matrix[last][last - offset] = matrix[i][last];
                    // top -> right
                    matrix[i][last] = temp; // right <- saved temp value
                    printMatrix(matrix);
                }
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] Arr) {

        System.out.println("------------------");
        for (int[] arr : Arr) {
            System.out.print("    ");
            for (int number : arr) {
                System.out.print(number + "\t");
            }
            System.out.println("");
        }
    }

}