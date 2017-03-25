/**
 * Created by дшшр on 07.03.2017.
 */
public class Dish {
    private static int ID_Generator = 1;
    private int id;
    private int name;
    private int price;

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Dish(int name, int price) {
        this.name = name;
        this.price = price;
        id=++ID_Generator;
    }
}
