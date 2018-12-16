//plik4

abstract public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    abstract double getArea();  // nie dostarczamy ciala klasy // to jest metoda getArea()

}
