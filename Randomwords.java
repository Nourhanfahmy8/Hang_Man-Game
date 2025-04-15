import java.util.Random;

// Random words class
public class Randomwords {
    // random words based from categories and difficulties combined in an array
    private static final String Word[] = {"frog","titanic","frozen","avatar","bread","giraffe","kangaroo","Thailand","jurassic",
            "pancake","madagascar","Tiramisu","Croissant"};

    // Different words stored in different arrays based on category
    private static final String Animals[] = {"cat","dog","lizard","cow","elephant","giraffe","kangaroo","penguin",
            "tiger","lion","zebra","dolphin","shark","bird","fish"};

    private static final String Colours[] ={"red", "blue", "green", "yellow", "orange", "purple", "pink", "black", "white", "brown"};

    private static final String Countries[] = {"usa", "canada", "brazil", "japan", "australia", "france", "germany", "india", "china", "italy"};

    private static final String Sport[] = {"soccer", "basketball", "tennis", "cricket", "volleyball", "baseball", "hockey", "golf", "rugby", "swimming"};

    private static final String Food[] = {"pizza", "burger", "sushi", "pasta", "salad", "sandwich", "taco", "curry", "noodles", "soup"};

    // words based on difficulty
    private static final String Easy[] = {"apple","hello","cat","banana","egg","pizza","cheese","butter","moon","spoon","kiwi",
            "book","pen"};

    private static final String Medium[] = {"raccoon","strawberry","coconut","maroon","waffle","muffin","brownie",
            "scooter","notebook","homework","student","sphere","jazz"};

    private static final String difficult[]={"thanksgiving","excellent","birthday","rectangle","pomegranate","chimpanzee","rhinoceros",
            "passionfruit","cantaloupe","turquoise","gnocchi","excavator","chalkboard","meadow","suspenders","chandelier","hammock",
            "paragliding","lacrosse","astronomer","veterinarian","avalanche","cyclone"};

    private Random rand = new Random();

    // default constructor
    public Randomwords() {
        rand  = new Random();
    }

    // getters for the categories according to the preference of the user
    public String getAnimals() {
        return Animals[rand.nextInt(Animals.length)];
    }
    public String getColours() {
        return Colours[rand.nextInt(Colours.length)];
    }

    public String getCountries() {
        return Countries[rand.nextInt(Countries.length)];
    }

    public String getSport() {
        return Sport[rand.nextInt(Sport.length)];
    }
    public String getFood() {
        return Food[rand.nextInt(Food.length)];
    }

    // getters for the difficulties
    public String getEasy() {
        return Easy[rand.nextInt(Easy.length)];
    }

    public String getMedium() {
        return Medium[rand.nextInt(Medium.length)];
    }

    public String getdifficult() {
        return difficult[rand.nextInt(difficult.length)];
    }

    public String getWord(){
        return Word[rand.nextInt(Word.length)];
    }
}
