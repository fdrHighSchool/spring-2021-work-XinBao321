import java.util.Scanner;
import java.util.Arrays;

  public class GradesDriver{
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      GradesBook Student1 = new GradesBook();
      GradesBook Exams = new GradesBook();
      GradesBook Project = new GradesBook();
      GradesBook Participation = new GradesBook();
      GradesBook Homework = new GradesBook();
      GradesBook Classwork = new GradesBook();

      Exams.addExams(14);
      Exams.addExams(56);
      Exams.deleteExams(2);

      System.out.println("Enter the percentage for exams: ");
      double examsGrades = scan.nextDouble();
      examsGrades /= 100;
      //System.out.println(examsGrades);
      //Participation.addParticipation(89);


       System.out.println("Here are the exams grades: " + Exams.displayExams());
       System.out.println("Average for exams: " + Exams.calculateExams());
       System.out.println("The highest grade in exams is: " + Exams.getHighestExams());
       System.out.println("The percentage for exams are worth: " + Exams.calculateExams() * examsGrades + " percent after the " + examsGrades + " are mutipled by the " + Exams.calculateExams());
    /*
       System.out.println("Here are the project grades: " +   Student1);
       System.out.println("Here are the Participation grades: " + Participation);
       System.out.println("Here are the homework grades: " + Homework);
       System.out.println("Here are the classwork grades: " + Classwork);
       */
    }
 }
