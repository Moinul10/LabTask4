import java.util.Scanner;

public class SymmetricMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Check if the matrix is square (rows == columns) for symmetry
        if (rows != columns) {
            System.out.println("A matrix must be square (same number of rows and columns) to be symmetric.");
            return;
        }

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is symmetric
        boolean isSymmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        // Output result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        scanner.close();
    }
}
