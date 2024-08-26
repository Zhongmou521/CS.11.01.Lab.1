import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");

        Scanner scanner = new Scanner(System.in);


        int age = scanner.nextInt();
        int pageToRead = (100 - age);
        System.out.println("Your optimal age to date is: " + pageToRead);
    }
}
