import java.util.Scanner;
/**
 * Name: Prikshit Gaur
 * PRN: 23070126094
 * Batch: AIML 2023-27
 * 
 
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentmanager manager = new Studentmanager();
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
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.addStudent(sc);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    manager.searchByPrn(sc);
                    break;
                case 4:
                    manager.searchByName(sc);
                    break;
                case 5:
                    manager.searchByPosition(sc);
                    break;
                case 6:
                    manager.updateStudent(sc);
                    break;
                case 7:
                    manager.deleteStudent(sc);
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
