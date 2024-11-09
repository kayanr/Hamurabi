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
        printSummary();
    }

    //Methods to be used in the playGame method
    int askHowManyAcresToBuy(int price, int bushels){
        int acresToBuyResponse = getNumber("How many acres to buy?: ");
        int bushelsNeeded = acresToBuyResponse * price;
        int i = (bushelsNeeded < bushels) ? acresToBuyResponse : 0;
        return i;
    }

    int askHowManyAcresToSell(int acresOwned){
        int acresToSellResponse = getNumber("How many acres to sell?: ");
        int i = (acresToSellResponse < acresOwned) ? acresToSellResponse : 0;
        return i;
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
        System.out.println("O great Hammurabi!\n" +
                "You are in year 1 of your ten year rule.\n" +
                "In the previous year 0 people starved to death.\n" +
                "In the previous year 5 people entered the kingdom.\n" +
                "The population is now 100.\n" +
                "We harvested 3000 bushels at 3 bushels per acre.\n" +
                "Rats destroyed 200 bushels, leaving 2800 bushels in storage.\n" +
                "The city owns 1000 acres of land.\n" +
                "Land is currently worth 19 bushels per acre.");
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

    public int harvest(int i) {
     return 0;}
}