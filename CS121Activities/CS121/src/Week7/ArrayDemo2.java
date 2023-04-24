package Week7;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] array2 = new int[4][3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;
        array2[2][0] = 7;
        array2[2][1] = 8;
        array2[2][2] = 9;
        array2[3][0] = 10;
        array2[3][1] = 11;
        array2[3][2] = 12;
        for (int row = 0; row < array2.length; row++) {
            for (int col = 0; col < array2[row].length; col++) {
                System.out.printf("%d ", array2[row][col]);
            }
            System.out.println();
        }
    }
}
