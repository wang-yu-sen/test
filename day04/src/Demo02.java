import java.util.Scanner;

/**
 * @program: day04->Demo02
 * @description: 数组
 * @author:
 * @create: 2020-02-05 10:03
 **/
public class Demo02 {
    public static void main(String[] args) {
        //声明变量
        double[] price = new double[4];
        double ss;
        //循环给数组赋值
        System.out.println("请一次录入4个手机价格：");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 4;i++){
            price[i] = input.nextDouble();//赋值
        }
        //计算价格最小值
        ss = price[0];
        for(int index = 0;index < 4;index++){
            if(price[index] < ss){
                ss = price[index];
            }
        }
         //显示最小值
        System.out.println("4个手机价格中最低的是："+ss);
    }
}
