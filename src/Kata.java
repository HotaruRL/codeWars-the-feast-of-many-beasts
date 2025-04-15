public class Kata {
    public static boolean feast(Beast beast, Dish dish) {

        char beastFirst = beast.getName().charAt(0);
        char beastLast = beast.getName().charAt(beast.getName().length() - 1);
        char dishFirst = dish.getName().charAt(0);
        char dishLast = dish.getName().charAt(dish.getName().length() - 1);

        return beastFirst == dishFirst && beastLast == dishLast;
    }
}
