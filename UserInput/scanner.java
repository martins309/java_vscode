import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner class allows you to read user input
        //system.in allows you to input into the console which is returned to the program
        //new means that you are creating an instance of an object

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); //checks to see if the next input entered is a number

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");

            }else{
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}
