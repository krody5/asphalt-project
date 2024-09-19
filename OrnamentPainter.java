import org.code.neighborhood.*;
public class OrnamentPainter extends TreePainter{
  public void drawOrnaments(String color){
    //Draws 3 purple ornaments on tree
    turnRight();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    setPaint(10);
    paint("purple");
    move();
    turnRight();
    move();
    move();
    paint("purple");
    turnRight();
    move();
    move();
    paint("purple");
    turnRight();
    turnRight();
    goCorner();
  }
}