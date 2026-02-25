class Area{
    void area(double r){
        double area = 3.14*r*r;
        System.out.println("area of circle is "+ area);
    }
    void area(int a){
        int area = a*a;
        System.out.println("Area of square is "+ area);
    }
}
class Overloading{
    public static void main(String[] args ){
        Area s1 = new Area();
        s1.area(3.2);
        s1.area(3);

        
    }
}