import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LMS lms = new LMS();
        Scanner scanner = new Scanner(System.in);

        // Pre-populate data
        Instructor instr1 = new Instructor("I001", "Dr. Smith", "smith@univ.edu");
        lms.registerInstructor(instr1);
        lms.registerStudent(new Student("S001", "Alice", "alice@student.edu"));
        
        instr1.createCourse("CS101", "Intro to CS", lms);

        while (true) {
            System.out.println("\n=== Learning Management System ===");
            System.out.println("1. Register Student");
            System.out.println("2. Register Instructor");
            System.out.println("3. List Courses");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Create Course (Instructor)");
            System.out.println("6. View Student Courses");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter ID: ");
                String uid = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                lms.registerStudent(new Student(uid, name, email));
            
            } else if (choice.equals("2")) {
                System.out.print("Enter ID: ");
                String uid = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                lms.registerInstructor(new Instructor(uid, name, email));

            } else if (choice.equals("3")) {
                lms.listCourses();

            } else if (choice.equals("4")) {
                System.out.print("Enter Student ID: ");
                String sId = scanner.nextLine();
                System.out.print("Enter Course ID: ");
                String cId = scanner.nextLine();
                
                Student student = lms.getStudent(sId);
                Course course = lms.getCourse(cId);
                
                if (student != null && course != null) {
                    student.enroll(course);
                } else {
                    System.out.println("Invalid Student or Course ID.");
                }

            } else if (choice.equals("5")) {
                System.out.print("Enter Instructor ID: ");
                String iId = scanner.nextLine();
                Instructor instructor = lms.getInstructor(iId);
                
                if (instructor != null) {
                    System.out.print("Enter New Course ID: ");
                    String cId = scanner.nextLine();
                    System.out.print("Enter Course Title: ");
                    String title = scanner.nextLine();
                    instructor.createCourse(cId, title, lms);
                } else {
                    System.out.println("Invalid Instructor ID.");
                }

            } else if (choice.equals("6")) {
                System.out.print("Enter Student ID: ");
                String sId = scanner.nextLine();
                Student student = lms.getStudent(sId);
                if (student != null) {
                    student.viewCourses();
                } else {
                    System.out.println("Invalid Student ID.");
                }

            } else if (choice.equals("7")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
