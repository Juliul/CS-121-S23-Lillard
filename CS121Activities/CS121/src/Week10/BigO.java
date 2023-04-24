package Week10;

public class BigO {
    public void printOnce(String string) {System.out.println(string);}
    public void printNTimes(int n)
    {
        for (int i = 0; i < n; i++)
        {System.out.println("And this one prints for each instance of n, so it is O(n)");}
    }
    public void printNSquaredTimes(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {System.out.println("This final method prints an n squared amount of times, so it is O(n^2)");}
        }
    }
}
