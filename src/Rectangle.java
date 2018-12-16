//plik5

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }



    @Override
    double getArea() {  //implementacja abstrakcyjnej metody getArea() zdefiniowanej w klasie Shape
        return length*width;
    }

    public void show(){
        System.out.println(this.getClass().getSimpleName() + " kolor: " + getColor() + " pole: " + getArea());
    }
}
