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
    public String cook(String dishName) {
        if (caffeeDishes.contains(dishName)) {
            return dishName;
        }
        return "Блюдо не найдено";
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
