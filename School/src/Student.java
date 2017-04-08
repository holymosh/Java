import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Student {
    private int id;
    private int cashMoney;
    private String name;
    private String surname;
    private int age;
    private static int ID_Generator = 1;
    private int[] parentsId;
    private double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public int getId() {
        return id;
    }

    public int[] getParentsId() {
        return parentsId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCashMoney() {
        return cashMoney;
    }


    public Student(int cashMoney, String name, String surname, int age) {
        this.id = ++ID_Generator;
        this.cashMoney = cashMoney;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname, int age, int[] parents) {
        this.id = ++ID_Generator;
        this.age = age;
        this.name = name;
        this.surname = surname;
        parentsId = parents;
    }

    public void giveCash(int money) {
        IllegalArgumentException exception = new IllegalArgumentException("money can't be less than zero");
        if (money < 0) {
            throw exception;
        }
        cashMoney += money;
    }

    public boolean containsParentId(int id) {
        boolean result = false;
        for (int i = 0; i < parentsId.length; i++) {
            result = parentsId[i] == id;
            if (result) return result;
        }
        return result;
    }


    public void payForDish(int dishId) {
        Menu menu = Menu.getInstance();
        Optional<Dish> dishStream = menu.getMenu().stream().filter(dish -> dish.getId() == dishId).findFirst();
        Dish dish = dishStream.get();
        IllegalArgumentException exception = new IllegalArgumentException("dish price more than student cash");
        if (dish.getPrice() > cashMoney) {
            throw exception;
        }
        cashMoney -= dish.getPrice();
    }

    public void calculateAverageMark() {
        List<Mark> marks = new ArrayList<>();
        Journals.getInstance().getJournals().forEach(journal -> journal.getMarkList().forEach(mark -> {
            if (mark.getStudentId() == id) {
                marks.add(mark);
            }
        }));
        int sum = 0;
        for (int i = 0; i < marks.size(); i++) {
            sum += marks.get(i).getValue();
        }
        averageMark = sum / marks.size();

    }

}
