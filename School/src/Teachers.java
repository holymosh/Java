import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by дшшр on 31.03.2017.
 */
public class Teachers {

    public Teacher getTeacher(int id) {
        return teachers.stream().filter(teacher -> teacher.getId() == id).findFirst().get();
    }

    public void setSalary(int id, int salary) {
        getTeacher(id).setSalary(salary);
    }

    public void removeTeacher(int id) {
        teachers.remove(getTeacher(id));
    }

    public Optional<Teacher> getTeacherOptional(int id){
        return teachers.stream().filter(teacher -> teacher.getId()==id).findFirst();
    }


    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    private static Teachers ourInstance = new Teachers();

    public static Teachers getInstance() {
        return ourInstance;
    }

    private Teachers() {
        teachers = new ArrayList<>();
    }

    private List<Teacher> teachers;

}
