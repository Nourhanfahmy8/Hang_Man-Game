import java.util.Scanner;

// class to take the input character from the player
public class Playerinput {

    private Scanner input;
    private Gametrack gametrack;

    // parameterized constructor
    public Playerinput(Gametrack gametrack) {
        this.input = new Scanner(System.in);
        this.gametrack = gametrack;
    }

    // getting the input from the player
    public char getinput() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please enter your guess: ");

        while(true) {
            String in = input.nextLine();

            // validation check to make sure the input is a single character and not an integer
            if(in.length() !=1){
                System.out.println("--> Invalid input, input should be a single character!!");
                continue;
            }

            char c = in.charAt(0);
            if(!Character.isLetter(c)) {
                System.out.println("--> Invalid, input should be a single character!!");
                continue;
            }

            // making the input character lowercase
            c = Character.toLowerCase(c);

            // checking if the input character has been chosen before
            if (gametrack.getallguessed().contains(c)) {
                System.out.println("--> You have chosen this character before!!\n--> Please choose a different one");
            }

            // else the display will be updated with the input character
            else {
                gametrack.updateword(c);
                return c;
            }

        }
    }
}
