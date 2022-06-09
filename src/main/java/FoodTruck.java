public class FoodTruck implements Service {
    String name;
    String dish;
    public FoodTruck(String name) {
        this.name= name;
    }

    public void cook(String dish) {
        System.out.println("Готовим "+dish+" пожалуйста подождите");
    }

    public void sale(String dish) {
        cook(dish);
        System.out.println("ПРодано!");
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "фуд-трак под названием "+this.name;
    }
}
