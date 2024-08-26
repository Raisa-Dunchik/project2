class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        // Переопределится в подклассах
    }

    public void swim(int distance) {
        // Переопределится в подклассах
    }
}

class Dog extends Animal {
    private static int dogCount = 0;
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть больше 10 м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private String name;
    private boolean isFull;

    public Cat(String name) {
        super();
        this.name = name;
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean eat(FoodBowl foodBowl) {
        int foodAvailable = foodBowl.getFoodAmount();
        if (foodAvailable > 0) {
            foodBowl.decreaseFood(1); // Один кот съедает одну порцию еды
            isFull = true;
            System.out.println(name + " покушал и теперь сыт.");
            return true;
        } else {
            System.out.println(name + " не может покушать, в миске недостаточно еды.");
            return false;
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0; // Не может быть отрицательной еды
        } else {
            this.foodAmount = initialFood;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (amount > 0) {
            foodAmount = Math.max(foodAmount - amount, 0); // Не допускаем отрицательной еды
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount; // Добавляем еду в миску
            System.out.println("Добавлено " + amount + " еды в миску.");
        }
    }
}

