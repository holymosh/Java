import java.util.List;
import java.util.Optional;

/**
 * Created by дшшр on 08.04.2017.
 */
public class Students {
    private static Students ourInstance = new Students();

    public static Students getInstance() {
        return ourInstance;
    }

    private Students() {
    }

    public Student getStudent(int id){
        return students.stream().filter(student -> student.getId() == id).findFirst().get();
    }

    public Optional<Student> getStudentOptional(int id){
        return students.stream().filter(student -> student.getId()==id).findFirst();
    }

    List<Student> students;
}
