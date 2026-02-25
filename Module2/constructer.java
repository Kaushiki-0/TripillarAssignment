class Student{
    String name;
    int roll;
    public Student(){
        this.name ="ABC";
        this.roll = 12;

    }
    public Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void display(){
        System.out.println("Name: "+name+" Roll:"+roll);
    }
}
public class constructer{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("XYZ",20);
        s1.display();
        s2.display();
    }
}