package HW_1;

public class Duck extends Animal implements Flyting {
    public Duck() {
    }

    @Override
    public void fly() {

        System.out.println("Я лечу");
    }
   @Override
    public void say(){
        System.out.println("Кря");
    }

}
