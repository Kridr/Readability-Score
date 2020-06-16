import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.next();

        boolean isAlphabetical = true;

        for (int i = 0; i < sequence.length() - 1 && isAlphabetical; i++) {
            isAlphabetical = sequence.charAt(i + 1) - sequence.charAt(i) == 1;
        }

        System.out.println(isAlphabetical);
    }
}