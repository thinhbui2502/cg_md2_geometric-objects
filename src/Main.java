public class Main {
    public static void main(String[] args) {
        //Test Shape
        Shape shape = new Shape();
        System.out.println(shape.toString());

        Shape shape1 = new Shape("blue",false);
        System.out.println(shape1.toString());

        //Test circle
        Shape circle1 = new Circle(3,"black", true);
        System.out.println(circle1.toString());


        //Test Rectangle
        Shape rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());

        //Test Square
        Shape square1 = new Square();
        System.out.println(square1);
    }
}
