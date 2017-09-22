package Lesson7.point;

public class App {

    public static void main(String[] args) {

        Point pointA1 = new Point(1,2);
        Point pointA2 = new Point(2,4);
        Point pointB1 = new Point(-1,2);
        Point pointB2 = new Point(0,3);

        Rectangle rectangle1 = new Rectangle(pointA1, pointA2);
        Rectangle rectangle2 = new Rectangle(pointB1, pointB2);

        intersect(rectangle1, rectangle2);


    }

    public static void intersect(Rectangle rectA, Rectangle rectB){

        if(rectA.getPoint1().getX() < rectB.getPoint2().getX() &&
                rectA.getPoint2().getX() > rectB.getPoint1().getX() &&
                rectA.getPoint2().getY() > rectB.getPoint1().getY() &&
                rectA.getPoint1().getY() < rectB.getPoint2().getY())
        {
            System.out.println("Прямоугольники пересекаются.");
        }
        else {
            System.out.println("Прямоугольники не пересекаются.");
        }
    }
}
