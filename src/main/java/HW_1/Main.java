package HW_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        // add list exit

        while (true){
            System.out.println("add/list/exit:");
            Command team;
            try {
                team = Command.valueOf(sc.next().toUpperCase().trim());
            } catch (IllegalArgumentException ix){
                System.out.println("Неверная команда!");
                team = Command.ERROR;
            }

            switch (team){
                case ADD:
                    System.out.println("Какое животное? Cat/ Dog/ Duck");
                    String choice = sc.next();
                    if (choice.equals("Cat")){
                        Cat cat = new Cat();
                        fillAnimal(sc, cat);
                        cat.say();
                        animals.add(cat);

                    } else if (choice.equals("Dog")){
                        Dog dog = new Dog();
                        fillAnimal(sc, dog);
                        dog.say();
                        animals.add(dog);

                    } else if (choice.equals("Duck")){
                        Duck duck = new Duck();
                        fillAnimal(sc, duck);
                        duck.say();
                        animals.add(duck);
                    }
                    break;
                case LIST:
                    for (Animal animal: animals){
                        System.out.println(animal);
                    }
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Неправильная команда");
            }
        }
    }
    private static void fillAnimal(Scanner scanner, Animal animal){
            System.out.println("Введите имя:");
            String name = scanner.next();
            System.out.println("Введите возраст:");
            int age = scanner.nextInt();
            System.out.println("Введите вес:");
            int weight = scanner.nextInt();
            System.out.println("Введите цвет:");
            String color = scanner.next();

            animal.setName(name);
            animal.setAge(age);
            animal.setWeight(weight);
            animal.setColor(color);
    }
}
