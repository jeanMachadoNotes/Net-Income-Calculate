import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int nSquirrels = scanner.nextInt();
         int kNuts = scanner.nextInt();

        System.out.println(kNuts % nSquirrels);

    }
}