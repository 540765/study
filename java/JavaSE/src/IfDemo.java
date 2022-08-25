import java.util.Scanner;

public class IfDemo {
    public static void main(String []args){
        //选择结构
        Scanner s = new Scanner(System.in);

        System.out.println("请输入");
        String v = s.nextLine();

        //.equals判断字符串是否相等
        if(v.equals("1")){
            System.out.println("你输入了1");
        }
        System.out.println("输入"+v);
        s.close();
    }
}
