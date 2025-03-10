import java.util.Scanner;

public class Boundary_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print boundary elements
        System.out.println("Boundary elements of the matrix:");
        printBoundaryElements(matrix, rows, columns);

        scanner.close();
    }

    // Function to print boundary elements
    public static void printBoundaryElements(int[][] matrix, int rows, int columns) {
        // Print top row
        for (int j = 0; j < columns; j++) {
            System.out.print(matrix[0][j] + " ");
        }
        
        // Print right column (excluding the top and bottom corners)
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][columns - 1] + " ");
        }

        // Print bottom row (if there are more than one row)
        if (rows > 1) {
            for (int j = columns - 1; j >= 0; j--) {
                System.out.print(matrix[rows - 1][j] + " ");
            }
        }

        // Print left column (excluding the top and bottom corners)
        if (columns > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }

        System.out.println(); // Move to next line after printing boundary elements
    }
}
