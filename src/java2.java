public class java2 {   
    public static void main(String[] args) {
        int i = 65, num = 10;
        char ch = 'A';
        float f = 1.6f;
    
        System.out.println("(char)i = " + (char)i);
        System.out.println("(int)ch = " + (int)ch);
        System.out.println("(int)f = " + (int)f);
        System.out.println("(float)num = " + (float)num);
        
        i = (int)3.14f;
        System.out.println("i = " + i);
        
        byte b = 100;
        System.out.println("b = " + b);

        num = 100;
        byte b2 = (byte)num;
        System.out.println("b2 = " + b2);

        byte b3 = (byte)1000;
        System.out.println("b3 = " + b3);
    }
}
