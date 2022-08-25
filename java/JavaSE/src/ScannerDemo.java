import java.util.Scanner;

public class ScannerDemo {
    public static void main(String []args){
        //定義接收數據
        Scanner s = new Scanner(System.in);
        System.out.println("使用next接收單行輸入");
        //hasNextLine()；nextLine()：為行輸入，可以接收空格
        if(s.hasNext()){
            String str = s.next();//next()不能接收空格和回車
            System.out.println("輸入內容為"+str);
        }
        //記得關閉
        s.close();
    }
}
