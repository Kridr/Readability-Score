import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] date = scanner.nextLine().split("-");

        System.out.print(date[1] + "/");
        System.out.print(date[2] + "/");
        System.out.print(date[0]);
    }
}