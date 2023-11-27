public class ShoppingListTest {
    public static void main(String[] args) {

        System.out.println(Shoppinglist.displayShoppingList());
        System.out.println(Shoppinglist.displayNumberOfProducts());
        Shoppinglist.addShop("Arbuz");
        Shoppinglist.addShop("Ziemniaki");
        Shoppinglist.addShop("Kapusta");
        System.out.println(Shoppinglist.displayShoppingList());
        System.out.println(Shoppinglist.displayNumberOfProducts());
        Shoppinglist.addShop();
        System.out.println(Shoppinglist.displayShoppingList());
        System.out.println(Shoppinglist.displayNumberOfProducts());
    }
}
