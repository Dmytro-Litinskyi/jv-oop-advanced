package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndexOfFigureType = random.nextInt(FigureType.values().length);
        String randomFigureType = FigureType.values()[randomIndexOfFigureType].name();

        switch (randomFigureType) {
            case "CIRCLE" : {
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER));
            }
            case "ISOSCELES_TRAPEZOID" : {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            }
            case "RECTANGLE" : {
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            }
            case "RIGHT_TRIANGLE" : {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_NUMBER),
                        random.nextInt(MAX_RANDOM_NUMBER));
            }
            default: return new Square(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_RANDOM_NUMBER));
        }
    }

    public Figure getDeafaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
