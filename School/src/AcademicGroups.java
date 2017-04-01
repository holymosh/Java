import java.util.ArrayList;
import java.util.List;

/**
 * Created by дшшр on 31.03.2017.
 */
public class AcademicGroups {

    private List<AcademicGroup> academicGroupList;

    public AcademicGroup getGroup(int id) {
        return academicGroupList.stream().filter(academicGroup -> id == academicGroup.getId()).findFirst().get();
    }

    public void addGroup(AcademicGroup academicGroup) {
        academicGroupList.add(academicGroup);
    }

    public void removeGroup(int id) {
        academicGroupList.remove(getGroup(id));
    }

    public List<AcademicGroup> getAcademicGroupList() {
        return academicGroupList;
    }

    public AcademicGroups() {
        academicGroupList = new ArrayList<>();
    }
}
