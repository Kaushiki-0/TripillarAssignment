class Animal{
    String voice;
    Animal(String voice){
        this.voice=voice;
    }
}
    class Dog extends Animal{
        String color;
    Dog(String voice,String color){
        super(voice);
        this.color=color;
    }
    void display(){
        System.out.println("details "+voice+" "+color);
    }
    }
 class SingleIn{
    public static void main(String[] args){
        Dog d = new Dog ("barks","black");
        d.display();
    }
}