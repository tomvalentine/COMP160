import java.awt.*;
import java.util.*;

public class Shape{
  
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  /** Shape contructor method */
  public Shape() {
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0, (400-width));
    y = randomRange(0, (400-height));
    colour = new Color(randomRange(0, 255), randomRange(0, 255),randomRange(0, 255));
  }
  
  /** rand number method */ 
  public int randomRange( int lo, int hi ){
    Random generator = new Random();
    return generator.nextInt(hi-(lo+1)) + lo;
  }
  /** display method for setting the solour and size of object */
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}
  


