public class Variable {

    /**
     * - 局部變量：必須聲明和初始化，局部方法特有。
     * - 實例變量：從屬於類（位於類中），也稱實例變量，如果不進行初始化，系統會賦予默認值。
     * - 類變量：寫在類裡，加上類似`static`修飾符。
     */
    //修飾符不存在先後
    static final double PI = 3.14;
    public static void main(String []args){
        System.out.println(PI);
    }
}
