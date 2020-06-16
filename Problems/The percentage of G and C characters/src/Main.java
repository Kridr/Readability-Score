import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine().toLowerCase();

        double count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'g' || sentence.charAt(i) == 'c') {
                count++;
            }
        }

        System.out.println(count / sentence.length() * 100);
    }
}