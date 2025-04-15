
// Hangman class to display the hangman figure
public class Hangmanfigure {

    // method to display the hangman after each round
    public void displayhangman(int falseinputcount){

        switch(falseinputcount){
            case 0:
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The number of wrong remaining tries are: 6");
                System.out.println(" +-----+ \n |     |\n |      \n |      \n |      \n =======\n");
                break;

            case 1:
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The number of wrong remaining tries are: 5");

                System.out.println(" +-----+ \n |     |\n |     O \n |      \n |      \n =======\n");
                break;

            case 2:
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The number of wrong remaining tries are: 4");

                System.out.println(" +-----+ \n |     |\n |     O \n |     | \n |      \n =======\n");
                break;

            case 3:
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The number of wrong remaining tries are: 3");

                System.out.println(" +-----+ \n |     |\n |     O \n |    /| \n |      \n =======\n");
                break;

            case 4:
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The number of wrong remaining tries are: 2");

                System.out.println(" +-----+ \n |     |\n |     O \n |    /|\\\n |      \n =======\n");
                break;

            case 5:
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The number of wrong remaining tries are: 1");

                System.out.println(" +-----+ \n |     |\n |     O \n |    /|\\ \n |    / \n =======\n");
                break;

            case 6:
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The number of wrong remaining tries are: 0");

                System.out.println(" +-----+ \n |     |\n |     O \n |    /|\\ \n |    / \\ \n =======\n");
                break;
        }
    }
}
