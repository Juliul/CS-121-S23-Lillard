package Project2;
import java.util.Scanner;

public class PokemonSelection {
    // create scanner object
    Scanner input = new Scanner(System.in);


    //create pokemon method
    public  Pokemon createPokemon(){


        System.out.print("Enter Name: ");
        String pokeName = (input.nextLine());

        System.out.print("Enter hit points: ");
        int pokeHitPoints = Integer.parseInt (input.nextLine());

        System.out.print("Enter move: ");
        String pokeMove = (input.nextLine());

        System.out.print("Enter move power: ");
        int pokeMovePower = Integer.parseInt (input.nextLine());

        System.out.print("Enter attack speed: ");
        int pokeAttackSpeed = Integer.parseInt (input.nextLine());

        return new Pokemon(pokeName,pokeHitPoints,pokeMove,pokeMovePower,pokeAttackSpeed);
    }
    public void assignPokemon(){
        System.out.println("Player 1: Select Pokemon and enter its stats");
        Pokemon pokemonOne = createPokemon();


        System.out.println("Player 2: Select Pokemon and enter its stats");
        Pokemon pokemonTwo = createPokemon();

        System.out.println("PLAYER 1 POKEMON");
        System.out.println("________________");
        pokemonOne.displayPokemonStats();

        System.out.println("PLAYER 2 POKEMON");
        System.out.println("________________");
        pokemonTwo.displayPokemonStats();

    }


}
