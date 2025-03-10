public class FindMaximumMinimum{
    public static void main(String[] args) {

        int[][] array = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };

        int Maximum = array[0][0];
        int Minimum = array[0][0];
        for (int row=0;row<3;row++) {
            for (int column=0;column<3; column++) {
                if (Maximum < array[row][column]) {
                    Maximum = array[row][column];
                } else if (Minimum > array[row][column]) {
                    Minimum = array[row][column];
                }
            }
        }
        System.out.println("Maximum number of 2D array = " + Maximum);
        System.out.println("Minimum number of 2D array = " + Minimum);
       
    }
}
