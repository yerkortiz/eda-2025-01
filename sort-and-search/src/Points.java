import java.util.Arrays;

class Point {

    int x;
    int y;

    Point() {
        this.x = (int) (Math.random() * 10);
        this.y = (int) (Math.random() * 10);
    }

    static void printPoints(Point[] points) {
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static double distance(Point a) {
        return Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2));
    }

    public static void main(String[] args) {
        Point[] points = new Point[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }
        System.out.println("arreglo antes de ordenar");
        printPoints(points);
        System.out.println("arreglo después de ordenar");
        // sort points by x
        // Arrays.sort(points, (a, b) -> (a.x - b.x));
        // printPoints(points);
        // sort points by y
        // Arrays.sort(points, (a, b) -> a.y - b.y);
        // printPoints(points);
        // sort points by distance from origin
        Arrays.sort(points, (a, b) -> {
            double distanceA = distance(a);
            double distanceB = distance(b);
            return Double.compare(distanceA, distanceB);
        });
        // print points
        printPoints(points);
    }
}
