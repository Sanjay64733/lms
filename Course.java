import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private Instructor instructor;
    private List<Student> students;

    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public String getCourseId() { return courseId; }
    public String getTitle() { return title; }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    @Override
    public String toString() {
        return "[" + courseId + "] " + title + " - Instructor: " + instructor.getName();
    }
}
