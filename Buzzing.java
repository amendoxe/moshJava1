import java.util.Scanner;

public class Buzzing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        String message = " ";
        int userNumber = Integer.parseInt(scanner.nextLine().trim());
        double result1 = userNumber % 5;
        double result2 = userNumber % 3;
        if (result1 != 0 && result2 != 0) message = String.valueOf(userNumber);
        if (result1 == 0) message += "Fizz";
        if (result2 == 0) message += " Buzz";
        System.out.println(message);

    }
}
