import java.util.Scanner;

public class DecimalToBinary {

    public static String decimalToBinary(int N) {
        String binario = String.valueOf(N % 2);

        while (N / 2 > 0) {
            N = N / 2;
            binario = (N % 2) + binario;
        }

        return binario;
    }

    public static void main(String[] args) {
        // System.out.println(decimalToBinary(255));

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(decimalToBinary(N));
        scan.close();
    }
}
