package AssignWeek11;

public class LinearSearchDemo {
    public int linearSearch(int key, int[] array)
    {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Comparison: " + ++counter);
            if (key == array[i])
                return i;
        }
        return -1;
    }
}
