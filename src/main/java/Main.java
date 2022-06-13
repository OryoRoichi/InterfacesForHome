import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Service> list = new ArrayList<Service>();
        list.add(new Caffee("Bob"));
        list.add(new Bar("bar de Joe"));
        list.add(new FoodTruck("Папа жарит "));
        list.add(new Gastronom("Катюша"));

        test(list,false);//метод проверки работы метода COOK

        for (Service elem: list) {
            System.out.println(elem);
        }
    }
    public static void test(ArrayList<Service> list, boolean flag) {
        if (flag==true) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof Gastronom) {
                    System.out.println(list.get(i).cook("Рататуй"));
                    System.out.println(list.get(i).cook("РататуQQQQ"));
                }
                if (list.get(i) instanceof FoodTruck) {
                    System.out.println(list.get(i).cook("Хотдог"));
                    System.out.println(list.get(i).cook("Колддог"));
                }
                if (list.get(i) instanceof Caffee) {
                    System.out.println(list.get(i).cook("Кофе"));
                    System.out.println(list.get(i).cook("Авиация"));
                }
                if (list.get(i) instanceof Bar) {
                    System.out.println(list.get(i).cook("Дерби"));
                    System.out.println(list.get(i).cook("Гратен дофинуа"));
                }
            }
            System.out.println("тест завершен");
        }
    }
}
