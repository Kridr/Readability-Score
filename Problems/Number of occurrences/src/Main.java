import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String sub = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            String subSentence = sentence.substring(i);
            if (subSentence.startsWith(sub)) {
                count++;
            }
        }

        System.out.println(count);

    }
}