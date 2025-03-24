import java.util.Scanner;

class Main {

    //Remove whitespaces
     public static String cleanInput(String input) {
        String trimTextInput = input.trim();
        return trimTextInput.replace(" ", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Receive user input
        String textInput = scanner.nextLine();
        String textInputTwo = scanner.nextLine();

        //Send out/receive input for cleaning
        String cleanText = cleanInput(textInput);
        String cleanText_2 = cleanInput(textInputTwo);

        //Compare strings
        if (cleanText.equals(cleanText_2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}