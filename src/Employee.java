
public class Employee {
    // Поля класса
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;
    // Конструктор класса
    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    // Метод для вывода информации об объекте
    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    // Пример использования класса
    public static void main(String[] args) {
        Employee employee1 = new Employee("Дунчик Раиса Николаевна", "тестировщик", "145raisa.ro9@gmail.com", "+375298288509", 50000, 25);
        employee1.displayInfo();
    }
}
