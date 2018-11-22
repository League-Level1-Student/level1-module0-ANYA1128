int XPosition =30;
int xspeed = 3;
void setup(){
 size(1000, 1000);
 background(100, 100, 100);
}
void draw (){
  fill(140, 0, 0);
  stroke(100, 100, 100);
  ellipse( XPosition+=xspeed, 30, 50, 50);
 if(XPosition>= width){
   xspeed = -xspeed;
 }
 else if (XPosition<=width){
   xspeed = -xspeed;
}

}