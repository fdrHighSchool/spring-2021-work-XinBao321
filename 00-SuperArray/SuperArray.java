import java.util.Scanner;
import java.util.Arrays;

  public class SuperArray{
    Scanner scan = new Scanner(System.in);
    //instance variables

    private int[] array;
    private int numberCount;

  public SuperArray(int length){
    this.array = new int[length];
  } //end specific size array

  public SuperArray(){
    this.array = new int[10];
  } //end superarray

  public void add(int val){

    //Firse case which the array is not filled up yet
    for(int i = 0; i < array.length; i++){
      if(array[i] == 0){
        this.array[this.numberCount] = val;
        this.numberCount++;
        return;
      }
    }
    //Second case occur when the array is filled up and need to make a new one
      int [] array2 = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
         array2[i] = array[i];
      }
      array2[array2.length - 1] = val;
      array = new int[array2.length];
      array = array2;
    } //end first add method

  public void add(int index, int val){

    for(int i = 0; i < array.length; i++){
        int number = array[index];

      if(this.array[index] != 0) {
        this.array[index] = val;
        }
        /*Still trying to figure it out
        //System.out.println(number);
        int [] array2 = new int[array.length + 1];
        //array2[i] = array[i];
        array2[index] = number;
        array2[array2.length - 1] = val;
        array = new int[array2.length];
        array = array2;
      }
      */
}

}//end second add method

  public void grow(int n){
     int growSize = this.array.length;
      this.array = new int[growSize + n];;
  } //end grow method

  public void set(int i, int val){
    if (this.array[i] != 0) {
    this.array[i] = val;
   } //end if the value is not 0
  this.numberCount += i;
  } //end set method

  public boolean isEmpty() {
    for (int i = 0; i < array.length; i++) {
          if(array[i] != 0) {
            return false;
          }
      }
        return true;
    } //end isEmpty method

  public void remove(int index) {

  } //end remove method

  public String toString() {
   return Arrays.toString(this.array);
 } //end toString method
}// end class
