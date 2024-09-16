package numbers;

public class Jumping {
    public static boolean jumping(long num) {
        String str = Long.toString(num);
        if (str.length() == 1) return true;
        else return jumpLoop(str);
    }
    public static boolean jumpLoop(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            int a = Character.getNumericValue(str.charAt(i));
            int b = Character.getNumericValue(str.charAt(i + 1));
            if (a != (b + 1) && a != (b - 1)) return false;
        }
        return true;
    }
}
