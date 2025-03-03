import java.util.ArrayList;
import java.util.Scanner;

public class Studentmanager {
    private ArrayList<Student> students = new ArrayList<>();
    
    // Method to add a student
    public void addStudent(Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
        String dob = sc.next();
        System.out.print("Enter Marks: ");

        // Ensuring marks is a valid number
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Enter a valid number for marks: ");
            sc.next();
        }
        double marks = sc.nextDouble();

        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully.");
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    // Search student by PRN
    public void searchByPrn(Scanner sc) {
        System.out.print("Enter PRN to search: ");
        String prn = sc.next();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Search student by Name
    public void searchByName(Scanner sc) {
        System.out.print("Enter Name to search: ");
        String name = sc.next();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Search student by Position
    public void searchByPosition(Scanner sc) {
        System.out.print("Enter Position (index starts from 0): ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid index: ");
            sc.next();
        }
        int pos = sc.nextInt();

        if (pos >= 0 && pos < students.size()) {
            students.get(pos).display();
        } else {
            System.out.println("Invalid position.");
        }
    }

    // Update student details
    public void updateStudent(Scanner sc) {
        System.out.print("Enter PRN to update: ");
        String prn = sc.next();
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.print("Enter New Name: ");
                student.setName(sc.next());
                System.out.print("Enter New Date of Birth (dd-MM-yyyy): ");
                student.setDob(sc.next());
                System.out.print("Enter New Marks: ");

                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid input! Enter a valid number for marks: ");
                    sc.next();
                }
                student.setMarks(sc.nextDouble());

                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student
    public void deleteStudent(Scanner sc) {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.next();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPrn().equals(prn)) {
                students.remove(i);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
