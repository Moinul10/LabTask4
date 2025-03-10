import java.util.Scanner;

public class MatrixMultiplication  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = scanner.nextInt();
        
        int[][] matrix1 = new int[rows1][columns1];
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        // Matrix multiplication is possible if columns of first matrix = rows of second matrix
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in matrix 1 must be equal to number of rows in matrix 2.");
            return;
        }

        int[][] matrix2 = new int[rows2][columns2];
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Initialize the result matrix
        int[][] result = new int[rows1][columns2];

        // Matrix multiplication logic
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
    
}