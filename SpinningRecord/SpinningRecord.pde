import ddf.minim.*;
PImage pictureOfRecord;
Minim minim;
AudioPlayer song;

int imageAngle = 0;
void setup(){
size(600,600); 
pictureOfRecord= loadImage("record.jpg");
pictureOfRecord.resize(height,width); 
minim = new Minim (this);
song = minim.loadFile("hehe.mp3", 512);
}
void draw(){
  rotateImage(pictureOfRecord, imageAngle);
  image(pictureOfRecord, 0, 0);
  if(mousePressed){
    imageAngle+=30;
    song.play();
  }
    else{
      song.pause();
    }
  
  }

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}

    