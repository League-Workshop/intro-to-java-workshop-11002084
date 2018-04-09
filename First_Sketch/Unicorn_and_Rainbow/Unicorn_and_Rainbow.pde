PImage rainbow;
PImage unicorn;
void setup(){
  size(800,600);
  rainbow=loadImage("Rainbow.jpeg");
  rainbow.resize(800,600);
background(rainbow);}
void draw(){
  unicorn=loadImage("Unicorn.png");
  image(unicorn, 400,300);
  
}