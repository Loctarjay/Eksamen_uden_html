package OOP.Poly;

public class AnimalZoo {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

    }

}
