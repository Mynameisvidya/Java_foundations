public class Operators {

    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a % b);

        // Relational Operators
        System.out.println(a > b);
        System.out.println(a == b);

        // Logical Operators
        boolean result = (a > b) && (b > 1);
        System.out.println(result);

        // Unary Operators
        int count = 5;
        count++;
        System.out.println(count);
    }
}
