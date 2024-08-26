

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        // Вывод информации о фигурах
        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Цвет заливки: " + circle.getColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());

        System.out.println("\nПрямоугольник:");
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Цвет заливки: " + rectangle.getColor());
        System.out.println("Цвет границы: " + rectangle.getBorderColor());

        System.out.println("\nТреугольник:");
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Цвет заливки: " + triangle.getColor());
        System.out.println("Цвет границы: " + triangle.getBorderColor());
    }
}