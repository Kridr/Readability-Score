import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Gnome sort
    public static void sort(int[] numbers) {
        int i = 1;
        int j = 1;

        while (i < numbers.length) {
            if (numbers[i - 1] < numbers[i]) {
                i = j;
                j++;
            } else {
                int temp = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = temp;
                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}