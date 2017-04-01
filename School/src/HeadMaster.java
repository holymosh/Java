/**
 * Created by дшшр on 07.03.2017.
 */
public class HeadMaster implements Employable {
    private static HeadMaster ourInstance = new HeadMaster();

    public static HeadMaster getInstance() {
        return ourInstance;
    }

    private HeadMaster() {
    }

    @Override
    public Journal getJournal(int id) {
        return Journals.getInstance().getJournals().stream().filter(journal -> journal.getId() == id).findFirst().get();
    }

    public void removeTeacher(int id) {
        Teachers.getInstance().removeTeacher(id);
    }

    public void addTeacher(Teacher teacher) {
        Teachers.getInstance().addTeacher(teacher);
    }

    public void setSalary(int salary, int teacherId) {
        Teachers.getInstance().setSalary(teacherId, salary);
    }
}
