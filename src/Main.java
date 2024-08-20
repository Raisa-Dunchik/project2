
        // Тестирование класса Park
        public class Main {
        public static void main(String[] args) {
            Park amusementPark = new Park();

            // Добавляем аттракционы
            amusementPark.addRide("Ferris Wheel", "10:00 - 22:00", 5.0);
            amusementPark.addRide("Roller Coaster", "10:00 - 20:00", 7.0);
            amusementPark.addRide("Merry-Go-Round", "10:00 - 21:00", 3.0);

            // Отображаем информацию о всех аттракционах
            amusementPark.displayRides();
        }
}