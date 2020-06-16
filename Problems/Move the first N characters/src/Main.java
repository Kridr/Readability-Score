import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.next();
        int n = scanner.nextInt();

        String result;
        if (n > sentence.length()) {
            result = sentence;
        } else {
            result = sentence.substring(n).concat(sentence.substring(0, n));
        }

        System.out.println(result);

    }
}