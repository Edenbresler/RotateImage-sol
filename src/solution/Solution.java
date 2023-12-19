package solution;

public class Solution {
    public static void main(String[] args) {
        // we need to print 741852963
        int[][] example1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(example1);
        for (int i = 0; i < example1.length; i++) {
            for (int j = 0; j < example1[0].length; j++) {
                System.out.print(example1[i][j]);
            }
        }


    }

    public static void rotate(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < (matrix.length / 2); i++) {
            for (int j = i; j < (size - 1 - i); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size - 1 - j][i];
                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - 1 - j];
                matrix[size - 1 - i][size - 1 - j] = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = temp;
            }
        }
    }
}
