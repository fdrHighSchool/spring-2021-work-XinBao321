import java.util.Arrays;
  public class WhitePixels{

  }
  //Part a
  public int countWhitePixel(){
    int count = 0;

    for(int col = 0; col < pixelValues.length; col++){
      for(int row = 0; row < pixelValues[col].length; row++){
        if(pixelValues[col][row] == WHITE){
          count++;
        }
      }
    }
     return count;
  }
  //I rated myself a 4
  //For the student example I think the student  should have gotten a 4

  //Part b
public void processImage(){
  for(int i = 0; pixelValues.length - 2; i++ ){
    for(int f = 0; pixelValues.length -2; f++){
      pixelValues[i][f] = pixelValues[i+2][f+2];
        if(pixelValues[i][f] < BLACK){
          pixelValues [i][f] == BLACk);
        }
    }
  }
}
 //I rated myself a 3
 //For the student example I think the student should have gotten a 2 or 1
