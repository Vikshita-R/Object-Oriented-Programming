package interfacesEx;

//import static interfacesEx.Mom.color;

public class Child1 implements Mom, Dad{
    @Override
    public void digits() {
        System.out.println("I am child 1");
        System.out.println("color of skin : " + Mom.color);
        System.out.println("blood group is " + Dad.bloodGroup);
    }
}
