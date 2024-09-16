package numbers;

public class SquareAndSunny {
    public static boolean square(long num) {
        int numSqrt = (int) Math.sqrt(num);
        if (numSqrt * numSqrt == num) return true;
        else return false;
    }

    public static boolean sunny(long num) {
        num++;
        return square(num);
    }
}
