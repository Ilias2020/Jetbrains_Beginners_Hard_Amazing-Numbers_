package bazzNumbers;

public class Bazz {
    public static boolean buzz(long num) {
        String str = String.valueOf(num);
        if(str.charAt(str.length() - 1) == '7' && num % 7 == 0) {
            return true;
        } else if (str.charAt(str.length() - 1) == '7') {
            return true;
        } else if (num % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
