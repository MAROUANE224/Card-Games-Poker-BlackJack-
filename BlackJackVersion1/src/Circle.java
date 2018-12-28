

public class Circle { 
	
	public static void main (String[] args) {
		Circle spot = new Circle();
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle area: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
	}
	private static final double PI = 3.14; 
	private double radius; 
/**  
 * * constructor  
 * * pre: none 
 *  * post: A Circle object created. 
 *  Radius initialized to 1.  */
public Circle() {  
	radius = 1;   //default radius } 
}
/**   
 * * Changes the radius of the circle.  
 * * pre: none  
 * * post: Radius has been changed.  */ 

public void setRadius(double newRadius) {   
	radius = newRadius; 
	}
/**   
 * * Calculates the area of the circle.  
 * * pre: none  
 * * post: The area of the circle has been returned.  */ 

public double area() {   
	double circleArea;      
	circleArea = PI * radius * radius;  
	return(circleArea); 
	}

public double circumference() {   
	double circlecircumfernence;      
	circlecircumfernence = 2 * PI * radius;  
	return(circlecircumfernence); 
	}

/**   
 * * Returns the radius of the circle.  
 * * pre: none  * post: The radius of the circle has been returned.  */

public double getRadius() {   
	return(radius); } 
}

