import java.util.Scanner;

public class ComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter R: ");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Fi: ");
        double phi = Double.parseDouble(scanner.nextLine());

        System.out.println(r + " * [cos " + phi + " + i * sin " + phi + "]");
    }
}
