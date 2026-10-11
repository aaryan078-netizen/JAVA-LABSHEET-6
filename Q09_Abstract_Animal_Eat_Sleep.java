abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}
class Lion extends Animal {
    @Override public void eat() { System.out.println("Lion eats meat"); }
    @Override public void sleep() { System.out.println("Lion rests in its territory"); }
}
class Tiger extends Animal {
    @Override public void eat() { System.out.println("Tiger hunts and eats meat"); }
    @Override public void sleep() { System.out.println("Tiger sleeps in a sheltered spot"); }
}
class Deer extends Animal {
    @Override public void eat() { System.out.println("Deer eats grass and leaves"); }
    @Override public void sleep() { System.out.println("Deer rests while staying alert"); }
}
public class Q09_Abstract_Animal_Eat_Sleep {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Tiger(), new Deer()};
        for (Animal animal : animals) { animal.eat(); animal.sleep(); }
    }
}
