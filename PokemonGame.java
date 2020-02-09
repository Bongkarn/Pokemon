import java.io.*;
import java.util.Scanner;

public class PokemonGame {

    public static void main(String[] arg) {
        
        int pkTrain;
        int err = 0;

        Scanner scanner = new Scanner(System.in);
        Pokemon pokemon = new Pokemon();
        System.out.println("Welcom to the world of Pokemon!");

        do{
            System.out.println("You can have one.Go on, choose!");
            System.out.println("1. Pokemon Name: \"Bulbasaur\" \tElement : \"Grass/Poison\" ");
            System.out.println("2. Pokemon Name: \"Squirtle\" \tElement : \"Water\" ");
            System.out.println("3. Pokemon Name: \"Charmander\" \tElement : \"Fire\" ");
            pkTrain = scanner.nextInt();

            if(pkTrain == 1){
                pokemon.Status1();
                err = 0;
            }
            else if(pkTrain == 2){
                pokemon.Status2();
                err = 0;
            }
            else if(pkTrain == 3){
                pokemon.Status3();
                err = 0;
            }
            else{
                System.out.println("Choose again!!");
                err++;
            }

        }while(err != 0 );

    }

}