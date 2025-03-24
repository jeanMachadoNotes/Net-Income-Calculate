import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        //Receive input
        int class_A = scanner.nextInt();
        int class_B = scanner.nextInt();
        int class_C = scanner.nextInt();

        int class_A_desks = calculateDesks(class_A);
        int class_B_desks = calculateDesks(class_B);
        int class_C_desks = calculateDesks(class_C);

        //Combine results and output to console
        System.out.println(class_A_desks + class_B_desks + class_C_desks);



    }
    public static int calculateDesks(int group) {
        //Calculate modulus
        int studentsPerDesk = 2;
        int desksNeeded = group / studentsPerDesk;
        int extraDesk = group % studentsPerDesk;

        //If 0, then divide by two take that value
        //Else 1 then add 1 to final quotient.
        if (extraDesk == 0) {
            return desksNeeded;
        } else {
            desksNeeded += 1;
            return desksNeeded;
        }
    }
}