import java.util.ArrayList;
import java.util.List;

public class Park {
    // Список аттракционов
    private List<Ride> rides;

    // Конструктор
    public Park() {
        rides = new ArrayList<>();
    }

    // Метод для добавления аттракциона
    public void addRide(String name, String workingHours, double price) {
        rides.add(new Ride(name, workingHours, price));
    }

    // Метод для отображения информации о всех аттракционах
    public void displayRides() {
        for (Ride ride : rides) {
            ride.displayInfo();
        }
    }

    // Внутренний класс Ride
    private class Ride {
        private String name;
        private String workingHours;
        private double price;

        // Конструктор
        public Ride(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для отображения информации об аттракционе
        public void displayInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Price: " + price + " currency units");
            System.out.println("-----------------------------");
        }
    }
}
