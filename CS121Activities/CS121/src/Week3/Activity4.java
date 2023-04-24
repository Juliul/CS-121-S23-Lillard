package Week3;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Switch();
    }
    public static void Switch() {
        String house;
        Scanner console = new Scanner(System.in);
        System.out.println("Which Hogwarts house do you seek?");
        house = console.nextLine();
        String founder = null,color = null, animal = null, traits = null;
        switch (house)
        {
            case "Ravenclaw":
                founder = "Rowena Ravenclaw";
                color = "Blue and Bronze";
                animal = "Eagle";
                traits = "Intelligence and witty";
                break;
            case "Slytherin":
                founder = "Salazar Slytherin";
                color = "Green and Silver";
                animal = "Snake";
                traits = "Pride and cunning";
                break;
            case "Hufflepuff":
                founder = "Helga Hufflepuff";
                color = "Yellow and Black";
                animal = "Badger";
                traits = "Patience and fairness";
                break;
            case "Gryffindor":
                founder = "Godric Gryffindor";
                color = "Scarlet and Gold";
                animal = "Lion";
                traits = "Courage and bravery";
                break;
            default:
                System.out.println("Invalid house.");
                break;
        }
        System.out.printf("Founder: "+founder+"\nColor: "+color+"\nAnimal: "+animal+"\nTraits: "+traits);
        console.close();
    }
}

