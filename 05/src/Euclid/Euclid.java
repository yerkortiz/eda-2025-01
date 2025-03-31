package Euclid;

public class Euclid {

    public static int gcd(int N, int M) {
        if (M == 0) {
            return N;
        }
        return gcd(M, N % M);
    }
}
