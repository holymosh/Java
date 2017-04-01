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
}
