//create a method called getDurationString with two parameters
//the first parameter is minutes and the second one is seconds both are ints
//validate that the first parameter is greater or equal to 0
//validate that the 2nd parameter seconds is >=0 and <= 59
//the methods should return "invalid value" in the method if either of the above are not true
//if valid, calculate how many hours minutes and seconds equals the minutes and seconds passed to this method
//return that value as a string in the format of "XXh YYm ZZs"

//create a second method of the same name but with one parameter
//validate that it is >= 0 return invalid value if it is not true
//if it is valid, then calculate how many minutes are in the seconds value and then call
// the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly
//call both methods to print to the console.

//tips: use int or long for types; 1 hour = 3600 seconds; static methods;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        }

    public static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid value";
        }

        long minutes = seconds / 60;
        //calculates how many seconds that cant fit into 1 minute i.e. 61 seconds is 1 minute one second
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}
