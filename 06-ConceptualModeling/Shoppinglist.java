import java.util.*;

public class Shoppinglist {
    static ArrayList<String> list = new ArrayList<>();
    static int products;
    static String l = "";
    static Scanner sc = new Scanner(System.in);

    public static void addShop(String product){
        list.add(product);
    }
    public static void addShop(){
        String productt = sc.nextLine();
        list.add(productt);
    }
    public static String displayShoppingList(){
        l="";
        for (String e : list){
            l=l+" "+ e;
        }
        return l;
    }

    public static int displayNumberOfProducts(){
        return list.size();
    }
}
