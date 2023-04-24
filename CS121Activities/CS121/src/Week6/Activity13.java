package Week6;

public class Activity13 {
    public static void main(String[] args) {
        Hogwarts Ravenclaw = new Hogwarts("Ravenclaw","Blue and Bronze","Eagle");
        Ravenclaw.Display();
        Hogwarts test = new Hogwarts();
        test.Display();
        System.out.println(test.getAnimal());
        test.setAnimal("Lion");
        test.Display();
    }
 //   Using the Employee, Student, and StudentTest classes from the assignment as examples:
 //   Create a new project packages and within it a package packagesDemo.
 //  Inside this package, create:
    //  a class with: 4-5 instance variables (2 public, the rest private)
    //  a constructor
    //  4 methods, each using a different access modifier
// a test class to:
// create a new instance of the class
// see which variables and methods can be run
// comment out the ones that throw errors
}
