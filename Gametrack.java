import java.util.HashSet;
import java.util.Set;

// Tracking the game
public class Gametrack {
    private int falseinputcount;
    private String word;
    private Set<Character> allguessedchars;
    private Set<Character> wrong_guessed;

    // default constructor
    public Gametrack() {
        this("default");
        this.wrong_guessed = new HashSet<>();
        this.allguessedchars = new HashSet<>();
        this.falseinputcount = 0;

    }

    // parameterized constructor that takes the random word that will be used
    public Gametrack(String word) {
        this.word = word;
        this.allguessedchars = new HashSet<>();
        this.wrong_guessed = new HashSet<>();
        this.falseinputcount = 0;
    }

    // checking whether the input character is in the word of the game or no
    public void updateword(char guessedchar) {
        allguessedchars.add(guessedchar);
        if (!word.contains(String.valueOf(guessedchar))){
            falseinputcount++;
            wrong_guessed.add(guessedchar);
        }
    }

    // checking if the player won
    public boolean iswin(){
        for(char c : word.toCharArray()){
            if(!allguessedchars.contains(c)){
                return false;
            }
        }
        return true;
    }

    // display the word after taking the input after each round
    public String Updategame(){
        StringBuilder gameline = new StringBuilder();
        for(char c : word.toCharArray()){
            if(allguessedchars.contains(c)){
                gameline.append(c);
            }
            else{
                gameline.append("_");
            }
            gameline.append(" ");
        }
        return gameline.toString();
    }

    // the player loses if he doesn't guess the word after 6 tries when the hangman figure is completed
    public boolean lose(){
        return falseinputcount >= 6;
    }

    // check if the game is over
    public boolean isover(){
        return iswin() || lose();
    }

    // getting the set that contains all the guessed characters input by the player
    public Set<Character> getallguessed() {
        return allguessedchars;
    }

    // getting the set that contains all the wrong characters input by the user
    public Set<Character> getwrongguessed() {
        return wrong_guessed;
    }

    // getting the count of the number of false inputs
    public int getFalseinputcount() {
        return falseinputcount;
    }

}
