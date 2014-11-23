public class Point
{
  int x;
  int y;
  
  public int getX()
  {
    return x;
  }
  
  public int getY()
  {
    return y;
  } 
  
  public void setX(int val)
  {
    x=val;
  }
  
  public void setY(int val)
  {
    y=val;
  }
  
  public void translate (int dx, int dy)
  {
    x+=dx;
    y+=dy;
  }
  
  public double distanceFromOrigin()
  {
    return Math.sqrt(x*x+y*y);
  }
  
  public double distance(Point p2)
  {
    return Math.sqrt((x-p2.getX())*(x-p2.getX())+(y-p2.getY())*(y-p2.getY()));
  }
  
  public String toString()
  {
    return "("+x+", "+y+")";
  }
}

