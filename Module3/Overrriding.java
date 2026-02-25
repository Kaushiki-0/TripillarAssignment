class Animal {
    public void sound() {
        System.out.println("sound");
    }
    public void eat() {
        System.out.println("food");
    }
    public void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class Overrriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.eat("meat");
        Animal d = new Dog();
        d.sound();
    }
}
