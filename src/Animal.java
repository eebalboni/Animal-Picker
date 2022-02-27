import java.util.Locale;
import java.util.Scanner;

public class Animal {
    private static String userInput="";
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to see a cat or dog?");
        userInput = scan.next();

        if (userInput.toLowerCase().equals("cat")) {
            System.out.println("Print ASCII cat here.");
        } else if (userInput.toLowerCase().equals("dog")) {
            System.out.println("Print ASCII dog here");
        }else{
            System.out.println("Error: Incorrect user input.");
        }
    }
}
