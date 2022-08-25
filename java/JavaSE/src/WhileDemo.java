public class WhileDemo {
    public static void main(String [] args){
//        int i1 = 0;
//        int sum = 0;
//        while (i1<=100){
//            sum = sum+i1;
//            i1++;
//        }
//        System.out.println(sum);
//
//        int oddSum = 0;
//        int evenSum = 0;
//
//        for(int i = 0;i<=100;i++){
//            if(i % 2 != 0){
//                oddSum+=i;
//            }else{
//                evenSum+=i;
//            }
//        }

//        System.out.println("奇数和"+oddSum);
//        System.out.println("偶数和"+evenSum);

//        for(int i3=0;i3<=1000;i3++){
//            if(i3%5==0){
//                System.out.println(i3);
//            }
//            if(i3%(5*3)==0) {
//                System.out.print("\n");
//            }
//        }

        for(int a = 1;a<=9;a++){
            for(int b =1;b<=a;b++){
                System.out.print(a+"*"+b+"="+a*b+"\t");
            }
            System.out.print("\n");
        }
    }
}
