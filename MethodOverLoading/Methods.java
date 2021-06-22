public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calculateFeetAndInchesToCentimeters(7,5);
        calculateFeetAndInchesToCentimeter(156);

        double centimeterConversion = calculateFeetAndInchesToCentimeters(7,5);
        double inchesConversion = calculateFeetAndInchesToCentimeter(6);
        System.out.println("This is the conversion for " + centimeterConversion );
        System.out.println("This is just for the inches " + inchesConversion);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore( int score) {
        System.out.println("Points scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, or points");
        return 0;
    }


    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid parameters inches or feet");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }
    //you can use the same method with different parameters
    public static double calculateFeetAndInchesToCentimeter(int inches) {
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches );
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
