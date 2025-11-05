package core.basesyntax;

public class Rectangle extends Figure {
    private final int shorterSide;
    private final int longerSide;

    Rectangle(String color, int shorterSide, int longerSide) {
        super(color);
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
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
        return shorterSide * longerSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + " area: " + getArea()
                + " sq.units, " + shorterSide + " units, "
                + longerSide + " units, color: " + getColor());
    }
}
