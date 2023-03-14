import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {58, 46, 301, 85, 96, 8, 555, 123, 999};
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}