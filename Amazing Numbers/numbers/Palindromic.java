package numbers;

public class Palindromic {
    public static boolean palindromic(long num) {
        String numStr = String.valueOf(num);
        StringBuilder str = new StringBuilder(String.valueOf(num));
        StringBuilder str2 =  new StringBuilder(str.reverse());
        if (numStr.equals(str2.toString())) return true;
        else {
            return false;
        }
    }
}
