import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() && isPalindrome; i++) {
            isPalindrome = word.charAt(i) == word.charAt(word.length() - 1 - i);
        }

        System.out.println(isPalindrome ? "yes" : "no");
    }
}