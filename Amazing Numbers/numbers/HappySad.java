package numbers;

public class HappySad {
    public static boolean happySad(long num) {
        String str = Long.toString(num);
        long sum = 0;
        long a = 0;
        while (true) {
            for (int i = 0; i < str.length(); i++) {
                a = Character.getNumericValue(str.charAt(i));
                sum += a * a;
            }
            if (sum == 1) return true;
            else if (sum == 4) return false;
            else if (sum == num) return false;
            str = Long.toString(sum);
            sum = 0;
            //System.out.println(str);
        }
    }
}
