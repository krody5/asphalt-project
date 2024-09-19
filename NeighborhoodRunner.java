import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
    //creates a mural painter 
    MuralPainter mp = new MuralPainter();
    //creates a tree painter
    TreePainter tp = new TreePainter ();
    //creates an ornament painter 
    OrnamentPainter op = new OrnamentPainter ();

       //paints background
       mp.paintBackground ("lightskyblue", 14);
    //draws tree
       tp.drawEntireTree();
    //draws ornaments 
      op.drawOrnaments("purple");
    
       
    

    
  }
}