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
        int price = 19;
        int bushels = 2800;
        int acresOwned = 1000;
        int population = 100;
        int bushelsFedToPeople;
        int howManyPeopleStarved = 0;
        int grainStorage;
        int bushelUsedAsSeed;
        int year = 1;

         do{
            printSummary(population, howManyPeopleStarved, year, acresOwned, price);
            int i = askHowManyAcresToBuy(price, bushels);
             acresOwned += i;
            int sell = 0;
            if(i == 0){
                sell = askHowManyAcresToSell(acresOwned);
                acresOwned -= sell;
            }
             price = newCostOfLand();
             year = year + 1;
        }   while(year <= 3);
    }

    //Methods to be used in the playGame method
    int askHowManyAcresToBuy(int price, int bushels){
        int acresToBuyResponse = 0;
        //int bushelsNeeded  = acresToBuyResponse * price;
        int maxAcresCanBuy = bushels / price;

        int i = 0;

        do{
            System.out.println("You can buy a maximum of "+ maxAcresCanBuy+ " acres!");
            acresToBuyResponse = getNumber("How many acres of land do you want to buy?: ");
            if(acresToBuyResponse == 0){
                return acresToBuyResponse;
            }
            if(acresToBuyResponse <= maxAcresCanBuy){
                return acresToBuyResponse;
            }
            System.out.println("O great Hammurabi! You jest! Please choose again!");
        } while(acresToBuyResponse > maxAcresCanBuy);

    return acresToBuyResponse;
    }

    int askHowManyAcresToSell(int acresOwned){
        int acresToSellResponse = 0;
        //int i = (acresToSellResponse < acresOwned) ? acresToSellResponse : 0;
        do{
            System.out.println("You can sell a maximum of "+ acresOwned+ " acres!");
            acresToSellResponse = getNumber("How many acres of land do you want to buy?: ");
            if(acresToSellResponse == 0){
                return acresToSellResponse;
            }
            if(acresToSellResponse <= acresOwned){
                return acresToSellResponse;
            }
            System.out.println("O great Hammurabi! You jest! Please choose again!");
        } while(acresToSellResponse > acresOwned);
        return acresToSellResponse;

    }

    int askHowMuchGrainToFeedPeople(int bushels){
        int grainToFeedPeopleResponse = getNumber("How much grain to feed people?: ");
        int i = (grainToFeedPeopleResponse < bushels) ? grainToFeedPeopleResponse : 0;
        return i;
    }

    int askHowManyAcresToPlant(int acresOwned, int population, int bushels){

        return 0;
    }
    public int plagueDeaths(int population){
        return 0;
    }
    public int starvationDeaths(int population, int bushelsFedToPeople){
        return 0;
    }
    public boolean uprising(int population, int howManyPeopleStarved){
        return false;
    }
    public int immigrants(int population, int acresOwned, int grainInStorage){
        return 0;
    }
    int harvest(int acres, int bushelsUsedAsSeed){
        return 0;
    }
    public int grainEatenByRats(int bushels){
        return 0;
    }

    public int newCostOfLand(){
        Random rand = new Random();
        int landCost =  rand.nextInt(7) + 17;
        return landCost;
    }

    void printSummary(int population, int howManyPeopleStarved, int year, int acresOwned, int price){
        System.out.println("*********************** YEAR "+ year+ " *************************************");
        System.out.println("O great Hammurabi!\n" +
                "You are in year "+ year+" of your ten year rule.\n" +
                "In the previous year "+howManyPeopleStarved+" people starved to death.\n" +
                "In the previous year " + 5+" people entered the kingdom.\n" +
                "The population is now "+ population +".\n" +
                "We harvested "+3000+" bushels at "+3+" bushels per acre.\n" +
                "Rats destroyed "+200 +" bushels, leaving "+ 2800+" bushels in storage.\n" +
                "The city owns "+ acresOwned+" acres of land.\n" +
                "Land is currently worth "+ price+" bushels per acre.");
        System.out.println("********************************************************");


    }
    void finalSummary(int population, int howManyPeopleStarved, int year, int acresOwned, int price){
        System.out.println("************************************* FINAL SUMMARY *************************************");
        System.out.println("O great Hammurabi!\n" +
                "You are in year "+ year+" of your ten year rule.\n" +
                "In the previous year "+howManyPeopleStarved+" people starved to death.\n" +
                "In the previous year " + 5+" people entered the kingdom.\n" +
                "The population is now "+ population +".\n" +
                "We harvested "+3000+" bushels at "+3+" bushels per acre.\n" +
                "Rats destroyed "+200 +" bushels, leaving "+ 2800+" bushels in storage.\n" +
                "The city owns "+ acresOwned+" acres of land.\n" +
                "Land is currently worth "+ price+" bushels per acre.");
        System.out.println("**************************************************************************");
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