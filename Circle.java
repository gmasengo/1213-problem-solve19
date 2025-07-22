import java.awt.Color;

/**
 * This class describes a circle with a given radius and color.
 *This is my private solutionto problem Solve 19
 * @author Guylain Masengo
 * 
 * @version 2025 July 15
  */

public class Circle { 
    
    /**
     * // private instance variable, not accessible from outside this class
     */
    
    private double radius;
    private Color color;
    private double area;



    /**
     * 
    /  The default constructor with no argument.
    / It sets the radius to 1 and color to red
     */

    

    public Circle() {
        radius = 1.0;
        this.color = new Color(255,119,65);
    }
    




    /**
     *  2nd constructor with given radius and color
     * @param the r of the circle;
     * @param the clr of the circle 
     */
    
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /**
     *  A public method for retrieving the radius
     * @return radius;
     */
    
    public double getRadius() {
        return radius;
    }



    /**
     * A public method for retrieving the color of circle
     * @return  color
     */
    
    public Color getColor() {
        return color;
    }


    /**
     * A public method for retrieving the area of circle
     * @return area
     */
    
    public double getArea() {
        calculateArea();
        return area;
    }

    /**
     * A private method for computing the area of circle
     */
     
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
