package numbers;

public class Gapful {
    public static boolean gapful(long num) {
        String str = String.valueOf(num);
        if (str.length() < 3) return false;
        else  {
            String numStr = "" + str.charAt(0) + str.charAt(str.length() - 1);
            int numGap = Integer.parseInt(numStr);
            if(num % numGap == 0) return true;
            else return false;
        }
    }
}
