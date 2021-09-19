package module;

public class CheckingNumber {

    public static int isPositiveNum(int number) {
        if (number > 0) {
            return 3;
        } else if (number == 0) {
            return 2;
        }
        return 1;
    }

    public static boolean isPositiveBoolean(int number) {
        return number > 0;
    }
}
