import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        Future<List<Student>> listFuture = executorService.submit(() -> Students.getInstance().students);
        try {
            listFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listFuture;
    }

    @Override
    public Future<List<Student>> getStudents(Predicate<? extends Student> predicate) {
        Future<List<Student>> listFuture = executorService.submit(() -> Students.getInstance().students.stream()
                .filter((Predicate<? super Student>) predicate).collect(Collectors.toList()));
        try {
            listFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listFuture;
    }

    @Override
    public Future<List<Teacher>> getTeachers() {
        Future<List<Teacher>> listFuture = executorService.submit(() -> Teachers.getInstance().getTeachers());
        try {
            listFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listFuture;
    }

    @Override
    public Future<List<Teacher>> getTeachers(Predicate<? extends Teacher> predicate) {
        Future<List<Teacher>> listFuture = executorService.submit(() -> Teachers.getInstance().getTeachers().stream().
                filter((Predicate<? super Teacher>) predicate).collect(Collectors.toList()));
        try {
            listFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listFuture;
    }

    @Override
    public Future<Void> writeStudentMarks(Student student, File file) {
        return null;
    }

    @Override
    public Future<List<Student>> getParentsStudents(Parent parent) {
        Future<List<Student>> listFuture =
                executorService.submit(() -> Students.getInstance().students.stream().
                        filter(student -> student.containsParentId(parent.getId())).collect(Collectors.toList()));
        try {
            listFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listFuture;

    }

    @Override
    public Future<List<Student>> getTeachersStudents(Teacher teacher) {
        return null;
    }

    @Override
    public Future<List<Dish>> getCanteenFood() {
        Future<List<Dish>> listFuture = executorService.submit(() -> Menu.getInstance().getMenu());
        try {
            listFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listFuture;
    }

    @Override
    public Future<Student> getTheMostSuccessfulStudent() {
        Future future = executorService.submit(() -> Students.getInstance().students.forEach(student -> student.calculateAverageMark()));
        try {
            future.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Future<Student> studentFuture = executorService.submit(() -> Students.getInstance().students.stream().max(Comparator.comparing(Student::getAverageMark)).get() );
        try {
            studentFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  studentFuture;
    }

    @Override
    public Future<Student> getTheLeastSuccessfulStudent() {
        Future future = executorService.submit(() -> Students.getInstance().students.forEach(student -> student.calculateAverageMark()));
        try {
            future.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Future<Student> studentFuture = executorService.submit(() -> Students.getInstance().students.stream().min(Comparator.comparing(Student::getAverageMark)).get() );
        try {
            studentFuture.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  studentFuture;
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
