//write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name KiloBytes
//the method should not return anything(void) and it needs to calculate the megabytes and remaining kilobytes from the the kilobytes parameter
// print message "XX KB = YY MB and ZZ KB"
//XX represents the original value kiloBytes
//YY represents the calculated megaBytes
//ZZ represents the calculated remaining kilobytes
//if the parameter is less than 0 then print "Invalid Value"

public class MegaBytes {
    //spacing matters so beware..
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int modBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + modBytes + " KB");
        }
    }

}
