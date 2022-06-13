import java.util.ArrayList;

public class Gastronom implements Service {
    String name;
    ArrayList<String> list =new ArrayList<String>();
    public Gastronom(String name) {
        this.name= name;
        list.add("Курица Пикассо");
        list.add("Рататуй");
        list.add("Гратен дофинуа");

    }
    public String cook(String dishName) {
        if(list.contains(dishName)){
            return dishName;
        }
        return "Блюдо не найдено";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Gastronom) {
            return this.name == ((Gastronom) obj).name;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Кулинария под названием "+this.name;
    }
}
