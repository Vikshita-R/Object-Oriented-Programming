package multilevel;

public class B extends A {
    String color;
    B(int w, int e, int c, String n,String color){
        super(w, e, c, n);
        this.color = color;
    }

    public void display(){
        super.display();
        System.out.println("color of car is " + this.color);
    }
}
