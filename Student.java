import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Course> enrolledCourses;

    public Student(String userId, String name, String email) {
        super(userId, name, email);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enroll(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.getTitle());
        } else {
            System.out.println(name + " is already enrolled in " + course.getTitle());
        }
    }

    public void viewCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Courses for " + name + ":");
            for (Course course : enrolledCourses) {
                System.out.println("- " + course.getTitle());
            }
        }
    }
}
