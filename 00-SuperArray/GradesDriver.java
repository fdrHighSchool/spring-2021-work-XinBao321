import java.util.Scanner;
import java.util.Arrays;

  public class GradesDriver{
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      SuperArray Student1 = new SuperArray(5);
      SuperArray Exams = new SuperArray(4);
      SuperArray Project = new SuperArray(3);
      SuperArray Participation = new SuperArray(5);
      SuperArray Homework = new SuperArray(6);
      SuperArray Classwork = new SuperArray(4);

      Exams.add(14);
      Exams.add(56);
      Project.add(57);
      Project.add(99);
      Participation.add(87);
      Participation.add(69);
      Homework.add(77);
      Homework.add(96);
      Classwork.add(89);
      Classwork.add(99);
      Homework.remove(1);
      


       Student1.add(55);
       Student1.add(100);
       Student1.grow(5);

       System.out.println("Here are the exams grades: " + Exams);
       System.out.println("Here are the project grades: " + Student1);
       System.out.println("Here are the Participation grades: " + Participation);
       System.out.println("Here are the homework grades: " + Homework);
       System.out.println("Here are the classwork grades: " + Classwork);
    }
 }
