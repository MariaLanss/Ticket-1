import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {58, 46, 301, 85, 96, 8, 555, 123, 999};
        int[] reversedNumbers = new int[numbers.length];
        int count = 0;
        for (int i = numbers.length-1; i >= 0; i--) {
            reversedNumbers[count] = numbers[i];
            count++;
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}