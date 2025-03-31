package GrayCode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public static List<String> generateGrayCode(int n) {
        if (n == 0) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        List<String> prevGrayCode = generateGrayCode(n - 1);
        List<String> grayCode = new ArrayList<>();

        for (String code : prevGrayCode) {
            grayCode.add("0" + code);
        }

        for (int i = prevGrayCode.size() - 1; i >= 0; i--) {
            grayCode.add("1" + prevGrayCode.get(i));
        }

        return grayCode;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> grayCodes = generateGrayCode(n);
        System.out.println("Gray Code for n = " + n + ":");
        for (String code : grayCodes) {
            System.out.println(code);
        }
    }
}
