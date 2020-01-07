package Interface_Generics;

public class Dog implements IAnimal {

    @Override
    public void animalSound() {
        System.out.println("Bark bark");
    }

    @Override
    public void run() {
        System.out.println("I run now.");
    }

}
