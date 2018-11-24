int x = 0;
int y = 0;
void setup(){
size(1000, 1000);
background(100, 100, 100);

 
  
}

void draw(){
 makeMagical();
  for(int i=0;i<300;i++){
   fill(frameCount, i, 255);
   ellipse(getWormX(i),getWormY(i),20,35);
  }
   if(mousePressed==true){
  for(int i=0;i<300;i++){
     fill(255, frameCount, i);
   ellipse(getWormX(i),getWormY(i),20,35);
 }
   }
  
}


float frequency = 2.00;
float noiseInterval = PI;


 void makeMagical(){
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}