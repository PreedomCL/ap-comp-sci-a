import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class U8Lab11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab11Data.dat"));
        while(scanner.hasNextLine()) {
            System.out.println(toMorse(scanner.nextLine()));
        }
    }

    public static String toMorse(String character) {
        return switch (character.toLowerCase(Locale.ROOT)) {
            case "a" -> character + " is .- in morse code";
            case "b" -> character + " is -... in morse code";
            case "c" -> character + " is -.-. in morse code";
            case "d" -> character + " is -.. in morse code";
            case "e" -> character + " is . in morse code";
            case "f" -> character + " is ..-. in morse code";
            case "g" -> character + " is --. in morse code";
            case "h" -> character + " is .... in morse code";
            case "i" -> character + " is .. in morse code";
            case "j" -> character + " is .--- in morse code";
            case "k" -> character + " is -.- in morse code";
            case "l" -> character + " is .-.. in morse code";
            case "m" -> character + " is -- in morse code";
            case "n" -> character + " is -. in morse code";
            case "o" -> character + " is --- in morse code";
            case "p" -> character + " is .--. in morse code";
            case "q" -> character + " is --.- in morse code";
            case "r" -> character + " is .-. in morse code";
            case "s" -> character + " is ... in morse code";
            case "t" -> character + " is - in morse code";
            case "u" -> character + " is ..- in morse code";
            case "v" -> character + " is ...- in morse code";
            case "w" -> character + " is .-- in morse code";
            case "x" -> character + " is -..- in morse code";
            case "y" -> character + " is -.-- in morse code";
            case "z" -> character + " is --.. in morse code";
            case "1" -> character + " is .---- in morse code";
            case "2" -> character + " is ..--- in morse code";
            case "3" -> character + " is ...-- in morse code";
            case "4" -> character + " is ....- in morse code";
            case "5" -> character + " is ..... in morse code";
            case "6" -> character + " is -.... in morse code";
            case "7" -> character + " is --... in morse code";
            case "8" -> character + " is ---.. in morse code";
            case "9" -> character + " is ----. in morse code";
            case "0" -> character + " is ----- in morse code";
            default -> character + " is not in library!";
        };
    }
}
