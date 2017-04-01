import java.util.List;

/**
 * Created by дшшр on 07.03.2017.
 */
public class Menu {
    private static Menu ourInstance = new Menu();

    public static Menu getInstance() {
        return ourInstance;
    }

    private Menu() {
    }

    private List<Dish> menu;

    public List<Dish> getMenu() {
        return menu;
    }

    public void addDish(Dish dish) {
        menu.add(dish);
    }

    public void removeDish(Dish dish) {
        menu.remove(dish);
    }

    public void setNewPrice(int id, int price) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
        menu.stream().filter(dish -> dish.getId() == id).findFirst().get().setPrice(price);
    }

    public Dish getDish(int id) {
        return menu.stream().filter(dish -> dish.getId() == id).findFirst().get();
    }

    public void removeDish(int id) {
        menu.remove(getDish(id));
    }
}
