import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] userInput = new String[3];

        System.out.println("Write the first word:");
        userInput[0] = scan.nextLine();
        System.out.println("Write the second word:");
        userInput[1] = scan.nextLine();
        System.out.println("Write the third word:");
        userInput[2] = scan.nextLine();

        words(userInput);
        scan.close();
    }

    public static void words(String[] userInput) {
        System.out.println(userInput[0] + " " + userInput[1] + " " + userInput[2] + " " +
                userInput[2] + " " + userInput[1] + " " + userInput[0]);
    }
}
