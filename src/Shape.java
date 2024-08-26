// Интерфейс для геометрической фигуры
interface Shape {
    String getColor(); // Метод для получения цвета заливки
    String getBorderColor(); // Метод для получения цвета границы

    // Дефолтный метод для расчета периметра
    default double getPerimeter() {
        return 0; // Заглушка для фигур, где периметр не определен
    }

    // Дефолтный метод для расчета площади
    default double getArea() {
        return 0; // Заглушка для фигур, где площадь не определена
    }
}

// Класс для круга
class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Формула для периметра круга
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Формула для площади круга
    }

    @Override
    public String getColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Класс для прямоугольника
class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height); // Формула для периметра прямоугольника
    }

    @Override
    public double getArea() {
        return width * height; // Формула для площади прямоугольника
    }

    @Override
    public String getColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

// Класс для треугольника
class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC; // Формула для периметра треугольника
    }

    @Override
    public double getArea() {
        // Формула Герона для площади треугольника
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String getColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}