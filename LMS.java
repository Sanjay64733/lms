import java.util.HashMap;
import java.util.Map;

public class LMS {
    private Map<String, Course> courses;
    private Map<String, Student> students;
    private Map<String, Instructor> instructors;

    public LMS() {
        courses = new HashMap<>();
        students = new HashMap<>();
        instructors = new HashMap<>();
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public void registerStudent(Student student) {
        students.put(student.getUserId(), student);
        System.out.println("Student registered: " + student.getName());
    }

    public void registerInstructor(Instructor instructor) {
        instructors.put(instructor.getUserId(), instructor);
        System.out.println("Instructor registered: " + instructor.getName());
    }

    public Course getCourse(String courseId) {
        return courses.get(courseId);
    }

    public Student getStudent(String userId) {
        return students.get(userId);
    }

    public Instructor getInstructor(String userId) {
        return instructors.get(userId);
    }

    public void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("Available Courses:");
            for (Course course : courses.values()) {
                System.out.println(course);
            }
        }
    }
}
