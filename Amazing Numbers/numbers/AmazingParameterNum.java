package numbers;

import bazzNumbers.Bazz;
import bazzNumbers.OddOrEven;
import duckNumbers.Duck;

public class AmazingParameterNum {
    public static void amazingParameterNum(String input) {
        String[] arr = input.split(" ");
        long firstNum = Long.parseLong(arr[0]);
        int second = Integer.parseInt(arr[1]);

        if (arr.length == 2) ParameterNum.parameterNum(firstNum, second);
        else if (arr.length == 3) {
            amazingNum(arr[2].toUpperCase(), firstNum, second);
        } else {
            SeveralProperties.severalProperties(firstNum, second, arr );
        }
    }

    public static void amazingNum(String str, long first, int second) {

        switch (str) {
            case "BUZZ":
                while (second != 0) {
                    if (Bazz.buzz(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "DUCK":
                while (second != 0) {
                    if (Duck.duck(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "PALINDROMIC":
                while (second != 0) {
                    if (Palindromic.palindromic(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "GAPFUL":
                while (second != 0) {
                    if (Gapful.gapful(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "SPY":
                while (second != 0) {
                    if (Spy.spy(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "SQUARE":
                while (second != 0) {
                    if (SquareAndSunny.square(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "SUNNY":
                while (second != 0) {
                    if (SquareAndSunny.sunny(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "JUMPING":
                while (second != 0) {
                    if (Jumping.jumping(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "HAPPY":
            case "-SAD":
                while (second != 0) {
                    if (HappySad.happySad(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "SAD":
            case "-HAPPY":
                while (second != 0) {
                    if (!HappySad.happySad(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "EVEN":
            case "-ODD":
                while (second != 0) {
                    if (OddOrEven.oddOrEven(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "ODD":
            case "-EVEN":
                while (second != 0) {
                    if (!OddOrEven.oddOrEven(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-BUZZ":
                while (second != 0) {
                    if (!Bazz.buzz(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-DUCK":
                while (second != 0) {
                    if (!Duck.duck(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-PALINDROMIC":
                while (second != 0) {
                    if (!Palindromic.palindromic(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-GAPFUL":
                while (second != 0) {
                    if (!Gapful.gapful(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-SPY":
                while (second != 0) {
                    if (!Spy.spy(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-SQUARE":
                while (second != 0) {
                    if (!SquareAndSunny.square(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-SUNNY":
                while (second != 0) {
                    if (!SquareAndSunny.sunny(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            case "-JUMPING":
                while (second != 0) {
                    if (!Jumping.jumping(first)) {
                        printNum(first);
                        second--;
                    }
                    first++;
                }
                break;
            default:
                System.out.printf("""
                        The property [%s] is wrong.
                        Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]
                        """, str.toUpperCase());
        }
    }
    public static void printNum(long first) {
        System.out.printf("%d is %s\n", first, ParameterNum.numbers(first));
    }
}

