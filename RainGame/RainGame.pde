
int YPosition = 0;
 int XPosition ;
void draw(){
  background(100, 100, 100);
  fill(0, 0, 150);
  stroke(100, 100, 100);
  ellipse(XPosition, YPosition+=10, 50, 75);
  fill(0, 100, 120);
  rect(mouseX, 850, 120, 150);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  



if (YPosition >= height){
 checkCatch(XPosition);
  YPosition = 0;
  XPosition = (int) random(width);
  
}
}
int score =0;

void setup(){
  size(1000, 1000);
  XPosition = (int) random(width);
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100){
          score++;
     }
     else if (score > 0){ 
          score--;
     }
     println("Your score is now: " + score); }
     