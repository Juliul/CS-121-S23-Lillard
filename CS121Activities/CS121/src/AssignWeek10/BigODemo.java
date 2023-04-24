package AssignWeek10;

public class BigODemo
{
    public void printOneTime(String string)
    {
        System.out.println(string);
    }

    public void printManyTimes(String string)
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(string);
        }
    }
    public void show(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println("string");
        }
    }
    public void squared(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.println("string");
            }
        }
    }
    public void show2(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.println("string");
            }
        }
    }
    public void show3(int n)
    {
        System.out.println("string");
        System.out.println("string");
        System.out.println("string");
    }
}
