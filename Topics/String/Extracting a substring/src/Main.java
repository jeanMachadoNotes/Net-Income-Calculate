import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String text = scanner.nextLine();
        int number = scanner.nextInt();
        int number_2 = scanner.nextInt();

        System.out.println(text.substring(number, number_2 + 1));
    }
}