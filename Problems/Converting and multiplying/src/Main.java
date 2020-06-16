import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (! "0".equals(number)) {
            try {
                System.out.println(Integer.parseInt(number) * 10);
            } catch (NumberFormatException e) {
                System.out.format("Invalid user input: %s\n", number);
            }

            number = scanner.nextLine();
        }
    }
}