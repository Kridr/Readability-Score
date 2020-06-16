import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double g = 9.8;
        double ro = scanner.nextDouble();
        double h = scanner.nextDouble();

        double p = ro * g * h;

        System.out.println(p);
    }
}