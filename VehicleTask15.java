//	Create an interface Vehicle with a method move(). Implement this interface in classes Car and Bicycle.
package Java_Exercise;



interface  vehicle{
    	  public void move();
     }
    class Car implements vehicle{
    	public void move() {
    		System.out.println("car implement vehicle");
    	}
    	
    	
    }
    class Bicycle implements vehicle{
    	public void move() {
    		System.out.println("bicycle implement vehicle");
    	}
    	
    }
	
     
public class VehicleTask15 {

	public static void main(String[] args) {
	    Car c=new Car();
	    Bicycle b=new Bicycle();
	    c.move();
	    b.move();
	    

	}

}
