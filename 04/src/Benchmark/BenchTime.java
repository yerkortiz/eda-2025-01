class BenchTime {

    public static String decimalToBinary(int N) {
        String binario = String.valueOf(N % 2);

        while (N / 2 > 0) {
            N = N / 2;
            binario = (N % 2) + binario;
        }

        return binario;
    }

    public static boolean isPrime(int N) {
        if (N <= 1) return false;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 8;
        long startTime = System.nanoTime();
        String res = decimalToBinary(number);
        long endTime = System.nanoTime();
        long runningTime = endTime - startTime;

        System.out.println("Número decimal: " + number);
        System.out.println("Número binario: " + res);
        System.out.println(
            "Tiempo de ejecución: " + runningTime + " nanosegundos"
        );
        System.out.println(
            "Tiempo de ejecución: " + runningTime / 1000000.0 + " millisegundos"
        );
    }
}
