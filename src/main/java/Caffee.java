import java.util.ArrayList;

public class Caffee implements Service{
    String name;

    ArrayList<String> list =new ArrayList<String>();
    public Caffee(String name) {
        this.name= name;
        list.add("Кофе");
        list.add("Роллы");
        list.add("Цезарь");

    }

    public String cook(String dishName) {
        if(list.contains(dishName)){
            return dishName;
        }
        return "Блюдо не найдено";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Caffee) {
            return this.name == ((Caffee) obj).name;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Кафе под названием "+this.name;
    }
}
