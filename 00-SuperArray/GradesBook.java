import java.util.Scanner;
import java.util.Arrays;

  public class GradesBook{


      //instance variables
      SuperArray exams;
      SuperArray participation;
      SuperArray project;
      SuperArray homework;
      SuperArray classwork;

    public GradesBook(){
      this.exams = new SuperArray;
      this.participation = new SuperArray;
      this.project = new SuperArray;
      this.homework = new SuperArray;
      this.classwork = new SuperArray;
    }




  public void fillArray() {
        for (int i = 0; i < this.array.length; i++) {
          this.array[i] = (int)(Math.random() * 46 + 55);
         }// end for loop
       }// end fillArray method


  } //end class
