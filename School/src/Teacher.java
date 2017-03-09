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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
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
        return Journals.getInstance().getJournals().stream().filter(journal -> journal.getId()==id).findFirst().get();
    }
}
