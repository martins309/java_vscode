//write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour
//This method needs to return the rounded value of the calculation of type long
// if the parameter kilometersPerHour is less than 0 then the method tMPH needs to return -1 to indicate invalid value
//Else if it positive calculate the value of miles per hour, round it and return it

//Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour
//THis method should not return anuthing(void) and it needs to calculate milesPerHour from the kilometersPerHour parameter
//it needs to print a message in the format "XX km/h = YY mi/h"
// XX = kPH
//YY = rounded mPH from kPH parameter


public class SpeedConverter {
    public static void main(String[] args) {
        public static long toMilesPerHour(double kilometersPerHour) {
            if(kilometersPerHour < 0) {
                return -1;
            }
            //you can return a calculation instead of creating a new variable
            return Math.round(kilometersPerHour/1.609);
        }
        public static void printConversion(double kilometerPerHour) {

            if(kilometerPerHour < 0) {
                System.out.println("Invalid Value");
            }else {
                long milesPerHour = toMilesPerHour(kilometerPerHour);
                System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
            }
        }
    }
}
