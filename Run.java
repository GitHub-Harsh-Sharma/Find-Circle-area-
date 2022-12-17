import java.util.*;

abstract class Shape {
    int length, breath;

    public abstract void area();

    public void display() {
        System.out.println("Thank you");
    }
}

class Circle extends Shape {
    public void area() {
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        radius = sc.nextInt();
        float area = (radius * radius) * 3.14f;
        System.out.println("area=" + area);
    }
}

class Run {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.area();
        c.display();
    }
}