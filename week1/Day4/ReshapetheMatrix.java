
import java.util.Arrays;

public class ReshapetheMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Agar reshape possible nahi hai to original matrix return karo
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4}
        };

        int r = 1;
        int c = 4;

        int[][] ans = matrixReshape(mat, r, c);

        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}
