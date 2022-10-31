package HW_1;

public class Animal {

    //Свойства
    protected String name;
    protected int age;
    protected String color;
    protected int weight;
    public Animal() {
    }

    // Метод Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Преопределение методов

    public void say(){
        System.out.println("Я говорю");
    }
    public void go(){
        System.out.println("Я иду");
    }
    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }


    // Переопределение метода toString

    @Override
    public String toString() {
        if (age == 1) {
            return "Привет!" +
                    " меня зовут " + name +
                    ", мне  " + age + " год, " +
                    "я вешу " + weight + " кг, " +
                    "мой цвет " + color;
        }
        if ((age == 2)|(age == 3)|(age == 4)) {
            return "Привет!" +
                    " меня зовут " + name +
                    ", мне  " + age + " годa, " +
                    "я вешу " + weight + " кг, " +
                    "мой цвет " + color;
        }
        if (age >= 5) {
            return "Привет!" +
                    " меня зовут " + name +
                    ", мне  " + age + " лет, " +
                    "я вешу " + weight + " кг, " +
                    "мой цвет " + color;
        }
        return null;
    }
}
