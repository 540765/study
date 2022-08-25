public class Operation {
    public static void main(String []args){
        int a = 10;
        int b = 20;
        int c = 20;
        int d = 20;
        int e = 20;
        long f = 1212121212121212l;
        short g = 123;
        byte h = 8;
        int i = 3;
        int k = i++;
        int l = ++i;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//向下取整變0
        System.out.println(a+f+g+h);//有long時結果會變成long，否則變成int
        System.out.println(a+g+h);//結果變成int
        System.out.println(g+h);//結果變成int
        System.out.println(k);//結果變成int
        System.out.println(l);//結果變成int

        /*
        A = 0011 1100;
        B = 0000 1101;
        ------------------
      A&B = 0000 1100
      A|B = 0011 1101
      A^B = 0011 0001
       ~B = 1111 0010

        * */
    }
}
