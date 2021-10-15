import java.util.Scanner;//导包
public class level12 {
    public static void main(String[] args) {
        /*键盘输入成绩*/
        /* a为平时成绩 b为期中成绩 c为期末成绩*/
        Scanner in = new Scanner(System.in);
        String str="";
        do {
            System.out.println("请输入平时成绩");
            double a = in.nextInt();
            System.out.println("请输入期中成绩");
            double b = in.nextInt();
            System.out.println("请输入期末成绩");
            double c = in.nextInt();
            /* x为计算后平时成绩 y为计算后期中成绩 z为计算后期末成绩 */
            double x = a * 0.2;
            double y = b * 0.3;
            double z = c * 0.5;
            /*判断是否大于60*/
            double I = x + y + z;
            if (I <= 60) {
                System.out.println("勇敢俊枭，不怕困难!");
            } else if (I >= 60) {
                System.out.println("就这，还没我卷");
            }
            /*询问情况*/
            System.out.println("是否要再玩一局 YES/NO");
            str =in.next();
        } while (str.equals("YES"));


    }

}

