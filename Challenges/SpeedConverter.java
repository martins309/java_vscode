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
