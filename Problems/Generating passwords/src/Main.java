import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int A = scanner.nextInt();
        final int B = scanner.nextInt();
        final int C = scanner.nextInt();
        final int N = scanner.nextInt();

        boolean switcher = true;
        for (int i = 0; i < A; i++) {
            System.out.print(switcher ? "A" : "B");
            switcher = !switcher;
        }

        for (int i = 0; i < B; i++) {
            System.out.print(switcher ? "a" : "b");
            switcher = !switcher;
        }

        for (int i = 0; i < C; i++) {
            System.out.print(switcher ? 1 : 2);
            switcher = !switcher;
        }

        for (int i = 0; i < N - A - B - C; i++) {
            System.out.print(switcher ? "A" : "B");
            switcher = !switcher;
        }
    }
}