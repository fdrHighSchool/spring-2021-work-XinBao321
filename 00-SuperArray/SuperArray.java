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
    //Defult numbers inside an array
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
      int [] array2 = new int[array.length + 5];
        for(int i = 0; i < array.length; i++){
         array2[i] = array[i];
      }
      array2[array2.length - 1] = val;
      array = new int[array2.length];
      array = array2;
    } //end first add method

  public void add(int index, int val){
    int []array2 = new int[array.length + 5];

        for (int i = 0; i < index; i++) {
            array2[i] = array[i];
        }
        array2[index] = val; // put value in specific index

        for (int i = index; i < array.length; i++) {
            array2[i + 1] = array[i];
        }
        array = new int[array2.length]; // increased the array
        array = array2;
}//end second add method

  public void grow(int n){
      int [] array2 = new int[array.length + n];
      //Copying all values
      for (int i = 0; i < array.length; i++) {
           array2[i] = array[i];
       }
       this.array = array2;
  } //end grow method

  public void set(int i, int val){
    if (this.array[i] != 0) {
    this.array[i] = val;
   } //end if the value is not 0
  this.numberCount += i;
  } //end set method

  public boolean isEmpty() {
    //Check if the array have any numbers
    for (int i = 0; i < array.length; i++) {
          if(array[i] != 0) {
            return false;
          }
      }
        return true;
    } //end isEmpty method

  public void remove(int index) {
    if (index < this.numberCount) {
      for (int i = index; i < this.numberCount - 1; i++) {
        this.array[i] = this.array[i + 1];
      } //end for loop
      this.numberCount--;
    }
  } //end remove method
  public int getValue(int index) {
       return array[index]; // return value
   }
  public String toString() {
   return Arrays.toString(this.array);
 } //end toString method

 public int getSize() {
   //the array.length method for the superarray
   return this.numberCount;
 } //end getSize()
}// end class
