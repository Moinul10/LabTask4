public class SumRowColumns {
    public static void main(String[] args) {
        int[][] array = {
            {10, 15, 13},
            {5, 7, 13},
            {11, 21, 31}
        };

        // Calculate row-wise sum
        System.out.println("Row-wise sum:");
        for (int row=0;row<3;row++) {
            int rowSum = 0;
            for (int column=0;column<3;column++) {
                rowSum += array[row][column];
            }
            System.out.println("Sum of row " + (row + 1) + " = " + rowSum);
        }
        // Calculate column-wise sum
        System.out.println("Column-wise sum:");
        for (int column=0;column<3;column++) {
            int colSum = 0;
            for (int row=0;row<3;row++) {
                colSum += array[row][column];
            }
            System.out.println("Sum of column " + (column + 1) + " = " + colSum);
        }
    }
    
}
