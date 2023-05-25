package RecursionEx;

public class Recursion01 {

    static void printNum(int n) {
        if(n == 3){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    public static void main(String[] args) {
        printNum(1);
    }
}
