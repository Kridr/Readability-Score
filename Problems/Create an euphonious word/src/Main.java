import java.util.*;

public class Main {
    public static boolean isVowel(char symbol) {
        return symbol == 'a' ||
                symbol == 'e' ||
                symbol == 'i' ||
                symbol == 'o' ||
                symbol == 'u' ||
                symbol == 'y';
    }

    public static int addRow(int result, int seq) {
        int answer = result;
        if (seq > 2) {
            answer += seq % 2 == 0 ? seq / 2 - 1 : seq / 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        int cons = 0;
        int vow = 0;

        int result = 0;

        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                vow++;
                result = addRow(result, cons);
                cons = 0;
            } else {
                cons++;
                result = addRow(result, vow);
                vow = 0;
            }
        }

        result = addRow(result, cons);
        result = addRow(result, vow);

        System.out.println(result);
    }
}