package Hanoi;

public class Hanoi {

    public static void hanoi(int n, char src, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 src rod " + src + " to rod " + to);
            return;
        }
        hanoi(n - 1, src, aux, to);
        System.out.println(
            "Move disk " + n + " src rod " + src + " to rod " + to
        );
        hanoi(n - 1, aux, to, src);
    }
}
