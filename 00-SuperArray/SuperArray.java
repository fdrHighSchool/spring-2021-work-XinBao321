import java.util.Scanner;
import java.util.Arrays;

  public class SuperArray{
    //instance variables
    private int[] array;
    private numberCount;

  public SuperArray(){
    this.array = new int[10];
  } //end superarray

  public void add(int val){

  } //end first add method

  public void add(int index, int val){
    this.array[index] = val;
  } //end second add method

  public void grow(int n){

  } //end grow method

  public void set(int i, int val){

  } //end set method

  public boolean isEmpty() {
  return true;

  } //end isEmpty method

  public void remove(int index) {

  } //end remove method

  public String toString() {
   return Arrays.toString(this.array);
 } //end toString method
}// end class
