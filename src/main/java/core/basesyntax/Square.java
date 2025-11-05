package core.basesyntax;

public class Square extends Figure {
    private final int side;

    Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getName() + " area: " + getArea()
                + " sq.units, " + side + " units, color: " + getColor());
    }
}
