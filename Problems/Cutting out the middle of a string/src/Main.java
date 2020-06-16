import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String answer;

        if (line.length() % 2 == 0) {
            answer = line.substring(0, line.length() / 2 - 1) +
                    line.substring(line.length() / 2 + 1);
        } else {
            answer = line.substring(0, line.length() / 2) +
                    line.substring(line.length() / 2 + 1);
        }

        System.out.println(answer);
    }
}