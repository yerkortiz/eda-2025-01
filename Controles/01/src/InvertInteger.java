import java.lang.Math;

class InvertInteger {

    // iterative solution one
    static int invertInteger1(int N) {
        int result = 0;
        while (N != 0) {
            result = result * 10 + (N % 10);
            N = N / 10;
        }
        return result;
    }

    // iterative solution two
    static int invertInteger2(int N) {
        int result = 0;
        int auxArray[] = new int[(int) Math.log10(N) + 1];
        int i = 0;
        while (N != 0) {
            auxArray[i] = N % 10;
            N = N / 10;
            i++;
        }

        for (int j = 0; j < auxArray.length; j++) {
            result = result * 10 + auxArray[j];
        }
        return result;
    }

    // recursive solution
    static int invertInteger3(int N) {
        if (N == 0) {
            return 0;
        }
        return (
            (N % 10) * (int) Math.pow(10, (int) Math.log10(N)) +
            invertInteger3(N / 10)
        );
    }

    public static void main(String[] args) {
        System.out.println(invertInteger1(1234));
        System.out.println(invertInteger2(1234));
        System.out.println(invertInteger3(1234));
    }
}
