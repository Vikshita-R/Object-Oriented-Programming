import java.util.ArrayList;

class Ex{
    private int a;
    public int getA(){
        return a;
    }
    public void setA(int a2){
        this.a = a2;
    }
    Ex(int n){
        this.a = n;
    }

}
public class Main02 {
    public static void main(String[] args) {
        Ex obj = new Ex(15);int result1, result2;
        result1 = obj.getA();
        //result2 = obj.setA(2);
        System.out.println(result1);
        ArrayList obj1 = new ArrayList();

    }
}
/*
public int getA{
return a;
}
public void setA(int num){
this.a = nu
 */