import java.util.Scanner;
class RectangleArea {
    double length;
    double width;
    double area;


    public void getData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle ( and press enter):");

        length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle ( and press enter):");

        width = scanner.nextDouble();
    }

    public void computeField() {

        area = length * width;
    }

    public void fieldDisplay() {

        System.out.println("The Area of this rectangle is:");

        System.out.println("Area: " + area);
    }
}

public class Main {

    public static void main(String[] args) {

        RectangleArea rectangle = new RectangleArea();

        rectangle.getData();

        rectangle.computeField();

        rectangle.fieldDisplay();
    }
}
