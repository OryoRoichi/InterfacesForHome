import java.util.ArrayList;
import java.util.List;

public class Bar implements Service{


    private String barName;
    private List<String> barDishes;
    public Bar(String name) {
        this.barName= name;
        barDishes= new ArrayList<String>();
        barDishes.add("Авиация");
        barDishes.add("Белая леди");
        barDishes.add("Дерби");

    }
    public String cook(String dishName) {
        if(this instanceof Bar) {
            if (barDishes.contains(dishName)) {
                return dishName;
            }
        }
        throw new RuntimeException();
    }
    public String sale(float cash,String dishName) {
        try {
            if (cash - 4.75f < 1) throw new LessThenOneException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return cook(dishName);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Bar) {
            return this.barName == ((Bar) obj).barName;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Бар под названием "+this.barName;
    }
}
