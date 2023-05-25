package inheritance;

public class Box_ex {
    int l;
    int w;
    int h;

    Box_ex(){
        l = 1;
        w = 1;
        h = 1;
    }

    Box_ex(int l, int w, int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public void volume(){
        System.out.println("Volume of box is : " + (l * w * h) );
    }
    public void printfunc1(){
        System.out.println("HElLO");
    }

}

