import java.util.Scanner;

public class RectangleArea
{ 
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your lenth of your rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter your width  of your rectangle: ");
        double width= input.nextDouble();

        double area= length *width;
        System.out.println("The are of rectangle is eqaul: " + area +" Square metre");
    }
}