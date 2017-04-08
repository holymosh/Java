import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by дшшр on 08.04.2017.
 */
public class SchoolServiceImplementation implements SchoolService {
    @Override
    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override
    public Future<List<Student>> getStudents() {
        return null;
    }

    @Override
    public Future<List<Student>> getStudents(Predicate<? extends Student> predicate) {
        return null;
    }

    @Override
    public Future<List<Teacher>> getTeachers() {
        return null;
    }

    @Override
    public Future<List<Teacher>> getTeachers(Predicate<? extends Teacher> predicate) {
        return null;
    }

    @Override
    public Future<Void> writeStudentMarks(Student student, File file) {
        return null;
    }

    @Override
    public Future<List<Student>> getParentsStudents(Parent parent) {
        return null;
    }

    @Override
    public Future<List<Student>> getTeachersStudents(Teacher teacher) {
        return null;
    }

    @Override
    public Future<List<Dish>> getCanteenFood() {
        return null;
    }

    @Override
    public Future<Student> getTheMostSuccessfulStudent() {
        return null;
    }

    @Override
    public Future<Student> getTheLeastSuccessfulStudent() {
        return null;
    }

    @Override
    public void ifStudentExists(Student student, Consumer<Student> consumer) {
        consumer = entity -> entity = Students.getInstance().getStudent(student.getId());
        consumer.accept(student);
    }

    @Override
    public void ifTeacherExists(Teacher teacher, Consumer<Student> consumer) {

    }

    @Override
    public void ifParentExists(Teacher teacher, Consumer<Student> consumer) {

    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return Students.getInstance().getStudentOptional(id);
    }

    @Override
    public Optional<Teacher> getTeacherById(int id) {
        return Teachers.getInstance().getTeacherOptional(id);
    }

    @Override
    public Optional<Teacher> getParentId(int id) {
        Parents.getInstance().getParent(id);
    }

    ExecutorService executorService;
}
