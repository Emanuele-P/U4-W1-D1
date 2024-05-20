public class ex3 {
    public static void main(String[] args) {
        double result = perimeter(10.3,15.5);
        System.out.println("Perimeter of the rectangle is: " + result);

        byte result2 = evenOdd(2);
        System.out.println("Even is 0, odd is 1. The selected number is: " + result2);

        double result3 = triangleArea(5, 10, 9);
        System.out.println("Triangle area: " + result3);
    }

    public static double perimeter(double x, double y) {
        return (x + y)*2;
    }
    public static byte evenOdd(int number) {
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static double triangleArea(int l1, int l2, int l3) {
        double s = (l1 + l2 + l3) / 2.0;
        return Math.sqrt( s * (s-l1) * (s-l2) * (s-l3));
    }
}
