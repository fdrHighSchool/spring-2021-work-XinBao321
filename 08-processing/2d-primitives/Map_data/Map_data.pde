PFont myFont;
float progress = 9;
float amt=0;
 
void setup() {
 
  size(500, 400);
  background(236, 90, 19); 
  myFont = createFont("LucidaSansRegular", 20);
  textFont(myFont);
 
  stroke(237, 164, 115);
  line(30, 305, 480, 305);//Bottom line
  line(30, 255, 480, 255);//second 50
  line(30, 205, 480, 205);//three 100
  line(30, 155, 480, 155);//four 150
  line(30, 105, 480, 105);//five 200
  //noStroke();
} 
void draw() {
 
  textSize(15);
  fill(#EDA473);
  text("0", 30, 300);
  text("100", 30, 220);
  text("200", 30, 120);
  text("02", 80, 325);
  text("04", 140, 325);
  text("06", 200, 325);
  text("08", 260, 325);
  text("10", 320, 325);
  text("12", 380, 325);
  text("14", 440, 325);
 
  showLines();
  if (keyPressed&&key=='+')
    progress++;
  if (keyPressed&&key=='-')
    progress--;
}
void showLines() {
  stroke(#E5D7D0);
  strokeWeight(1.25);
  line1( 87, 305, 87, 245);//02 map
 
  line(117, 225, 117, 305);//03
  line(147, 195, 147, 305);//04
  line(177, 145, 177, 305);//05
 
  line(207, 215, 207, 305);//06
  line(237, 220, 237, 305);//07 
  line(267, 120, 267, 305);//08
 
  line(297, 220, 297, 305);//09
  line(327, 195, 327, 305);//10
  line(357, 145, 357, 305);//11
 
  line(387, 225, 387, 305);//12
  line(417, 215, 417, 305);//13
  line(447, 160, 447, 305);//14
}
 
void line1(float a, float y1, float c, float y2) {
  // float x = lerp(x1, x2, i/10.0) + 10;
  float yLerp = lerp(y1, y2, amt);
  //point(x, y);
  line(a, y1, 
    a, yLerp);
  amt+=.01;
  if (amt>=1.0) 
    amt=1.0;
}
