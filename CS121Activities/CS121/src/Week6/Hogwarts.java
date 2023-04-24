package Week6;

public class Hogwarts {
   public String House;
   public String Color;
   private String Animal;
   private int number;

   public Hogwarts(){
       House = "Default House";
       Color = "Default Color";
       Animal = "Default Animal";
   }
    public Hogwarts(int number){
        this.number = number;
    }
    public Hogwarts(String House, String Color, String Animal){
        this.House = House;
        this.Color = Color;
        this.Animal = Animal;
    }
   public void Display(){
       System.out.println("This house is: " + House);
       System.out.println("Their house color is: " + Color);
       System.out.println("Their house animal is: " + Animal);
       System.out.println("The number is: " + number);
       System.out.println();
   }
   public void setHouse(String House){
       this.House = House;
   }
   public void setColor(String Color){
       this.Color = Color;
   }
   public void setAnimal(String Animal){
       this.Animal = Animal;
   }
    public void setAnimal(String Animal,int number){
        this.Animal = Animal;
        this.number = number;
    }
   public void setNumber(int number){
       this.number = number;
   }
   public String getHouse(){return House;}
    public String getColor(){return Color;}
   public String getAnimal(){return Animal;}
   public int getnumber(){return number;}
}