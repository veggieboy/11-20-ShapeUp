11-20-ShapeUp
================

## Objectives
- Understand how to represent an object's state as *fields*
- Understand how to represent an object's behavior as instance *methods*
- Be able to implement a class with *multiple constructors, Accessors and Mutators*

## Assignment - Due Monday morning 11/24 before class

Every class should be placed into its own file!  

In the directory "src", you will find five files:
- ShapeUp.java: Main Program - **DO NOT** modify this file 
- Point.java: Modify the Point class you created last night
- Line.java: A Line object represents a line defined by a pair of Points
- Circle.java: A Circle object represents a circle defined by a center point and a radius
- Rectangle.java: A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height


**class Point** (Point.java): use the code you created on 11/19 and add two constructors:
- 1: no parameters, constructs a new Point object with location (0, 0)
- 2: takes two integer parameters, constructs a new Point object with location (X, Y)
	
**class Line** (Line.java): create a new class Line
- Fields:
	- Point start
	- Point end
- Constructors:
	- 1: no parameters, constructs a new Line object with start & end at (0, 0)
	- 2: two Point parameters, constructs a new Line object with Point parameters startPoint,endPoint
- Accessors:
	- length (double): no parameters, returns the length of this line (the distance between the start and end Points - HINT: consider using Point's distance() method)
	- slope (double): no parameters, returns the slope of this line i.e. y1-y2/x1-x2
	- toString (String): no parameters, returns a String representation of this line as `[(x1, y1), (x2, y2)]` (HINT: make use of Point's toString() method)
- Mutators:
	- translate (void): takes two integer parameters, adds the value of the first parameter to the X value of each end point and adds the value of the second parameter to the Y value of each end point
	
**class Circle** (Circle.java): create a new class Circle
- Fields:
	- Point center
	- double radius
- Constructors:
	- 1: no parameters, constructs a new Circle object with start & end at (0, 0)
	- 2: two Point parameters, constructs a new Circle object with Point parameters centerPoint, circumferencePoint (HINT: radius is the distance between the two Points - what method can we do this with?)
	- 3: one Point parameter & one double parameter, constructs a new Circle object with Point parameter center and radius of second parameter
- Accessors:
	- getRadius (double): no parameters, returns the radius of this circle 
	- area (double): no parameters, returns the area of this Circle
	- circumference (double): no parameters, returns the circumference of this Circle
	- diameter (double): no parameters, returns the diameter of this Circle
	- toString (String): no parameters, returns a String representation of this line as `[(x, y), radius]` (HINT: make use of Point's toString() method)
- Mutators:
	- translate (void): takes two integer parameters, adds the value of the first parameter to the X value of each end point and adds the value of the second parameter to the Y value of each end point
	- changeRadius (void): takes one double parameter, changes the radius of this Circle by adding the value of the parameter to radius

**class Rectangle** (Rectangle.java): create a new class Rectangle
- Fields:
    - Point origin;
    - int width;
    - int height;
- Constructors:
	- 1: no parameters, constructs a new Rectangle object with location (0, 0) and height, width = 0
	- 2: two Point parameters, constructs a new Rectangle object with bottomLeft location (X1, Y1) &  topRight location (X2, Y2)
	- 3: one Point parameter & two integer parameters, constructs a new Rectangle object with bottomLeft location (X, Y) of width & height
- Accessors:
	- getBottomLeft (Point): no parameters, returns the origin (bottom left Point) of this Rectangle 
	- getTopRight (Point): no parameters, returns the top right Point of this Rectangle 
	- getHeight (integer): no parameters, returns the height of this Rectangle
	- getWidth (integer): no parameters, returns the width of this Rectangle
	- area (double): no parameters, returns the area of this Rectangle
	- diagonal (double): no parameters, returns the diagonal of this Rectangle
	- perimeter (integer): no parameters, returns the perimeter of this Rectangle
	- isSquare (boolean): no parameters, returns true if this rectangle is square
	- toString (String): no parameters, returns a String representation of the rectangle's bottom left and top right points in the form: `[(x1, y1), (x2, y2)]` (HINT: make use of Point's toString() method and this.getTopRight())
- Mutators:
	- translate (void): takes two integer parameters, adds the value of the first parameter to the X value of each end point and adds the value of the second parameter to the Y value of each end point
	- scale (void): takes two integer  parameter, scales this Rectangle by adding dx to width and dy to height

	
## Output
Your output when running *ShapeUp* should be identical to [output.txt](./output.txt)...
```
p1 is (2, 2)
p1 distance from origin = 2.8284271247461903
p2 is (8, 8)
p2 distance from origin = 11.313708498984761
distance between p1 & p2 = 8.48528137423857
----------------------------------------------
line is [(2, 2), (8, 8)]
line's length = 8.48528137423857
line's slope = 1.0
----------------------------------------------
circle is [(2, 2), 8.48528137423857]
circle's radius = 8.48528137423857
circle's area = 226.19467105846505
circle's circumference = 53.314595257900386
circle's diameter = 16.97056274847714
add 3.5 to circle's radius -------------------
circle's radius = 11.98528137423857
circle's area = 451.2802644675914
circle's circumference = 75.30574383302894
circle's diameter = 23.97056274847714
----------------------------------------------
rectangle is [(2, 2), (8, 8)]
rectangle's bottom left Point = (2, 2)
rectangle's top righ Point = (8, 8)
rectangle's height = 6
rectangle's width = 6
rectangle's area = 36.0
rectangle's diagonal = 8.48528137423857
rectangle's perimeter = 24
rectangle's square = true
add 3 to x and 5 to y to scale rectangle -----
rectangle is [(2, 2), (11, 13)]
rectangle's bottom left Point = (2, 2)
rectangle's top righ Point = (11, 13)
rectangle's height = 11
rectangle's width = 9
rectangle's area = 99.0
rectangle's diagonal = 14.212670403551895
rectangle's perimeter = 40
rectangle's square = false
```

## Reading
Read Section 8.4 Encapsulation in Chapter 8 of [Building Java Programs](http://basisphoenix.azurewebsites.net/wp-content/uploads/2014/08/Building-Java-Programs-A-Back-to-Basics-Approach-2nd-Ed.pdf).

## Previous Homework - 11/10 ArrayLists
[View Solution](https://github.com/viperguynaz/11-10-ArrayLists/blob/c2343877a0292fab5b8551cf8464025fa4e6de1f/WordCount.java)
