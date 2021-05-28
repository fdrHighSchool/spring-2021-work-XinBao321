import static javax.swing.JOptionPane.*;
void setup() {
  size(1250,750);
  frameRate(14);
  }
  void draw(){
    String input = showInputDialog("Type in integer number...");
    int num = parseInt(input == null? "" : input, MIN_INT);
 
    if (input == null)  showMessageDialog(null, "You didn't enter anything!", "Alert", ERROR_MESSAGE);
    else if (num == MIN_INT)  showMessageDialog(null, "Entry \"" + input + "\" isn't a number!", "Alert", ERROR_MESSAGE);
    else showMessageDialog(null, "Number " + num + " has been registered.", "Info", INFORMATION_MESSAGE);
 
for(int i = 0 ; i < 5 ; i++) {
 
 
 
 
  background(random(125,175),random(125,175),random(125,175));  //sets colour of canvas, ideally in rgb
 
  fill (random (150,255));
 
  float X = random(num,num+400);
  float Y = random(num,num+450);
 
  rect(X,Y,150,750);
 
}
    
    
  }
