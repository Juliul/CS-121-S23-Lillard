package Week7;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10,11,12} }; // 2D array
        int[][][] array2 = new int [2][3][4]; // 3D Array
        for (int[] row : array1) {
            for (int col : row) {
                System.out.printf("%d ", col);
            }
            System.out.println();
        }
    }
}
