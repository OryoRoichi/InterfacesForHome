import java.util.ArrayList;

public class Bar implements Service{
    String name;

    public Bar(String name) {
        this.name= name;
        list.add("Авиация");
        list.add("Белая леди");
        list.add("Дерби");

    }
    ArrayList<String> list =new ArrayList<String>();
    public String cook(String dishName) {
        if(list.contains(dishName)){
            return dishName;
        }
        return "Блюдо не найдено";
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Bar) {
            return this.name == ((Bar) obj).name;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Бар под названием "+this.name;
    }
}
