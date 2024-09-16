package numbers;

public class Spy {
    public static boolean spy(long num) {
        String arr = String.valueOf(num);
        long sum = 0;
        long product = 1;
        for (int i = 0; i < arr.length(); i++) {
            sum += Character.getNumericValue(arr.charAt(i));
            product *= Character.getNumericValue(arr.charAt(i));
        }
        if (sum == product) return true;
        else return false;
    }
}
