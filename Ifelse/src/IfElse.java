public class IfElse
{
    public static void main(String[] args)
    {
        boolean isStudent = true;
        System.out.println("If isStudent is true:");
        System.out.printf(" isStudent = %b\n",isStudent);
        System.out.printf(" not isStudent = %b\n\n", !isStudent);
        boolean isProfessor = false;
        System.out.println("If isProfessor is false:");
        System.out.printf(" isProfessor = %b\n",isProfessor);
        System.out.printf(" not isProfessor = %b\n\n", !isProfessor);
    }
    public static void main2(String[] args)
    {
        int age = 20;
        if (age >= 21)
        {
            System.out.println("This will only print if (age >= 21) is true");
        }
        if (age % 2 == 0)
        {
            System.out.println("This will print if age is an even number--" + "\ni.e., the remainder of age divided by 2 is 0 ");
        }
        if (age != 21)
        {
            System.out.println("This will print if( age is not equal to 21) is true");
        }
    }
}
