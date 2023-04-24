package Week10;

public class Test {
    public static void main(String[] args)
    {
        BigO test = new BigO();
        test.printOnce("So this should be O(1)");
        test.printNTimes(2);
        test.printNSquaredTimes(2);
        System.out.println("And to prove that it works, all of these should affect n by 2");
    }
}
