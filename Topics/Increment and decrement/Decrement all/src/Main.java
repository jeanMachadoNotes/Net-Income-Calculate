import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reads 4 input numbers
        int input_1 = scanner.nextInt();
        int input_2 = scanner.nextInt();
        int input_3 = scanner.nextInt();
        int input_4 = scanner.nextInt();

        int newInput_1 = input_1 - 1;
        int newInput_2 = input_2 - 1;
        int newInput_3 = input_3 - 1;
        int newInput_4 = input_4 - 1;

        System.out.println(newInput_1 + " " + newInput_2 + " " + newInput_3 + " " + newInput_4);
    }

}