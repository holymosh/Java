import java.util.List;

/**
 * Created by дшшр on 07.03.2017.
 */
public class Journal {
    private static int ID_Generator = 1;
    private int id;
    private String courseName;
    private int teacherId;
    private List<Mark> markList;

    public Journal(String courseName, int teacherId, List<Mark> markList) {
        this.courseName = courseName;
        this.teacherId = teacherId;
        this.markList = markList;
        id= ++ID_Generator;
    }

    public Journal(String courseName, int teacherId) {
        this.courseName = courseName;
        this.teacherId = teacherId;
        id = ++ID_Generator;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public List<Mark> getMarkList() {
        return markList;
    }
    public void AddMark(Mark mark){
        markList.add(mark);
    }
}
