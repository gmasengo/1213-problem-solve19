import java.util.Scanner;
import java.awt.Rectangle;


public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        int width = input.nextInt();
        System.out.print("Enter width: ");
        int height = input.nextInt();
        Rectangle box1 = new Rectangle(10, 10, 30, 40);
        Rectangle box2 = new Rectangle(10,10, width , height);
        System.out.println("box1: " + box1);

         int expectedArea = width * height;
         int area = width * height;
         if (area == expectedArea) {
     System.out.println("++++ Test passed: Area is correct.");
 } else {
     System.out.println("---- Test failed: Expected " + expectedArea + " but got " + area);
 }

    }

}