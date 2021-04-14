import java.util.*;
public class ShoppingCart
  {
      private ArrayList<Item> order;
      private double total;
      private double internalDiscount;

    //Constructor
      public ShoppingCart()
      {
          order = new ArrayList<Item>();
          total = 0.0;
          internalDiscount = 0.0;
      }
      /*
       N: Add method
       P：caclulate the cost of the items
       I: Items, and discount method
       R: Ints
      */

      public void add(Item i) {
          order.add(i);
          total += i.getPrice();
          if (i instanceof DiscountedItem)
             internalDiscount += ((DiscountedItem) i).getDiscount();
      }

     // printOrder() will call toString() to print */
      public void printOrder() {
          System.out.println(this);
      }

      public String toString() {
          return discountToString() + "\nTotal discounted Items: " + countDiscountedItems();
      }

      public String discountToString() {
          return orderToString() + "\nSub-total: " + valueToString(total) + "\nDiscount: " + valueToString(internalDiscount) + "\nTotal: " + valueToString(total - internalDiscount);
      }

      /*
       N: CountedDiscounted method
       P：A for loop that count number of discountedItem
       I: Order length, and amount of discountedItem
       R: Int
      */

      public int countDiscountedItems(){
      int count = 0;
      for(int f = 0; f < order.size(); f++){
      if(this.order.get(f) instanceof DiscountedItem){
        count++;
        }//end if statement
      }//end for loop
      return count;
      }//end countDiscountedItems

      /*
       N: ToString method
       P：Printing string letters
       I: Double, and indexs
       R: String
      */
      private String valueToString(double value) {
          value = Math.rint(value * 100) / 100.0;
          String result = "" + Math.abs(value);
          if(result.indexOf(".") == result.length() - 2) {
              result += "0";
          }
          result = "$" + result;
          return result;
      }

      public String orderToString() {
          String build = "\nOrder Items:\n";
          for(int i = 0; i < order.size(); i++) {
              build += "   " + order.get(i);
              if(i != order.size() - 1) {
                  build += "\n";
              }
          }
          return build;
      }
    }
