/**
 * Created by дшшр on 07.03.2017.
 */
public class Teacher implements Employable {
    private static int ID_Generator = 1;
    private int id;
    private String name;
    private String surname;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {

        if (salary < 0) {
            throw new IllegalArgumentException("salary can't be less than zero");
        }
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public Journal getJournal(int id) {
        return Journals.getInstance().getJournals().stream().filter(journal -> journal.getId() == id && journal.getTeacherId() == id).findFirst().get();
    }

    public void setMark(Mark mark, int journalId) {
        getJournal(journalId).AddMark(mark);
    }
}
