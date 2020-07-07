import java.util.Scanner;

/**
 * @program: day04->Demo01
 * @description: 数组
 * @author:
 * @create: 2020-02-05 09:27
 **/
public class Demo01 {
    public static void main(String[] args) {
/*//        //1.声明数组
//        int [] a;
//        //2.分配空间
//        a =new int [5];
        //第一步和第二步可以合并成一步
        int [] a =new  int[5];
        //3.赋值
        a[0]=10;
        //4.处理数据
        a[0]=a[0]*10;
        System.out.println(a[0]);*/

        double[] values = new double[5];
        int i;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        for(i=0; i<5; i++){
            System.out.print("请输入第" + (i+1) + "笔购物金额：");
            values[i] = input.nextDouble();
            sum += values[i];
        }

        System.out.println("序号\t\t金额(元)");
        for(i=0; i<5; i++){
            System.out.println((i+1) + "\t\t" + values[i]);
        }
        System.out.println("总金额\t\t" + sum);
    }
}
