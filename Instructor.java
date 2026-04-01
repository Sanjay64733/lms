import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
    private List<Course> coursesTaught;

    public Instructor(String userId, String name, String email) {
        super(userId, name, email);
        this.coursesTaught = new ArrayList<>();
    }

    public void createCourse(String courseId, String title, LMS lms) {
        Course newCourse = new Course(courseId, title, this);
        coursesTaught.add(newCourse);
        lms.addCourse(newCourse);
        System.out.println("Course '" + title + "' created by " + name);
    }
}
