package inheritance;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Box_ex b1 = new Box_ex();
        Box_ex b2 = new Box_ex(2,4,6);
        BoxWeight b3 = new BoxWeight(2,3,4,5);
        BoxWeight b4 = new BoxWeight();
//        b1.volume();
//        b2.volume();
//        b3.printFunc();
        System.out.println(b4.weight);
        b3.printfunc2();
        //int var = b2.l;
    }
}
