import java.util.Scanner;
import java.util.Arrays;

  public class GradesBook{


      //instance variables
    private  SuperArray exams;
    private  SuperArray participation;
    private  SuperArray project;
    private  SuperArray homework;
    private  SuperArray classwork;

    public GradesBook(){
      this.exams = new SuperArray();
      this.participation = new SuperArray();
      this.project = new SuperArray();
      this.homework = new SuperArray();
      this.classwork = new SuperArray();
    }

    public void addExams(int val){
      this.exams.add(val);
    } //end addExams


    public void deleteExams(int val){
      this.exams.remove(val);
    } //end deleteExams

    public void addParticipation(int val){
      this.participation.add(val);
    } //end addParticipation

    public String displayExams(){
       return this.exams.toString();
    } //end displayExams
    public void setExams(int i, int val){

      this.exams.set(i, val);
    } // end set exams

    public int calculateExams(){
      int sum = 0;
      //Add the numbers inside the superarray and caculate the average for exams
      for(int i = 0; i < this.exams.getSize(); i++){
         sum += this.exams.getValue(i);
         //System.out.println(sum);

      } //end for loop

        return sum / this.exams.getSize();
    } //end calculateExams

    public int getHighestExams(){
      //for loop that checks for the highest grade inside the superarray and return it
      int highestGrade = this.exams.getValue(1);
       for(int i = 0; i < this.exams.getSize(); i++ ){
        for(int grade = this.exams.getValue(0); grade < 10; grade++){
           System.out.println(grade);
          if(grade > highestGrade)
           highestGrade = grade;
        }
       }
       return highestGrade;
    }
  } //end class
