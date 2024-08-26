
public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(150);
        dogBobik.swim(5);

        Cat catMurzik = new Cat("Мурзик");
        catMurzik.run(180);
        catMurzik.swim(5);

        FoodBowl foodBowl = new FoodBowl(5); // Изначально в миске 5 порций еды
        Cat[] cats = {new Cat("Мурзик 1"), new Cat("Мурзик 2"), new Cat("Мурзик 3")};

        for (Cat cat : cats) {
            cat.eat(foodBowl);
        }

        System.out.println("В миске осталось еды: " + foodBowl.getFoodAmount() + " порций.");
        for (Cat cat : cats) {
            System.out.println(cat.isFull()); // Вместо cat.name
        }

        // Печать количества животных
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
    }
}