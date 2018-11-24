import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;


int XPosition =30;
int YPosition = 30;
int xspeed = 7;
int yspeed = 3;
void setup(){
 size(1000, 1000);
 minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("pongg.jpg");
backgroundImage.resize(width, height);
 
}
void draw (){
  image(backgroundImage, 0, 0);
  fill(140, 0, 0);
  stroke(100, 100, 100);
  ellipse( XPosition+=xspeed, YPosition+=yspeed, 50, 50);
  fill(100,100,100);
  rect(mouseX, 910, 100, 60);

  
 if(XPosition>= width){
   xspeed = -xspeed;
 }
 else if (XPosition<=0){
   xspeed = -xspeed;
}
if(YPosition>= height){
   yspeed = -yspeed;
 }
 else if (YPosition<=0){
   yspeed = -yspeed;
}
if(intersects(XPosition, YPosition, mouseX, 910, 100)){
  sound.trigger();
  yspeed = -yspeed;

}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}