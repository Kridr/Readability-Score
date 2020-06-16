import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double dotProduct = x1 * x2 + y1 * y2;
        double length1 = Math.sqrt(x1 * x1 + y1 * y1);
        double length2 = Math.sqrt(x2 * x2 + y2 * y2);

        double cosAngle = dotProduct / (length1 * length2);

        System.out.println(Math.toDegrees(Math.acos(cosAngle)));
    }
}