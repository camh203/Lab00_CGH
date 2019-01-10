
public class Circle {

	private double radius; // variable for the radius

	public Circle() {
		
		radius = 1.0;
		
	}// End Empty Circle Constructor

	public Circle(double radius) {
		
		setRadius(radius);
		// or this.setRadius(radius);
	}// End preferred constructor

	public double calculateArea() {
		
		return Math.PI * Math.pow(radius, 2);
		
	}// End calculateArea

	/**
	 * This method returns the value of the radius
	 * 
	 * @return - radius returns the value of the radius
	 */

	public double getRadius() {
		return radius;
	}// End radius

	/**
	 * This method sets the value of the radius. The method bounds checks the radius
	 * > 1.0
	 * 
	 * @param radius
	 */

	public void setRadius(double radius) {
		
		if(radius >= 1.0)
			this.radius = radius;
		else
			this.radius = 1.0;
	}// End setRadius

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}//End toString
	
	
	}

