PImage rainbow;
PImage unicorn;
void setup(){
rainbow=loadImage("download.jpeg");
unicorn=loadImage("DAB.jpeg");
size(1000,1000);
rainbow.resize(1000,1000);
}
void draw(){
background(rainbow);
ellipse(mouseX,mouseY,100,100);
image(unicorn,mouseX,mouseY);
}