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
    public void addDish(Dish dish){
        menu.add(dish);
    }
    public void removeDish(Dish dish){
        menu.remove(dish);
    }
    public void setNewPrice(int id , int price){
        menu.forEach(dish -> {
            if (dish.getId()==id){
                dish.setPrice(price);
            }
        });
    }
}
