public class SumArrayElements {
    public static void main(String[] args) {
        int[][] array = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
        };
        int sum = 0;
         for (int row=0;row<3;row++) {
            for (int column=0;column<3;column++) {
                sum += array[row][column];
            }
        }
        System.out.println("The sum of all elements in the array is: "+sum);  
    }
}
