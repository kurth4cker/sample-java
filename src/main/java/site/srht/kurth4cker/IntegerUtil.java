package site.srht.kurth4cker;

public class IntegerUtil {
    private IntegerUtil() {}

    public static boolean isPowerOfTwo(int num) {
        if (num == 0) {
            return false;
        }
        num = Math.abs(num);
        return (num & (num - 1)) == 0;
    }
}
