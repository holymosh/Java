import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by дшшр on 09.03.2017.
 */
public class Journals {
    private static Journals ourInstance = new Journals();

    public static Journals getInstance() {
        return ourInstance;
    }

    private Journals() {
    }

    private List<Journal> journals;

    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }

    public List<Journal> getJournals() {
        return journals;

    }

    public Journals(List<Journal> journals) {
        this.journals = journals;
    }

    public List<Journal> getTeachersJournals(int teacherId) {
        return journals.stream().filter(journal -> journal.getTeacherId() == teacherId).collect(Collectors.toList());
    }

    public void addMark(int journalId, Mark mark) {
        Journal journal = journals.stream().filter(entity -> entity.getId() == journalId).findFirst().get();
        journal.AddMark(mark);
    }

    public List<Journal> getGroupJournal(int groupId) {
        return journals.stream().filter(journal -> journal.getGroupId() == groupId).collect(Collectors.toList());
    }
}
