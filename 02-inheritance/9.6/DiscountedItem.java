public class DiscountedItem extends Item {
      // add an instance variable for the discount
      private double discount;

      // Add constructors that call the super constructor
      public DiscountedItem(String items, double price, double offPirce){
        super(items, price);
        this.discount = offPirce;
      }//end constructor method

      /*
       N: GetDiscount / setDiscount method
       P：Retuning count for discount
       I: Discount count
       R: Double
      */
      public double getDiscount() {
        return this.discount;
      }//end getDiscount method

      public void setDiscount(double discountOff){
        this.discount = discountOff;
      }//end setDiscount method
      /*
       N: ToString method
       P：Calling the toString method by using super
       I: Strings
       R: Strings
      */
    // The discount in parentheses using the super.valueToString() method
      public String toString(){
       return (super.toString());
      }//end toString method

}//end class
