package hammurabi;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        new Hammurabi().playGame();
    }

    void playGame() {
        // declare local variables here: grain, population, etc.
        // statements go after the declarations
        int price;
        int bushels;
        int acresOwned;
        int population;
        int bushelsFedToPeople;
        int howManyPeopleStarved;
        int grainStorage;
        int bushelUsedAsSeed;
        int year;
    }

    //Methods to be used in the playGame method
    int askHowManyAcresToBuy(int price, int bushels){
        return 0;
    }

    int askHowManyAcresToSell(int acresOwned){
        return 0;
    }

    int askHowMuchGrainToFeedPeople(int bushels){
        return 0;
    }

    int askHowManyAcresToPlant(int acresOwned, int population, int bushels){
        return 0;
    }
    int plagueDeaths(int population){
        return 0;
    }
    int starvationDeaths(int population, int bushelsFedToPeople){
        return 0;
    }
    boolean uprising(int population, int howManyPeopleStarved){
        return false;
    }
    int immigrants(int population, int acresOwned, int grainInStorage){
        return 0;
    }
    int harvest(int acres, int bushelsUsedAsSeed){
        return 0;
    }
    int grainEatenByRats(int bushels){
        return 0;
    }
    int newCostOfLand(){
        return 0;
    }
    void printSummary(){

    }
    void finalSummary(){

    }

    /**
     * Prints the given message (which should ask the user for some integral
     * quantity), and returns the number entered by the user. If the user's
     * response isn't an integer, the question is repeated until the user
     * does give an integer response.
     *
     * @param message The request to present to the user.
     * @return The user's numeric response.
     */
    int getNumber(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\"" + scanner.next() + "\" isn't a number!");
            }
        }
    }

}