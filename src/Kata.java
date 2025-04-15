public class Kata {
    public static boolean feast(String beast, String dish) {
        boolean allowed = false;

        String beastFirst = beast.getName().charAt(0);
        String beastLast = beast.getName().charAt(beast.getName.length() - 1);
        String dishFirst = dish.getName().charAt(0);
        String dishLast = dish.getName().charAt(dish.getName.length() - 1);

        if (beastFirst.equals(dishFirst) + (beastLast.equals(dishLast))){
            allowed = true;
        }
        return allowed;
    }
}
