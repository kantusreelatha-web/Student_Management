import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    dao.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    dao.deleteStudent(delId);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
