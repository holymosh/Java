import java.io.UnsupportedEncodingException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by дшшр on 07.03.2017.
 */
public class Student {
    private int id;
    private int cashMoney;
    private String name;
    private String surname;
    private int age;
    private static int ID_Generator=1;
    private int[] parentsId;

    private Logger logger;

    private String login;
    private String password;

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


    public Student(int cashMoney, String name, String surname, int age, int[] parentsId) throws UnsupportedEncodingException {
        this.cashMoney = cashMoney;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.parentsId = parentsId;
        this.login = login;
        this.password = password;
        logger = new Logger(Logger.defaultPath);
        switch (logger.getState()){
            case Error: break;
            case Warn:break;
            case Info:
            case Debug: logger.write("student "+name+" "+ surname+" created");

        }

    }

    public void giveCash(int money){
        if (money<0) {
            logger.write("money can't be less than zero " + surname +" "+ name+" ");
            throw new IllegalArgumentException("money can't be less than zero ");
        }
        cashMoney+=money;
    }

    public void payForDish(int dishId){
        //Menu menu = Menu.getInstance();
        //Optional<Dish> dishStream = menu.getMenu().stream().filter(dish -> dish.getId()==dishId).findFirst();
        //Dish dish = dishStream.get();
        //IllegalArgumentException exception = new IllegalArgumentException("dish price more than student cash");
        //if (dish.getPrice()>cashMoney) {
        //    throw exception;
        //}
        //cashMoney -= dish.getPrice();


    }


}
