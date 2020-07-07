import java.util.Scanner;

/**
 * @program: day04->Demo03
 * @description: 变声明边赋值
 * @author:
 * @create: 2020-02-05 10:17
 **/
public class Demo03 {
    public static void main(String[] args) {
        //边声明边赋值
        int[] score ={8,4,2,1,23,344,12};
        //总数
        int sum=0;

        for (int i = 0; i < score.length; i++) {
            //累加值
            sum+=score[i];
            //键盘输入
            Scanner  input=new Scanner(System.in);
            int q=input.nextInt();
            if(q==score[i]){
                System.out.println("存在");
            }else{
                System.out.println("不存在");
            }
        }
        System.out.println("求和 " + sum);

    }
}
