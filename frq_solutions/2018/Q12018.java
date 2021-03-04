import java.util.Scanner;
import java.util.Arrays;
      public class Q12018{
public static void main(String[] args) {

int [][] arr2D ={  {0,1,2},
              {3,4,5},
              {6,7,8},
              {9,5,3} };


  }
   public static int [] getColumn(int [] [] arr2D, int c){

     int array = arr2D.length;
     int result [] = new int[array];
     for(int i = 0; i < array; i++){
       result[i] = arr2D[i][c];
     }
      return result;

}
 public static boolean isLatin( int [][] square){
   if(containsDuplicates(square[] != true)){
     return false;
   }
   for(int i = 0; i < square.length; i++){
     if(hasAllValues(square[],square[i])){
       return false;
     }
   }
   for(int f = 0; f < square.length; f++){
     if(hasAllValues(square[], getColumn(square, f)){
       return false;
     }
   }
 }
}
