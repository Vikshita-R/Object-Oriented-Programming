package RecursionEx;

public class Examples {

    static int fibonacci(int n){
        if(n < 2)
            return n;
        return fibonacci(n -1) + fibonacci(n - 2);
        //hence another variable like sum is not required
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

}
