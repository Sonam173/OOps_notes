package launch;
class Point{
	private double xCoordinate;
	private double yCoordinate;
	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	 // Method to calculate the distance from the origin (0, 0)
	public double calculateDistance()
	{
		// Calculate the distance using the distance formula from origin (0, 0)
        double distance = Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));// in built method in java 
        // Round off the distance to 2 decimal places
        return Math.round(distance * 100.0) / 100.0;
	}
	// Method to calculate the distance from another point
	public double calculateDistance(Point point)
	{
		 // Calculate the distance using the distance formula
        double distance = Math.sqrt(Math.pow(point.xCoordinate - this.xCoordinate, 2) + Math.pow(point.yCoordinate - this.yCoordinate, 2));
        // Round off the distance to 2 decimal places
        return Math.round(distance * 100.0) / 100.0;
		
	}
	
}
public class Tester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));// point(3.5,1.5)and point(6,4)
        //  ke bich distance
        
        //Create more objects for testing your code   

	}

}
