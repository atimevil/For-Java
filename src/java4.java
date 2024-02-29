public class java4 {
    public static void main(String[] args) {
        long result = Math.round(3.645678);
        System.out.println("result = " + result);

        double pi = 3.141592;
        double shortpi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortpi);

        double pi2 = 3.141592;
        System.out.println("(int)pi2 * 1000 = " + (int)(pi2 * 1000));
        System.out.println("(int)pi2 * 1000.0 / 1000.0 = " + (int)(pi2 * 1000.0 / 1000.0));

        double num = 3.14;

        System.out.println("반올림 : " + Math.round(num));
        System.out.println("올림 : " + Math.ceil(num));
        System.out.println("내림 : " + Math.floor(num));
        System.out.println("절대값 : " + Math.abs(num));
    }
}
