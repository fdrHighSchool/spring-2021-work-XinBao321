final int TEAMS = 3;
final int NUMBER_BALLS = 21;
 
float[] ballSize = new float[ NUMBER_BALLS ];
 
float[] ballX = new float[ NUMBER_BALLS ], 
        ballY = new float[ NUMBER_BALLS ];
 
int colour;
color[] colarray = new color[NUMBER_BALLS];{
 
}
void setup() {
  size(500, 500);
  randomizeBall(ballX, ballY, ballSize, colarray);
}
void randomizeBall(float ballx[], float bally[],float ballsize[],int colours[]) {
  for ( int i = 0; i < NUMBER_BALLS; i++ ) {
    ballsize[i] = random(5,45);
    ballx[i] = random(25, width-35);
    bally[i] = random(25, height-35);
    colours[i] = int(random(0,2));
    colours[0] = color(0,0,255);
    colours[1] = color(0,255,0);
    colours[2] = color(255,0,0);
  }
}
 
void drawAllPlayers() {
 
  for (int i = 0; i < NUMBER_BALLS; i++) {
    fill(colarray[i]);
    ellipse(ballX[i], ballY[i], ballSize[i], ballSize[i]);
 
  }
}
 
void draw() {
  background(125);
  drawAllPlayers();
}
