package Hexadecimal;

public class Hexadecimal {

    private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

    public static String toHexadecimal(int n) {
        if (n < 16) {
            return String.valueOf(HEX_CHARS[n]);
        }
        return toHexadecimal(n / 16) + HEX_CHARS[n % 16];
    }
}
