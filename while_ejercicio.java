import java.util.Locale;
import java.util.Scanner;

public class while_ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
