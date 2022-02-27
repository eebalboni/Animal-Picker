import java.util.Locale;
import java.util.Scanner;

public class Animal {
    private static String userInput = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to see a cat or dog or fish?");
        userInput = scan.next();
        do {
            if (userInput.toLowerCase().equals("cat")) {
                System.out.println(" |\\__/,|   (`\\\n |_ _  |.--.) )\n ( T   )     /\n(((^_(((/(((_/");
            } else if (userInput.toLowerCase().equals("dog")) {
                System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
            }else if(userInput.toLowerCase().equals("fish")){
                System.out.println("     o                 o\n                  o\n         o   ______      o\n           _/  (   \\_\n _       _/  (       \\_  O\n| \\_   _/  (   (    0  \\\n|== \\_/  (   (          |\n|=== _ (   (   (        |\n|==_/ \\_ (   (          |\n|_/     \\_ (   (    \\__/\n          \\_ (      _/\n            |  |___/\n           /__/");
            } else{
                System.out.println("Error: incorrect user input. Would you like to see a cat or dog?");
                userInput = scan.next();
                if (userInput.toLowerCase().equals("cat")) {
                    System.out.println(" |\\__/,|   (`\\\n |_ _  |.--.) )\n ( T   )     /\n(((^_(((/(((_/");
                } else if (userInput.toLowerCase().equals("dog")) {
                    System.out.println("            __\n(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
                }else if(userInput.toLowerCase().equals("fish")){
                    System.out.println("     o                 o\n                  o\n         o   ______      o\n           _/  (   \\_\n _       _/  (       \\_  O\n| \\_   _/  (   (    0  \\\n|== \\_/  (   (          |\n|=== _ (   (   (        |\n|==_/ \\_ (   (          |\n|_/     \\_ (   (    \\__/\n          \\_ (      _/\n            |  |___/\n           /__/");
                }
            }
        } while (!userInput.toLowerCase().equals("cat") && !userInput.toLowerCase().equals("dog")&& !userInput.toLowerCase().equals("fish")) ;

    }
}
