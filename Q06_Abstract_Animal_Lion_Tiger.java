abstract class Animal {
    public abstract void sound();
}
class Lion extends Animal {
    @Override public void sound() { System.out.println("Lion roars"); }
}
class Tiger extends Animal {
    @Override public void sound() { System.out.println("Tiger growls"); }
}
public class Q06_Abstract_Animal_Lion_Tiger {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}
