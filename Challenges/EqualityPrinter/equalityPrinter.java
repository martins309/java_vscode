public class IntEqualityPrinter {
    public static void main(String[] args) {
        EqualityPrinter(1,1,2);
    }
    public static void EqualityPrinter(int x, int y, int z){
        if((x < 0) || (y < 0) || (z < 0)){
            System.out.println("Invalid Value");
        } else if ((x == y) && (y == z)){
            System.out.println("All numbers are equal");
        } else if((x != y) && (x != z) && (y != z)){
            System.out.println("All number are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
