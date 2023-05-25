//displays the concept of overriding
class  Shapes{

    void display(){
        System.out.println("Im in parent class");
    }
}
 class Circle extends Shapes{
    @Override //this means that this method overrides the parent method
    void display(){
        System.out.println("Im in  circle subclass");
    }
}
class Square extends Shapes{
    void display(){
        System.out.println("Im in square sub class");
    }
}
public class Polymorph2 {
    public static void main(String[] args) {
        Circle obj = new Circle();
       // obj.display();
        Shapes obj2 = new Circle();
        obj2.display();

    }
}
