import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface SchoolService {


    void setExecutorService(ExecutorService executorService);

    Future<List<Student>> getStudents();

    Future<List<Student>> getStudents(Predicate<? extends Student> predicate);


    Future<List<Teacher>> getTeachers();

    Future<List<Teacher>> getTeachers(Predicate<? extends Teacher> predicate);


    Future<Void> writeStudentMarks(Student student, File file);

    
    Future<List<Student>> getParentsStudents(Parent parent);

    Future<List<Student>> getTeachersStudents(Teacher teacher);
    
    
    Future<List<Dish>> getCanteenFood();
    
    Future<Student> getTheMostSuccessfulStudent();
    Future<Student> getTheLeastSuccessfulStudent();
    
    
    void ifStudentExists(Student student, Consumer<Student> consumer);
    void ifTeacherExists(Teacher teacher, Consumer<Student> consumer);
    void ifParentExists(Teacher teacher, Consumer<Student> consumer);

    
    Optional<Student> getStudentById(int id);
    Optional<Teacher> getTeacherById(int id);
    Optional<Teacher> getParentId(int id);
}
