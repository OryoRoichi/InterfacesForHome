public interface Service {
     String cook(String name) throws DishNotFoundException;
     String sale(float cash, String dishName) throws DishNotFoundException;

}
