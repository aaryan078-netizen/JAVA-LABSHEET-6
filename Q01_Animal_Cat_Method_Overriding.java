class Animal {
    public void makeSound() { System.out.println("Animal makes a sound"); }
}
class Cat extends Animal {
    @Override
    public void makeSound() { System.out.println("Cat barks"); }
}
public class Q01_Animal_Cat_Method_Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
