package AssignWeek7;
import java.util.ArrayList;
public class Assignment17_ArrayList
{
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<Character> letterGrades = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    public void addScore(int score)
    {
        scores.add(score);
    }
    public void removeScore(int score)
    {
        scores.remove(score);
    }
    public int getScore(int index)
    {
        return scores.get(index);
    }
    public int getSizeOfScoreList()
    {
        return scores.size();
    }
    public void displayScores1()
    {
        System.out.printf("Scores:%n");
        for (Object score : scores)
        {
            System.out.printf("%d%n", score);
        }
    }
    public void displayScores2()
    {
        System.out.printf("Scores:%n");
        for (int i = 0; i < scores.size(); i++);
        {
           // System.out.printf("%d%n", scores.get(i));
        }
    }
}
