import java.util.ArrayList;
import java.util.List;

public class Gastronom implements Service {
    private String gastronomName;
    private List<String> gastronomDishes;
    public Gastronom(String name) {
        this.gastronomName= name;
        gastronomDishes = new ArrayList<String>();
        gastronomDishes.add("Курица Пикассо");
        gastronomDishes.add("Рататуй");
        gastronomDishes.add("Гратен дофинуа");

    }
    public String cook(String dishName) {
        if (gastronomDishes.contains(dishName)) {
            return dishName;
        }
        throw new RuntimeException();
    }
    public String sale(float cash,String dishName) {
        if (cash - 4.75f < 1) {
            throw new LessThenOneException();
        }
        return cook(dishName);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Gastronom) {
            return this.gastronomName == ((Gastronom) obj).gastronomName;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Кулинария под названием "+this.gastronomName;
    }
}
