//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
  //  public static void main(String[] args) {
//Employee employee1 = new Employee("Дунчик Раиса Николаевна", "Тестировщик", "145raisa.ro9@gmail.com", "+375298288507", 50000, 25);
//  employee1.displayInfo();
// }
//}
// Пример использования класса
        public class Main {
            public static void main(String[] args) {
                // Объявляем массив объектов
                Person[] persArray = new Person[5];
                // Инициализируем каждую ячейку массива объектами
                persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "3435466", 30000, 30);
                persArray[1] = new Person("Petrov Petr", "Manager", "petpetr@mailbox.com", "664524242", 50000, 35);
                persArray[2] = new Person("Sidorov Sidor", "Developer", "sidisid@mailbox.com", "4235364643", 40000, 28);
                persArray[3] = new Person("Kuznetsov Kuzya", "Designer", "kuzkuz@mailbox.com", "353466334", 35000, 32);
                persArray[4] = new Person("Smirnov Smir", "Analyst", "smismir@mailbox.com", "35265356", 45000, 29);

                // Отображаем информацию о всех сотрудниках
                for (Person person : persArray) {
                    person.displayInfo();
                }
            }
        }