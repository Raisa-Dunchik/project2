class Person {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;
        // Конструктор
        public Person(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        // Метод для отображения информации о сотруднике
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Position: " + position);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + age);
            System.out.println("-----------------------------");
        }
    }
