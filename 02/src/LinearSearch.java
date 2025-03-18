public class LinearSearch {

    public static int buscar(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 11, 13, 17 };

        System.out.println(buscar(arr, 11));
        System.out.println(buscar(arr, 4));
        System.out.println(buscar(arr, 2));
        System.out.println(buscar(arr, 17));
        System.out.println(buscar(arr, 20));
    }
}
