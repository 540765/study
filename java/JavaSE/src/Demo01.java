import java.util.Scanner;

public class Demo01 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        Boolean end = false;
        //循環
        while (!end){
            System.out.println("==========計算器開始============");
            System.out.println("請輸入第一個數");
            double a = s.nextDouble();

            System.out.println("請輸入：+ - * %");
            String operator = s.next();

            System.out.println("請輸入第二個數");
            double b = s.nextDouble();

            switch (operator){
                case "+":
                    System.out.println("結果是"+add(a,b));
                    break;
                case "-":
                    System.out.println("結果是"+subtract(a,b));
                    break;
                case "*":
                    System.out.println("結果是"+multiply(a,b));
                    break;
                case "%":
                    System.out.println("結果是"+divide(a,b));
                    break;
                default:
                    System.out.println("輸入符號有誤");
                    break;
            }
        }
    }

    public static double add(double a,double b){
        return a+b;
    }

    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a,double b){
        return a%b;
    }
}
