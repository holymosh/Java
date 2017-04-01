/**
 * Created by дшшр on 07.03.2017.
 */
public class Parent {
    private static int ID_Geneator = 1;
    private int id;
    private String name;
    private String surname;
    private int money;

    public int getMoney() {
        return money;
    }

    public Parent(String name, String surname) {
        this.name = name;
        this.surname = surname;
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


}
