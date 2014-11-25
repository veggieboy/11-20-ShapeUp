public class Circle 
{ 
  double r; 
  Point center; 
  public Circle() 
  { 
    r=0.0; 
    center.x=0; 
    center.y=0; 
  } 
  public Circle (Point centerPoint, Point circumferencePoint) 
  { 
    center=centerPoint; 
    r=centerPoint.distance(circumferencePoint); 
  } 
  public Circle (Point centerPoint, double radius) 
  { 
    center=centerPoint; 
    r=radius; 
  } 
  public double getRadius() 
  { 
    return r; 
  } 
  public double area() 
  { 
    return Math.PI*r*r; 
  } 
  public double circumference() 
  { 
    return 2*r*Math.PI; 
  } 
  public double diameter() 
  { 
    return 2*r; 
  } 
  public String toString() 
  { 
    return center.toString()+", "+r; 
  } 
  public void translate (int dx, int dy) 
  { 
    center.translate(dx, dy); 
  } 
  public void changeRadius(double dr) 
  { 
    r+=dr; 
  } 
} 
