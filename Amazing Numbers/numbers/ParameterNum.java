package numbers;

import bazzNumbers.*;
import bazzNumbers.Bazz;
import bazzNumbers.NaturalNumber;
import duckNumbers.Duck;

import java.util.ArrayList;

public class ParameterNum {
    public static void parameterNum(long firstNum, int second) {

        if (NaturalNumber.naturalNum(firstNum)) {
            System.out.println("The first parameter should be a natural number or zero.");
        } else if (NaturalNumber.naturalNum(second)) {
            System.out.println("The second parameter should be a natural number.");
        } else {
            for (int i =0; i < second; i++) {
                System.out.printf("%d is %s\n", firstNum + i, String.join(", ", numbers(firstNum + i)));
            }
        }
    }
    public static ArrayList<String> numbers(long num) {
        ArrayList<String> arr = new ArrayList<>();
        if (Bazz.buzz(num)) arr.add("buzz");
        if (Duck.duck(num)) arr.add("duck");
        if (Palindromic.palindromic(num)) arr.add("palindromic");
        if (Gapful.gapful(num)) arr.add("gapful");
        if (Spy.spy(num)) arr.add("spy");
        if (SquareAndSunny.square(num)) arr.add("square");
        if (SquareAndSunny.sunny(num)) arr.add("sunny");
        if (Jumping.jumping(num)) arr.add("jumping");
        if (HappySad.happySad(num)) arr.add("happy");
        if (!HappySad.happySad(num)) arr.add("sad");
        if (OddOrEven.oddOrEven(num)) arr.add("even");
        if (!OddOrEven.oddOrEven(num)) arr.add("odd");
        return arr;
    }
}

