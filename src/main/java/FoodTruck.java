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
    public String cook(String dishName) throws DishNotFoundException{
        if(foodTruckDishes.contains(dishName)){
            return dishName;
        }
        throw new DishNotFoundException();
    }
    public String sale(float cash,String dishName) throws DishNotFoundException{
        try {
            if (cash - 4.75f < 1) throw new LessThenOneException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return cook(dishName);
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
