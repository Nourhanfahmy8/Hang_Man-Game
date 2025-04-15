/* Name: Nourhan Mohammed Ahmed Fahmy
   ID: 20230560
   Program description: Hangman Game, where the player has to try and guss the characters of the random word before
                        the body parts of the hangman are completed
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------");
        System.out.println("~~~ Welcome to the HANGMAN game ~~~");
        System.out.println("--------------------------------------");

        while (true) {


            // call default constructor of the class game track by making an object of that class
            Gametrack gametrack = new Gametrack();

            // call the constructor of player class by making an object of that class
            Playerinput input = new Playerinput(gametrack);

            // call the hangman class to display the hangman after each move by making an object of that class
            Hangmanfigure display = new Hangmanfigure();

            // get the random word by making an object of that class
            Randomwords rand = new Randomwords();

            // object of scanner for taking input
            Scanner in = new Scanner(System.in);

            // variables of the choices input by the player
            int choice, category, difficulty;

            System.out.println("\n-> Please choose the mode you want: ");

            // validation check on the input mode
            while (true) {
                System.out.println(
                        "   1. Play according to Category\n" +
                                "   2. Play according to level of difficulty \n" +
                                "   3. Play Randomly (it combines both levels)\n" +
                                "   4. Display Game instructions\n" +
                                "   5. Exit!!");

                try {
                    choice = in.nextInt();
                    if (choice == 1) {
                        break;
                    } else if (choice == 2) {
                        break;
                    }else if(choice == 3){
                        break;
                    } else if (choice == 4) {
                        System.out.println("\n-------------------------------->");
                        System.out.println("*** GAME EXPLANATION ***\n" +
                                " - The hang man game is a stick figure game.\n - Where you have an unknown word and you have to try and guess it" +
                                " before the hangman figure is completed.\n - Every wrong guess completes a part of the hangman's body(head/hand/leg)\n" +
                                " - Before starting you will choose either choose the difficulty of the word or the category" +
                                " - Have fun while playing :)");

                        System.out.println("-------------------------------->\n");
                        System.out.println("-> Which mode would you like?");
                    }
                    else if(choice == 5){
                        System.out.println("\n~~ Thank you for playing!!:) \n");
                        return;
                    }
                    else if(choice <1 || choice > 5){
                        System.out.println("\n!! Please input a valid choice !!\n"+
                                "\n-> Which mode would you like?");
                    }
                } catch (Exception e) {
                    System.out.println("\n !! Please choose a valid mode !!\n" +
                            "\n-> Which mode would you like?");
                    in.next();
                }
            }

            // storing the random word which is the default game mode
            String W = rand.getWord();

            // play according to category
            if (choice == 1) {
                // category
                System.out.println("\n-> Now choose which category would you like\n" +
                        "  1. Animals\n" +
                        "  2. Colours\n" +
                        "  3. Countries\n" +
                        "  4. Sport\n" +
                        "  5. Food");
                while (true) {
                    try {
                        category = in.nextInt();
                        if (category == 1) {
                            // animals
                            W = rand.getAnimals();
                            break;
                        } else if (category == 2) {
                            // colours
                            W = rand.getColours();
                            break;

                        } else if (category == 3) {
                            // countries
                            W = rand.getCountries();
                            break;

                        } else if (category == 4) {
                            // sport
                            W = rand.getSport();
                            break;

                        } else if (category == 5) {
                            // food
                            W = rand.getFood();
                            break;

                        } else if (category < 1 || category > 5) {
                            System.out.println(" !!Please choose a valid category!!");
                        }
                    } catch (Exception e) {
                        System.out.println(" !!Please choose a valid categoryy!!");
                        in.next();
                    }
                }

                // play according to level of difficulty
            } else if (choice == 2) {
                System.out.println("-> Which level would you like to play?\n" +
                        "  1. Easy\n  2. Medium\n  3. Hard");
                while (true) {
                    try {
                        difficulty = in.nextInt();
                        if (difficulty == 1) {
                            // easy
                            W = rand.getEasy();
                            break;
                        } else if (difficulty == 2) {
                            // medium
                            W = rand.getMedium();
                            break;
                        } else if (difficulty == 3) {
                            // hard
                            W = rand.getdifficult();
                            break;
                        }
                        else if(difficulty<1 || difficulty >3){
                            System.out.println(" !!Please enter a valid choicee!!!");
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println(" !!Please choose a valid difficulty!!");
                        in.next();
                    }
                }
            }

            // play randomly
            else if(choice == 3){
                W = rand.getWord();
            }

            Gametrack tracking = new Gametrack(W);

            while (!tracking.isover()) {

                // display the hangman after each round
                display.displayhangman(tracking.getFalseinputcount());
                // updating the game with every input character
                System.out.println(tracking.Updategame());
                // displaying the wrong guessed character for the player to keep count of what he guessed wrong
                System.out.println("The wrong guessed characters: " + tracking.getwrongguessed());
                // getting the input from the player
                tracking.updateword(input.getinput());

            }

            // checking if the player lost and couldn't guess the word
            if (tracking.lose()) {

                display.displayhangman(tracking.getFalseinputcount());
                System.out.println("------------------------------------------");
                System.out.println(" --> OOOOPS!! You lost the gamee <--");
                // Displaying the actual word
                System.out.println("--> The actual word was " + " '" + W + "' ");
                System.out.println("------------------------------------------");

                // the player won
            } else if (tracking.iswin()) {

                // displaying the hangman after the last round
                display.displayhangman(tracking.getFalseinputcount());
                System.out.println("******************************");
                System.out.println(" HOORAYYY!! You won the game!!");
                System.out.println("******************************\n");

            }

        }
    }
}
