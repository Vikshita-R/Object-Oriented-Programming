package inheritance;

public class BoxWeight  extends Box_ex {
    protected int weight;
    BoxWeight(){
       this.weight = 1;
    }
    BoxWeight(int l1, int w1, int h1, int weight){
        super(l1,w1,h1);//super keyword is used to initialise the instance variables of the main/parent class
        this.weight = weight;
    }

    public void printFunc(){
        System.out.println(this.weight);
    }
    public void printfunc2(){
        super.printfunc1();
        System.out.println("Namaskar");
    }
}
