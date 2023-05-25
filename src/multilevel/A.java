package multilevel;

import inheritance.Box_ex;

public class A  {
    int wheels;
    int engine;
    int capacity;
    String type;

    A(){
        wheels = 4;
        engine = 2;
        capacity = 4;
    }
    public A(int w, int e, int c, String n){
        this.wheels = w;
        this.engine = e;
        this.capacity = c;
        this.type = n;
    }

    public void display(){
        System.out.println("no of wheels " + this.wheels);
        System.out.println("engine : " + this.engine);
        System.out.println("capacity " + this.capacity);
        System.out.println("type of car " + this.type);
    }
}
