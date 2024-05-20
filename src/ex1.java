import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int result1 = multiply(2, 6);
        System.out.println("1.1 result: " + result1);

        String result2 = stringAndNumber("this is a text", 7);
        System.out.println("1.2 result: " + result2);

        String[] array = {"1", "2", "3", "4", "5"};
        String[] newArray = modifyArray(array);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("1.3 result: " + newArray[i]);
        }
        }


        public static int multiply(int x, int y) {
            return x * y;
        }
        public static String stringAndNumber(String str, int num) {
            return str + " " + num;
        }
    public static String[] modifyArray(String[] array) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = "6";

        for (int i = newArray.length - 1; i > 2; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[2] = "6";

        return newArray;
    }
}
