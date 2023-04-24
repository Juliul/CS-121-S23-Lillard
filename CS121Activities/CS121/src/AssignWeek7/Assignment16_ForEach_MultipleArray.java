package AssignWeek7;

public class Assignment16_ForEach_MultipleArray {
    public static void main(String[] args)
    {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6} };

        int[][] array2 = { {1, 2}, {3}, {4, 5, 6} };

        for (int[] row : array1)
        {
            for (int column : row)
            {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        System.out.println();
        for (int[] row : array2)
        {
            for (int column : row)
            {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
    }
}
