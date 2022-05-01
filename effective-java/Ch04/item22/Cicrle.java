package item22;

public class Cicrle extends Figure{
    final double radius;

    public Cicrle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}