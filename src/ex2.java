import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = createScanner();

        System.out.println("Write three words:");
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();

        System.out.println(first + " " + second + " " + third);
        System.out.println(third + " " + second + " " + first);

        sc.close();
    }

    public static Scanner createScanner() {
        return new Scanner(System.in);
    }
}
