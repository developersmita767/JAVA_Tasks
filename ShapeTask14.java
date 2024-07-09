//	Create an abstract class Shape with an abstract method draw(). Implement this method in subclasses Circle and Rectangle.
package Java_Exercise;

abstract  class Shape {
	 public abstract void draw();
    }
	  
	   class Circle extends Shape
	  {
		 public void draw() {
			  System.out.println("draw a circle");
		  }
		  
		  
	  }
	  class Rectangle extends Shape{
		public void draw() {
			  System.out.println("draw a Rectangle");
		  }
		 
	 }
	public class ShapeTask14{
	public static void main(String[] args) {
		        // Create instances of Circle and Rectangle
		        Circle circle = new Circle();
		        Rectangle rectangle = new Rectangle();

		        // Call the draw method on each instance
		        circle.draw();
		        rectangle.draw();
		

	}
	

}

