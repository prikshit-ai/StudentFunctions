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

        e = sc.nextInt();

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
