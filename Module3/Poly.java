class Shape{
    void sh(){
        System.out.println("Shape details");
    }
}
class Circle extends Shape{
    void sh(){
        System.out.println("circle");
    }
}
class Rectangle extends Shape{
    void sh(){
        System.out.println("Ractangle");
    }
}
public class Poly{
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.sh();
        s2.sh();
    }
}