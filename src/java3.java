public class java3 {
    public static void main(String[] args) {
        int a = 10, b= 4;
        
        System.out.print("a + b = ");
        System.out.println(a + b);

        System.out.print("a - b = ");
        System.out.println(a - b);

        System.out.print("a * b = ");
        System.out.println(a * b);

        //나눗셈 * 소수점 이하는 버려진다.
        System.out.print("a / b = ");
        System.out.println(a / b);

        // 10 / 4.0 f = 2.5
        System.out.print("a / (float) b = ");
        System.out.println(a / (float) b);

        System.out.println("a % b = " + (a % b));
        int n = 3;
        int m = -3;

        System.out.println("a % n = " + (a % n));
        System.out.println("a % m = " + (a % m));

        char ch = '2';

        System.out.print("ch - '0' = ");
        System.out.println(ch - '0');

        a = 1_000_000;
        b = 2_000_000;

        long l = (long)a + b;
        // long * int = long * long 
        System.out.println("l = " + l);

    }
}
