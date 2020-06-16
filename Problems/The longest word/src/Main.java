import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        int maxLen = words[0].length();
        int maxLenIndex = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLen) {
                maxLen = words[i].length();
                maxLenIndex = i;
            }
        }

        System.out.println(words[maxLenIndex]);
    }
}