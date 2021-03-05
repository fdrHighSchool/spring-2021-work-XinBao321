import java.util.Arrays;
  public class Q12019{
    private boolean [][] lights;

    public LightBoard(int numRows, int numColumns){
      light = new boolean [numRows][numColumns];
      int max = 10;
      int min = 0;
      int range = max - min + 1;

      for(int i = 0; i < numColumns; i++ ){
        for(int f = 0; f < numRows; f++){
          int random = (int)(Math.random() * range) + min;
           //System.out.println(rand);
           if(random >= 4 ){
            return this.lights[numRows,numColumns] false;
          } //end if
        } //end second for loop
      } //end for loop

      boolean [][] lights = this.lights;
    } //end LightBoard method

    public boolean evaluateLight(int row, int col){
      int count;
      for (int i = 0; i < lights.length; i++){
        if(lights[i,col]){
          count++;
        } //end if
      } //end for loop
      if(!this.light[row][col] == true){
        if(count % 3 == 0){
        return true;
      } //end if statement
    } // end if statement
      else if(this.light[row][col]){
        if(count % 2 == 0){
           return false;
    } //end if
  } // end else statement
      return lights[row][col];
    } //end evaluate light method
