import java.util.Scanner;

public class Animal {
    private static String userInput="";
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to see a cat or dog?");
        userInput = scan.next();

        if (userInput.equals("cat")) {
            System.out.println("Print ASCII cat here.");
        } else if (userInput.equals("dog")) {
            System.out.println("Print ASCII dog here");
        }
    }
}
