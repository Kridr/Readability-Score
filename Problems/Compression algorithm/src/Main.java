import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        int repeat = 0;
        char currentChar = sentence.charAt(0);
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == currentChar) {
                repeat++;
            } else {
                System.out.print(currentChar + "" + repeat);
                repeat = 1;
                currentChar = sentence.charAt(i);
            }
        }
        System.out.print(currentChar + "" + repeat);

    }
}