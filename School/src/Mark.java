import java.util.Date;

/**
 * Created by дшшр on 07.03.2017.
 */
public class Mark {
    private static int ID_Generator = 1;
    private int id;
    private final int value;
    private Date date;
    private int studentId;

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    public int getStudentId() {
        return studentId;
    }

    public Mark(int value, Date date, int studentId) {
        this.value = value;
        this.date = date;
        this.studentId = studentId;
        id = ++ID_Generator;
    }
}
