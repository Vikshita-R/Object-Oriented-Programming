public class PolymorphismEx {
    public double add(double a, int b){
       return  (a + b);
    }

    public int add(int a, int b){
        return (a + b);
    }
    public int add(int a, int b, int c){
        return (a + b + c);
    }

    public static void main(String[] args) {
        PolymorphismEx obj = new PolymorphismEx();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(1, 2,4));
       // System.out.println(obj.add(2.0, 3.0));//cannot bcoz it cannot do implicit type casting

    }
}
