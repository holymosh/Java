import java.util.List;

/**
 * Created by дшшр on 07.03.2017.
 */
public class AcademicGroup {
    private static int ID_Generator = 1;
    private int id;
    private String name;
    private List<Student> students;
    private List<Journal> journals;

    public List<Journal> getJournals() {
        return journals;
    }

    public AcademicGroup(String name) {
        this.name = name;
        id = ++ID_Generator;
    }

    public AcademicGroup(String name, List<Student> students) {
        this.name = name;
        this.students = students;
        id = ++ID_Generator;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
