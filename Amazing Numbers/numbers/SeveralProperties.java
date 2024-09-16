package numbers;

import bazzNumbers.NaturalNumber;
import java.util.*;
public class SeveralProperties {
    public static void severalProperties(long first, int second, String[] arrStr ) {
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arrStr).subList(2, arrStr.length));

        if (!inputValidation(first, second, arrList)) {
            while (second != 0) {
                ArrayList<String> arr = ParameterNum.numbers(first);

                if (containsParameter(arr, arrList)) {
                    System.out.printf("%d is %s\n", first, String.join(", ", arr));
                    second--;
                }
                first++;
            }
        }
    }
    public static boolean containsParameter(ArrayList<String> arr, ArrayList<String> arrList) {
        for (String s : arrList) {
            if (s.charAt(0) == '-') {
                String c = s.substring(1);
                if (arr.contains(c.toLowerCase())) return false;
            } else if (!arr.contains(s.toLowerCase())) return false;
        }
        return true;
    }
    public static boolean exclusiveProperties(ArrayList<String> arr) {
        String[] arrOne = {"EVEN", "DUCK", "SUNNY", "ODD", "SPY", "SQUARE", "HAPPY", "SAD",
                "EVEN", "DUCK", "SUNNY", "ODD", "SPY", "SQUARE", "HAPPY", "SAD",
                "-EVEN", "-DUCK", "-SUNNY", "-ODD", "-SPY", "-SQUARE", "-HAPPY", "-SAD"};
        String[] arrTwo = {"ODD", "SPY", "SQUARE", "EVEN", "DUCK", "SUNNY", "SAD", "HAPPY",
                "-EVEN", "-DUCK", "-SUNNY", "-ODD", "-SPY", "-SQUARE", "-HAPPY", "-SAD",
                "-ODD", "-SPY", "-SQUARE", "-EVEN", "-DUCK", "-SUNNY", "-SAD", "-HAPPY"};
        for (int i = 0; i < arrOne.length; i++) {
            if (arr.contains(arrOne[i]) && arr.contains(arrTwo[i])) {
                System.out.printf("""
                        The request contains mutually exclusive properties: [%s, %s]
                        There are no numbers with these properties.
                        """, arrOne[i], arrTwo[i]);
                return true;
            }
        }
        return false;
    }
    public static boolean wrongProperties(ArrayList<String> arr) {
        List<String> arrList = Arrays.asList("EVEN", "ODD", "BUZZ", "DUCK", "PALINDROMIC", "GAPFUL",
                "SPY", "SQUARE", "SUNNY", "JUMPING", "HAPPY", "SAD", "-EVEN", "-ODD", "-BUZZ", "-DUCK",
                "-PALINDROMIC", "-GAPFUL", "-SPY", "-SQUARE", "-SUNNY", "-JUMPING", "-HAPPY", "-SAD");
        ArrayList<String> str = new ArrayList<>();
        for (String s : arr) {
            if (!arrList.contains(s)) {
                str.add(s);
            }
        }
        if (str.isEmpty()) return false;
        else if (str.size() > 1) {
            System.out.printf("The properties [%s] are wrong.\n" +
                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL," +
                    " SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]\n", String.join(", ", str));
            return true;
        } else {
            System.out.printf("The property [%s] is wrong.\n" +
                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL," +
                    " SPY, SQUARE, SUNNY, JUMPING, HAPPY, SAD]\n", str);
            return true;
        }
    }
    public static boolean inputValidation(long first, int second, ArrayList<String> arr) {
        if (wrongProperties(arr)) {
            return true;
        } else if (exclusiveProperties(arr)) {
            return true;
        } else if (NaturalNumber.naturalNum(first)) {
            System.out.println("The first parameter should be a natural number or zero.");
            return true;
        } else if (NaturalNumber.naturalNum(second)) {
            System.out.println("The second parameter should be a natural number.");
            return true;
        } else return false;
    }

    private static boolean checkForDuplicates(ArrayList<String> array) {

        Set<String> set = new HashSet<>();
        for (String e: array)
        {
            if (set.contains(e)) {
                return true;
            }
            if (e != null) {
                set.add(e);
            }
        }
        return false;
    }

}