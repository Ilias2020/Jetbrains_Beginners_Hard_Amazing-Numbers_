package duckNumbers;

public class Duck {
    public static boolean duck(long num) {
        String str = String.valueOf(num);
        if (str.contains("0")) {
            return true;
        } else {
            return false;
        }
    }
}
