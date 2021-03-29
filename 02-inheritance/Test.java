import java.util.*;
class Test {
 public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    cart.add(new Item("bread", 3.25));
    cart.add(new Item("milk", 2.50));

    cart.add(new DiscountedItem("ice cream", 4.50, 1.50));
    cart.add(new DiscountedItem("apples", 1.35, 0.25));

    cart.printOrder();
  }
}
