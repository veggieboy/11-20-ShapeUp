public class Line
{
  Point Start;
  Point End;
  
  public Line ()
  {
    Start=new Point();
    End=new Point ();
  }
  
  public Line (Point start, Point end)
  {
    start=new Point();
    end=new Point();
  }
  
  public double distance()
  {
    return Math.sqrt((Start.getX()-End.getX())*(Start.getX()-End.getX())+(Start.getY()-End.getY())*(Start.getY()-End.getY()));
  }
  
  public double slope()
  {
    return (End.getY()-Start.getY())/(End.getX()-Start.getX());
  }
  
  public String toString()
  {
    return "[("+Start.getX()+", "+End.getY()+")"+", "+"("+Start.getX()+", "+End.getY()+")]";
  }
  
  public void translateLine(int dx, int dy)
  {
    Start.translate(dx, dy);
    End.translate(dx, dy);
  }
}
