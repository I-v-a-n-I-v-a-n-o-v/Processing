/**
 * Distance 1D. 
 * 
 * Move the mouse left and right to control the 
 * speed and direction of the moving shapes. 
 */
 
float xpos1;
float xpos2;
float xpos3;
float xpos4;
int thin = 8;
int thick = 36;
float alpha;


void setup() 
{
  size(640, 360);
  noStroke();
  xpos1 = random(width/2, width/1.8);
  xpos2 = random(width/2, width/1.4);
  xpos3 = random(width/2, width/1.5);
  xpos4 = random(width/2, width/1.3);
}


void draw() 
{
  background(0);
  
  float mx = mouseX * 0.4 - random(width/5, width/4);
  
  fill(102);
  rect(xpos2, 0, thick, height/2);
  fill(204);
  rect(xpos1, 0, thin, height/2);
  fill(102);
  rect(xpos4, height/2, thick, height/2);
  fill(204);
  rect(xpos3, height/2, thin, height/2);
  
  xpos1 += mx/16;
  xpos2 += mx/64;
  xpos3 -= mx/16;
  xpos4 -= mx/64;
  
  if(xpos1 < -thin)  { xpos1 =  width; }
  if(xpos1 >  width) { xpos1 = -thin; }
  if(xpos2 < -thick) { xpos2 =  width; }
  if(xpos2 >  width) { xpos2 = -thick; }
  if(xpos3 < -thin)  { xpos3 =  width; }
  if(xpos3 >  width) { xpos3 = -thin; }
  if(xpos4 < -thick) { xpos4 =  width; }
  if(xpos4 >  width) { xpos4 = -thick; }
  
  alpha = +0.5;
  
  saveFrame("frames01/#####.png");
  if(alpha>=180) exit();
}
