import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int result1 = multiply(2, 6);
        System.out.println("1.1 result: " + result1);

        String result2 = stringAndNumber("this is a text", 7);
        System.out.println("1.2 result: " + result2);

        String[] arr = insertIntoArray(new String[]{"1", "2", "3", "4", "5"}, "6");

        System.out.println(Arrays.toString(arr));
        }


        public static int multiply(int x, int y) {
            return x * y;
        }
        public static String stringAndNumber(String str, int num) {
            return str + " " + num;
        }
    public static String[] insertIntoArray(String[] stringArray, String str) {
        String[] array = new String[6];
        for (int i = 0; i < stringArray.length +1 ; i++) {
            if(i < 2) {
                array[i] = stringArray[i];
            } else if(i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }
}
