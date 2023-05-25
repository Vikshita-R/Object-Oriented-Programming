package interfacesEx;

public class Child2 implements Mom, Dad {

    @Override
    public void digits() {
        System.out.println("I am child 2");
        System.out.println("color of skin : " + Dad.color);
        System.out.println("blood group is " + Mom.bloodGroup);
    }
}
