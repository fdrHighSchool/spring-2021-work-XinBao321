
void setup(){
  size(1000, 1000);
   createImage(300,400,RGB);



 
}
 void draw(){
     rect(100,220,300,400);
     circle(100,200,30);
     square(230,321,100);
     triangle(300,345,423,119,600,240);
     strokeWeight(4);
     
  
fill(255, 0, 0, 150); //transparent red
rect(10, 10, 100, 100); //first rectangle
fill(0, 0, 255, 150); //transparent blue
translate(50, 50, 50); //translate x, y and z by 50 pixels
rect(0, 0, 100, 100); //second rectangle (same dimensions as the first one)
line(0, 0, 500, 500);
strokeWeight(10);
arc(273, 318, 25, 25, radians(120), radians(180));
line(260, 287, 260, 310);
rect(308, 575, 35, 40);
triangle(229, 225, 229, 345, 140, 225);
strokeWeight(5);

   }
 
