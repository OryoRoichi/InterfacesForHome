import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Service> list = new ArrayList<Service>();
        list.add(new Caffee("Bob"));
        list.add(new Bar("bar de Joe"));
        list.add(new FoodTruck("Папа жарит "));
        list.add(new Gastronom("Катюша"));

        test(list, true);//метод проверки работы метода COOK

        for (Service elem : list) {
            System.out.println(elem);
        }
    }

    public static void test(ArrayList<Service> list, boolean flag) {
        if (flag == true) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof Caffee) {
                    try {
                        System.out.println(list.get(i).cook("хофе"));
                    } catch (DishNotFoundException e) {
                        System.out.println("у нас нет такого блюда");
                    }

                    try {
                        System.out.println(list.get(i).sale(4.75f, "хофе"));
                    } catch (DishNotFoundException e) {
                        System.out.println("у нас нет такого блюда");
                        try {
                            System.out.println(list.get(i).sale(5.75f, "Кофе"));
                        } catch (DishNotFoundException ex) {
                            throw new RuntimeException(ex);
                        }

                    } catch (LessThenOneException e) {

                        System.out.println("дай другими деньгами");
                    }


                    System.out.println("тест завершен");

                }
            }
        }
    }
}
