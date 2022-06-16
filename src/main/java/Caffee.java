import java.util.ArrayList;
import java.util.List;

public class Caffee implements Service{
    private String caffeeName;
    private List<String> caffeeDishes;
    public Caffee(String name) {
        this.caffeeName= name;
        caffeeDishes= new ArrayList<String>();
        caffeeDishes.add("Кофе");
        caffeeDishes.add("Роллы");
        caffeeDishes.add("Цезарь");
    }
    public String cook(String dishName) throws DishNotFoundException {
        if (caffeeDishes.contains(dishName)) {
            return dishName;
        }
        throw new DishNotFoundException();
    }

    public String sale(float cash,String dishName) throws DishNotFoundException ,LessThenOneException{
            if (cash - 4.75f < 1) {
                throw new LessThenOneException();
            }
        return cook(dishName);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Caffee) {
            return this.caffeeName == ((Caffee) obj).caffeeName;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Кафе под названием "+this.caffeeName;
    }
}
