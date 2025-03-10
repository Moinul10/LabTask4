import java.util.Scanner;

public class Identity_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for matrix dimensions (square matrix)
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is an identity matrix
        if (isIdentityMatrix(matrix, n)) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }

        scanner.close();
    }

    // Function to check if the matrix is an identity matrix
    public static boolean isIdentityMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    // Check if diagonal elements are 1
                    if (matrix[i][j] != 1) {
                        return false;
                    }
                } else {
                    // Check if non-diagonal elements are 0
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
