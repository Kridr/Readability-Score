import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String address = scanner.next();

        String[] dividedAddress = address.split("\\?");

        String[] data = dividedAddress[1].split("&");

        String pasValBuf = "";
        for (String element : data) {
            if (element.charAt(element.length() - 1) == '=') {
                System.out.println(element.substring(0, element.length() - 1) + " : " + "not found");
            } else {
                String[] res = element.split("=");
                if (res[0].equals("pass")) {
                    pasValBuf = res[1];
                }
                System.out.println(res[0] + " : " + res[1]);
            }
        }

        if (pasValBuf.length() != 0) {
            System.out.printf("password : %s", pasValBuf);
        }
    }
}