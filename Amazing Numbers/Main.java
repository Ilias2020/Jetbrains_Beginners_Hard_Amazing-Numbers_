
import bazzNumbers.*;
import duckNumbers.Duck;
import numbers.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printWelcome();

        while (true) {
            System.out.println("Enter a request:\n");
            String input = new Scanner(System.in).nextLine().toUpperCase();

            if(input.contains(" ")) {
                AmazingParameterNum.amazingParameterNum(input);
            } else {
                long num = Long.parseLong(input);
                if (num == 0) {
                    System.out.println("Goodbye!");
                    break;
                } else if (NaturalNumber.naturalNum(num)) {
                    System.out.println("The first parameter should be a natural number or zero.");
                } else {
                    printAmazingNumbers(num);
                }
            }
        }
    }
    public static void printAmazingNumbers(long num) {
        System.out.printf("Properties of %d\n", num);
        System.out.printf("        buzz: %b\n", Bazz.buzz(num));
        System.out.printf("        duck: %b\n", Duck.duck(num));
        System.out.printf(" palindromic: %b\n", Palindromic.palindromic(num));
        System.out.printf("      gapful: %b\n", Gapful.gapful(num));
        System.out.printf("         spy: %b\n", Spy.spy(num));
        System.out.printf("      square: %b\n", SquareAndSunny.square(num));
        System.out.printf("       sunny: %b\n", SquareAndSunny.sunny(num));
        System.out.printf("     jumping: %b\n", Jumping.jumping(num));
        System.out.printf("       happy: %b\n", HappySad.happySad(num));
        System.out.printf("         sad: %b\n", !HappySad.happySad(num));
        System.out.printf("        even: %b\n", OddOrEven.oddOrEven(num));
        System.out.printf("         odd: %b\n", !OddOrEven.oddOrEven(num));
    }
    public static void printWelcome() {
        System.out.println("""
                Welcome to Amazing Numbers!
                                
                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be processed;
                - two natural numbers and properties to search for;
                - a property preceded by minus must not be present in numbers;
                - separate the parameters with one space;
                - enter 0 to exit.
                """);
    }
}
