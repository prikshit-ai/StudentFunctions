import java.util.Scanner;

/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        while (true) {
            // Display menu options
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            // Ensure valid integer input for menu
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input! Enter a valid option (1-8): ");
                sc.next();
            }
            