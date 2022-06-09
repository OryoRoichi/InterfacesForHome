import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Service> list = new ArrayList<Service>();
        list.add(new Caffee("Bob"));
        list.add(new Bar("bar de Joe"));
        list.add(new FoodTruck("веселый мороженщик"));
        list.add(new Gastronom("Катюша"));

        for (Service elem: list) {
            System.out.println(elem);
        }
    }
}
