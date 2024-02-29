public class java1 {
    public static void main(String[] args){
                int k = 0, j = 3;
                System.out.println("k = 0, j = " + j);
        
                // 후위 형
                k = j++;
                System.out.println("k = j++;, k = " + k);
                System.out.println("k = j++;, j = " + j);
                // 다르게 표현 가능
        //        k = j;
        //        j++;
        //        System.out.println("k = j++;, k = " + k);
        //        System.out.println("k = j++;, j = " + j);
        
                // 값 초기화
                k = 0;
                j = 3;
        
                // 전위 형
                k = ++j;
                System.out.println("k = ++j;, k = " + k);
                System.out.println("k = ++j;, j = " + j);
                // 다르게 표현 가능
        //        ++j;
        //        k = j;
        //        System.out.println("k = ++j;, k = " + k);
        //        System.out.println("k = ++j;, j = " + j);
                int i = -10;
                i = +i;
                System.out.println("i = +i; = " + i);
                i = -10;
                i = -i;
                System.out.println("i = -i; = " + i);
    }
}