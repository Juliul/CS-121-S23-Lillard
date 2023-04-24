package Project1;
import java.util.Random;
import java.util.Scanner;
public class PokemonBattle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int wins1 = 0, wins2 = 0, rnd = 0, rounds, HP1, power1, speed1, HP2, power2, speed2;
        System.out.println("POKEMON BATTLE");
        System.out.println("Enter the odd number of rounds:");
        rounds = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= rounds; i++) {

            rnd++;
            System.out.println("\nRound " + rnd + "\n--------");

            //Player 1
            System.out.println("Player 1: Select a pokemon and enter its stats");
            System.out.println("Enter name:");
            String Pokemon1 = input.nextLine();
            System.out.println("Enter HP:");
            HP1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter move:");
            String move1 = input.nextLine();
            System.out.println("Enter move's power:");
            power1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter attack speed:");
            speed1 = Integer.parseInt(input.nextLine());

            //Player 2
            System.out.println("\nPlayer 2: Select a pokemon and enter its stats");
            System.out.println("Enter name:");
            String Pokemon2 = input.nextLine();
            System.out.println("Enter HP:");
            HP2 = Integer.parseInt(input.nextLine());
            System.out.println("Enter move:");
            String move2 = input.nextLine();
            System.out.println("Enter move's power:");
            power2 = Integer.parseInt(input.nextLine());
            System.out.println("Enter attack speed:");
            speed2 = Integer.parseInt(input.nextLine());

            while(true){
                if (speed1 == speed2){
                    int num = random.nextInt(2);
                    if (num == 1){
                        speed1 ++;
                    } else{
                        speed2 ++;
                    }
                }
                if (speed1 > speed2){
                    System.out.println("\nPlayer 1's turn");
                    System.out.println(Pokemon1 + " uses " + move1);
                    HP2 = HP2 - power1;
                    if (HP2 <= 0){
                        System.out.println("Player 1's " + Pokemon1 + " wins this round!");
                        wins1++;
                        break;}
                    System.out.println("\nPlayer 2's turn");
                    System.out.println(Pokemon2 + " uses " + move2);
                    HP1 = HP1 - power2;
                    if (HP1 <= 0){
                        System.out.println("Player 2's " + Pokemon2 + " wins this round!");
                        wins2++;
                        break;}
                }
                else{
                    System.out.println("\nPlayer 2's turn");
                    System.out.println(Pokemon2 + " uses " + move2);
                    HP1 = HP1 - power2;
                    if (HP1 <= 0){
                        System.out.println("Player 2's " + Pokemon2 + " wins this round!");
                        wins2++;
                        break;}
                    System.out.println("\nPlayer 1's turn");
                    System.out.println(Pokemon1 + " uses " + move1);
                    HP2 = HP2 - power1;
                    if (HP2 <= 0){
                        System.out.println("Player 1's " + Pokemon1 + " wins this round!");
                        wins1++;
                        break;}
                }

            }
            if (i != rounds){
            System.out.println("\nWins\n____");
            System.out.println("Player 1: " + wins1);
            System.out.println("Player 2: " + wins2);
            }else {
                if (wins1 > wins2) {
                    System.out.println("\nFinal Scores\n____________");
                    System.out.println("Player 1: " + wins1);
                    System.out.println("Player 2: " + wins2);
                    System.out.println("\nPlayer 1 wins the game!");
                } else{
                    System.out.println("\nFinal Scores\n____________");
                    System.out.println("Player 1: " + wins1);
                    System.out.println("Player 2: " + wins2);
                    System.out.println("\nPlayer 2 wins the game!");
                }
            }
        }
    }
}
