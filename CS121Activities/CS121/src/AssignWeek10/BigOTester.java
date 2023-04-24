package AssignWeek10;

public class BigOTester
{
    public static void main(String[] args)
    {
        BigOExamples example = new BigOExamples();
        /*
         * O(1)
         */
        //example.printFirstItem();
        /*
         * O(n)
         */
        example.printAllItems(example.character);
        example.printAllItems(example.biggestMovies2016);
        example.printAllItems(example.numbers);

        /*
         * O(n^2)
         */
        example.printAllPossibleOrderedPairs(example.biggestMovies2016);
        example.printAllPossibleOrderedPairs(example.numbers);

        example.printNTimes(5);
        example.printAllElements(example.biggestMovies2016);
    }
}
