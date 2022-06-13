import java.util.ArrayList;
import java.util.List;

public class FoodTruck implements Service {
    private String foodTruckName;
    private List<String> foodTruckDishes;
    public FoodTruck(String name) {
        this.foodTruckName= name;
        this.foodTruckDishes= new ArrayList<String>();
        foodTruckDishes.add("Бругер");
        foodTruckDishes.add("Хотдог");
        foodTruckDishes.add("Шаверма");

    }

    public String cook(String dishName) {
        if(foodTruckDishes.contains(dishName)){
            return dishName;
        }
        return "Блюдо не найдено";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof FoodTruck) {
            return this.foodTruckName == ((FoodTruck) obj).foodTruckName;
        }
        return false;
    }

    @Override
    public String toString() {
        return "фуд-трак под названием "+this.foodTruckName;
    }
}
