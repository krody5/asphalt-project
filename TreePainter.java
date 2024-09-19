import org.code.neighborhood.*;
public class TreePainter extends PainterPlus {
  public void drawTree(){ 
    drawEntireTree();
  }
  public void drawEntireTree(){
    //paints tree trunk
     turnRight(); 
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    setPaint(100);
    paint("brown");
    move();
    paint("brown");
    turnLeft();
    move();
    turnLeft();
    turnLeft();
    turnLeft();
    move();
    move();
    //begins to paint bottom of tree
    setPaint(200);
    paint("green");
    turnLeft();
    turnLeft();
    move();
    paint("green");
    move();
    paint("green");
    move();
    paint("green");
    move();
    paint("green");
    move();
    paint("green");
    turnRight();
    move();
    turnRight();
    move();
    paint("green");
    move();
    paint("green");
    move();
    paint("green");
    move();
    paint("green");
    move();
    turnLeft();
    move();
    paint("green");
    turnLeft();
    //while statement
    while (hasPaint()) {
      paint("green");
//if statement
      if (canMove()) {
        move();
      }
    }
    setPaint(20);
    turnRight(); 
    move(); 
    turnRight();
    move(); 
    paint("green");
    move();
    paint("green");
    move();
    paint("green");
    turnLeft();
    move();
    turnLeft();
    paint("green");
    move();
    paint("green");
    move();
    paint ("green");
    turnRight();
    move();
    turnRight();
    move();
    paint("green");
    goCorner();
  }
  //moves paint to the corner
  public void goCorner(){
    while (canMove()){
      move();
    }
    turnRight();
    while (canMove()){
      move();
    }
  }
}
