import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt(); 

        // Compute and print the square of n
        double sqr = Math.pow(n, 2);
        // Compute and print the cube of n
        double cube = Math.pow(n, 3);
        // Compute and print the fourth power of n
        double four = Math.pow(n, 4);

        System.out.println(Math.round(sqr));
        System.out.println(Math.round(cube));
        System.out.println(Math.round(four));
    }
}