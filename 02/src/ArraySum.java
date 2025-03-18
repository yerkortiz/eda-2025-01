public class ArraySum {

    static int[] sumaArreglos(int[] A, int[] B) {
        int n = Math.max(A.length, B.length);
        int[] C = new int[n + 1];

        int acarreo = 0;
        for (int i = 0; i < n; i++) {
            // caso borde cuando A es más largo que B o vice versa
            int digitoA = i < A.length ? A[A.length - 1 - i] : 0;
            int digitoB = i < B.length ? B[B.length - 1 - i] : 0;

            int suma = digitoA + digitoB + acarreo;

            C[n - i] = suma % 10;

            acarreo = suma / 10;
        }

        C[0] = acarreo;

        return C;
    }

    static int[] sumaArreglosMismoLargo(int[] A, int[] B) {
        int[] C = new int[A.length + 1];
        int carry = 0;
        for (int i = A.length - 1; i >= 0; --i) {
            C[i + 1] = (A[i] + B[i] + carry) % 10;
            carry = (A[i] + B[i] + carry) / 10;
        }
        C[0] = carry;
        return C;
    }

    static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A1 = { 1, 2, 3 };
        int[] B1 = { 4, 5, 6 };
        System.out.println("Caso 1: 123 + 456");
        imprimirArreglo(sumaArreglosMismoLargo(A1, B1));
    }
}
