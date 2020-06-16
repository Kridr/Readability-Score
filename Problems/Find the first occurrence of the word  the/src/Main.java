import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        int index = -1;

        for (int i = 0; i < sentence.length() && index == -1; i++) {
            String sub = sentence.substring(i);
            if (sub.startsWith("The") || sub.startsWith("the")) {
                index = i;
            }
        }

        System.out.println(index);
    }
}