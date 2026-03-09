abstract class Shape{
    
    abstract void area();
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    void area(){
        System.out.println("Area:"+3.14*radius*radius);
    }
    
}
class Rectangle extends Shape{
    int length,width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    void area(){
        System.out.println("Area:"+length*width);
    }
}
class Ques1{
    public static void main(String[] args){
        Circle c = new Circle(2);
        c.area();
        Rectangle r= new Rectangle(2,3);
        r.area();
    }
}