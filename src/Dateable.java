import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");

        Scanner scanner = new Scanner(System.in);


        int age = scanner.nextInt();
        int ageToDate = 7 + (age/2);
        System.out.println("Your optimal age to date is: " + ageToDate);
    }
}
