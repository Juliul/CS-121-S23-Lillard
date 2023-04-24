package AssignWeek7;

import AssignWeek7.Assignment17_ArrayList;

public class Assignment17_ArrayListTest
{
    public static void main(String[] args)
    {
        Assignment17_ArrayList demo = new Assignment17_ArrayList();

        demo.addScore(98);
        demo.addScore(87);
        demo.addScore(93);

        System.out.printf("Scores contains %d elements.%n", demo.getSizeOfScoreList());
        demo.displayScores1();

        System.out.printf("%nRemove first element: %d%n", demo.getScore(0));
        // remove element at 0 index (first element)
        demo.removeScore(0);
        System.out.printf("%nScores contains %d elements.%n", demo.getSizeOfScoreList());
        demo.displayScores2();


    }

}
