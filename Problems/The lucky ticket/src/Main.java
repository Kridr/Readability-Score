import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticket = scanner.next();

        boolean isLucky = Character.getNumericValue(ticket.charAt(0)) +
                          Character.getNumericValue(ticket.charAt(1)) +
                          Character.getNumericValue(ticket.charAt(2)) ==
                          Character.getNumericValue(ticket.charAt(ticket.length() - 1)) +
                          Character.getNumericValue(ticket.charAt(ticket.length() - 2)) +
                          Character.getNumericValue(ticket.charAt(ticket.length() - 3));

        System.out.println(isLucky ? "Lucky" : "Regular");
    }
}