public class Print2DArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };
        // Print the array elements
        System.out.println("Elements of the 2D array:");
        for (int row=0;row<3;row++) {
            for (int column=0;column<3;column++) {
                System.out.print(" "+array[row][column] );
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
    

