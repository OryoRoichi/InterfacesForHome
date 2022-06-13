import java.util.ArrayList;

public class FoodTruck implements Service {
    String name;
    ArrayList<String> list =new ArrayList<String>();
    public FoodTruck(String name) {
        this.name= name;
        list.add("Бругер");
        list.add("Хотдог");
        list.add("Шаверма");

    }

    public String cook(String dishName) {
        if(list.contains(dishName)){
            return dishName;
        }
        return "Блюдо не найдено";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof FoodTruck) {
            return this.name == ((FoodTruck) obj).name;
        }
        return false;
    }

    @Override
    public String toString() {
        return "фуд-трак под названием "+this.name;
    }
}
