import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (0 <= number && number <= 1000000) {
            String stringNum = String.valueOf(number);
            int stringNumLength = stringNum.length();

            if (number < 10) {
                System.out.println(0);
            } else {
                System.out.println(stringNum.charAt(stringNum.length() - 2));
            }
        } else {
            System.out.println("type new number again");
        }

    }
}