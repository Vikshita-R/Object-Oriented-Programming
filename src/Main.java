import packageA.classA;
import mathfunctions.*;
import inheritance.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Namaskar");
        classA obj = new classA();
        obj.greeting();

        packageA.classA obj = new classA();
        obj.greeting();
         */

        Tools obj = new Tools();
        obj.square(5);
        obj.cube(5);
        screws obj1 = new screws();
        obj1.count(5);

        Box_ex b1 = new Box_ex();
        Box_ex b2 = new Box_ex(2,4,6);
        b1.volume();
        b2.volume();


    }
}